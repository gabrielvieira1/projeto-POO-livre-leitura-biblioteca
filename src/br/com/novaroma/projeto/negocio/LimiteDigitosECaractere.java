package br.com.novaroma.projeto.negocio;


import br.com.novaroma.projeto.excecao.ExcecaoEntradaInvalida;
import br.com.novaroma.projeto.util.Msg;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.PlainDocument;

public class LimiteDigitosECaractere extends PlainDocument {

	private static final long serialVersionUID = 1L;
	private int quantidadeMax = 0;

	public LimiteDigitosECaractere(int maxLen) throws ExcecaoEntradaInvalida {
		super();
		if (maxLen <= 0) {
			throw new ExcecaoEntradaInvalida(Msg.ESPECIFICAR_QTT.getStr());
		}
		quantidadeMax = maxLen;
	}

	@Override
	public void insertString(int offSet, String str, AttributeSet attr) {
		try {
			if (str == null || getLength() == quantidadeMax) {
				return;
			}
			int totalQuantia = (getLength() + str.length());
			if (totalQuantia <= quantidadeMax) {
				super.insertString(offSet, str.replaceAll("[^0-9]", ""), attr);
				return;
			}
			String nova = str.substring(0, getLength() - quantidadeMax);
			super.insertString(offSet, nova, attr);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, Msg.LIMITE_CARACTERE.getStr());
		}

	}

}
