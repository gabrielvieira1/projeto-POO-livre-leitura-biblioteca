package br.com.novaroma.projeto.util;


public enum Msg {

	 	VAZIO(""),
	
	    ERROR_DAO ("Erro de arquivo: n�o foi poss�vel "),
	    ERROR_CONTROL("Erro de valida��es" ),
	    
	    ERROR_MSG(": n�o foi poss�vel "),
	    ERROR("Erro"),
	    ERROR_LOOK_AND_FEEL("N�o foi poss�vel alterar o LookAndFeel" ),
	   
	    INSERIR("inserir"),
	    ATUALIZAR("atualizar"),
	    CONSULTAR("consultar"),
	    REMOVER("remover"),
	    LISTAR("listar" ),
	    BUSCAR("buscar"),
	    
	    CAMPO_VAZIO("O campo deve ser preenchido!"),
	    CAMPOS_VAZIOS("Os campos devem ser preenchidos!"),
	    ATUALIZADO("Cadastro atualizado com sucesso!"),
	    CADASTRADO("Cadastro realizado com sucesso!"),
	    EMPRESTADO("Emprestado com sucesso!"),
	    DEVOLVIVO("Devolvido com sucesso!"),
	    REMOVIDO("Removido com sucesso!"),
	    BUSCA_CPF("Digite aqui o CPF.."),
	    BUSCA_CODIGO("Digite aqui o C�DIGO.."),
	    BUSCA("Digite o que deseja consultar.."),
	    FINALIZAR("Volte sempre!"),
	    LIVRE_LEITURA("LivreLeitura"),
	    LOGIN_EXISTENTE(": login j� existe, tente novamente"),
	    CONFIRM("Deseja abrir a tela gerencial?"),
	   
	    ENTIDADE_NAO_EXISTE(": entidade inexistente"),
	    BUSCA_NAO_ENCONTRADA(": nenhum resultado encontrado para a sua pesquisa"),
	    ENTIDADE_EXISTENTE(": entidade j� cadastrada"),
	    ENTRADA_INVALIDA(": entrada inv�lida"),
	    SEM_REGISTROS(": sem registros salvos"),
	    LOGIN_SENHA_INVALIDO(": login e senha inv�lidos, tente novamente!"),
	    CADASTRE_GR (" \n Apenas o LOGIN GERENCIAL pode cadastrar funcion�rios"),
	    LIMITE_EMPRESTIMO(": alcan�ou limite de empr�stimos por pessoa (3 livros)"),
	    MULTA_EMPRESTIMO(": cliente possui multa"),
	    QUANTIDADE_EMPRESTIMO(": este livro s� possui 1 quantidade neste momento"),
	    CREDENCIAIS("Erro de crendenciais"),
	    LIMITE_CARACTERE("Limite de caractere atingido!"),
	    ESPECIFICAR_QTT("Especifique a quantidade!"),
	    EXISTE("Existe"),
	    NAO_CONTEM("N�o cont�m"),
	    CONTEM("cont�m"),
	    
	    INVALIDO_EMPRESTIMO("\n- EMPR�STIMO"),
	    INVALIDO_NOME("\n- Nome incorreto"),
	    INVALIDO_SOBRENOME("\n- Sobrenome incorreto"),
	    INVALIDO_TEL("\n- N� telefone incorreto"),
	    INVALIDO_IDADE("\n- Idade deve ser entre 15 � 115 anos"),
	    INVALIDO_CPF("\n- N� CPF n�o existe"),
	    INVALIDO_RUA("\n- Rua incorreta"),
	    INVALIDO_BAIRRO("\n- Bairro incorreto"),
	    INVALIDO_CEP("\n- CEP inv�lido"),
	    INVALIDO_NUM("\n- N�mero incorreto"),
	    INVALIDO_CLASS("\n- A classifi��o deve ser: A - LIVRO; B - REVISTA"),
	    INVALIDO_CODIGO("\n- C�digo incorreto"),
	    INVALIDO_EDICAO("\n- Edi��o incorreta"),
	    INVALIDO_EDITORA("\n- Editora"),
	    INVALIDO_AUTOR("\n- Autor"),
	    INVALIDO_VOLUME("\n- Volume"),
	    INVALIDO_TOMBO ("\n- Tombo"),
	    INVALIDO_MARCA ("\n- Marca"),
	    INVALIDO_IDCLIENTE ("\n- CLIENTE"),
	    INVALIDO_IDLIVRO ("\n- LIVRO");
		
	
		private String str;
		
		Msg (String str) {
			this.str = str;
		}
		
		public String getStr(){
			return str;
		}
		
		public void setStr(String str) {
			this.str = str;
		}
		
		
}
