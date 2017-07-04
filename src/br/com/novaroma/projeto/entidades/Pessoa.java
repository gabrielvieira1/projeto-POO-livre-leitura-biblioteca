package br.com.novaroma.projeto.entidades;

import java.io.Serializable;

public abstract class Pessoa extends Entidade implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;
	private int idade;
	private String cpf;
	private String telefone;
	private Endereco endereco;

	public Pessoa() {
	}

	public Pessoa(String nome, String sobrenome, int idade, String cpf,
			String telefone, Endereco endereco) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String getId() {
		return this.cpf;
	}

}
