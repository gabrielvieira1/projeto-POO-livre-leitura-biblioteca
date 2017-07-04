package br.com.novaroma.projeto.excecao;

import br.com.novaroma.projeto.util.Msg;

public class ExcecaoNegocio extends Exception {

	private static final long serialVersionUID = 1L;

	public ExcecaoNegocio(String msg) {
		super(Msg.ERROR_CONTROL.getStr() + msg);
	}

}
