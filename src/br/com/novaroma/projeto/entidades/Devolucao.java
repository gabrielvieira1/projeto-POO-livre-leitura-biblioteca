package br.com.novaroma.projeto.entidades;

import java.io.Serializable;
import java.util.ArrayList;

public class Devolucao extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private ArrayList<String> nomeFuncionario;
	private ArrayList<String> livros;
	private ArrayList<String> dataEmprestimos;

	public Devolucao() {

	}

	public Devolucao(String nome, String idCliente, ArrayList<String> funcionario, ArrayList<String> livros,
			ArrayList<String> dataEmprestimos) {
		this.nome = nome;
		this.cpf = idCliente;
		this.nomeFuncionario = funcionario;
		this.livros = livros;
		this.dataEmprestimos = dataEmprestimos;
	}

	public Devolucao(String nome, String idCliente, String funcionario, String livros, String dataEmprestimo) {
		this.nome = nome;
		this.cpf = idCliente;
		this.nomeFuncionario = new ArrayList<String>();
		this.livros = new ArrayList<String>();
		this.dataEmprestimos = new ArrayList<String>();
		this.livros.add(livros);
		this.dataEmprestimos.add(dataEmprestimo);
		this.nomeFuncionario.add(funcionario);
	}

	public void setLivros(ArrayList<String> livros) {
		this.livros = livros;
	}

	public void setDataEmprestimos(ArrayList<String> dataEmprestimos) {
		this.dataEmprestimos = dataEmprestimos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<String> getLivros() {
		return livros;
	}

	public ArrayList<String> getDataEmprestimos() {
		return dataEmprestimos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(ArrayList<String> nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	@Override
	public String getId() {
		return this.cpf;
	}

}
