
package br.com.novaroma.projeto.entidades;

public class Cliente extends Pessoa {

	private static final long serialVersionUID = 1L;
	private int contadorLivro;

	public Cliente() {
	}

	public Cliente(String nome, String sobrenome, int idade, String cpf, String telefone, Endereco endereco) {
		super(nome, sobrenome, idade, cpf, telefone, endereco);
		this.contadorLivro = 0;

	}
	
	public int getContadorLivro() {
		return contadorLivro;
	}

	public void setContadorLivro(int contadorLivro) {
		this.contadorLivro = contadorLivro;
	}

}
