package br.com.novaroma.projeto.apresentacao;

import br.com.novaroma.projeto.apresentacao.telas.TelaLogin;
import br.com.novaroma.projeto.excecao.ExcecaoDao;

public class Apresentacao {

	public static void main(String[] args) throws ExcecaoDao {
	
		
		TelaLogin iniciarBiblioteca = new TelaLogin();
		iniciarBiblioteca.setVisible(true);

		
		
	}
}
