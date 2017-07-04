package br.com.novaroma.projeto.entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Emprestimo extends Devolucao implements Serializable {

	private static final long serialVersionUID = 1L;

	public Emprestimo(String nome, String idCliente,  ArrayList<String> funcionario, ArrayList<String> livros,
			ArrayList<String> dataEmprestimos) {
		super(nome, idCliente, funcionario, livros, dataEmprestimos);
	}

	public Emprestimo(String nome, String idCliente,  String funcionario, String livros, String dataEmprestimos) {
		super(nome, idCliente, funcionario, livros, dataEmprestimos);
	}

	public Emprestimo() {
		super();
	}

}
