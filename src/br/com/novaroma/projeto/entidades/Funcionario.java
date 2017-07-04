
package br.com.novaroma.projeto.entidades;

public class Funcionario extends Pessoa {
    
	private static final long serialVersionUID = 1L;
	private String login;
    private String senha;
    
    public Funcionario(){
        this("Gerente", "", 0, "", "", null, "livreleitura", "bibGW2015.2");
    }
            

    public Funcionario(String nome, String sobrenome, int idade, String cpf,
			String telefone, Endereco endereco, String login, String senha) {
		super(nome, sobrenome, idade, cpf, telefone, endereco);
		this.login = login;
                this.senha = senha;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
}