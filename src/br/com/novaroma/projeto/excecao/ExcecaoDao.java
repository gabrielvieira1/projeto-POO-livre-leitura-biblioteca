package br.com.novaroma.projeto.excecao;

import br.com.novaroma.projeto.util.Msg;

public class ExcecaoDao extends Exception {

	private static final long serialVersionUID = 1L;

	public ExcecaoDao(String msg) {
		super(Msg.ERROR_DAO.getStr() + msg);
	}
}
