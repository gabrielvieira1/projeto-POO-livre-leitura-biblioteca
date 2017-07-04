package br.com.novaroma.projeto.util;


public enum Msg {

	 	VAZIO(""),
	
	    ERROR_DAO ("Erro de arquivo: não foi possível "),
	    ERROR_CONTROL("Erro de validações" ),
	    
	    ERROR_MSG(": não foi possível "),
	    ERROR("Erro"),
	    ERROR_LOOK_AND_FEEL("Não foi possível alterar o LookAndFeel" ),
	   
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
	    BUSCA_CODIGO("Digite aqui o CÓDIGO.."),
	    BUSCA("Digite o que deseja consultar.."),
	    FINALIZAR("Volte sempre!"),
	    LIVRE_LEITURA("LivreLeitura"),
	    LOGIN_EXISTENTE(": login já existe, tente novamente"),
	    CONFIRM("Deseja abrir a tela gerencial?"),
	   
	    ENTIDADE_NAO_EXISTE(": entidade inexistente"),
	    BUSCA_NAO_ENCONTRADA(": nenhum resultado encontrado para a sua pesquisa"),
	    ENTIDADE_EXISTENTE(": entidade já cadastrada"),
	    ENTRADA_INVALIDA(": entrada inválida"),
	    SEM_REGISTROS(": sem registros salvos"),
	    LOGIN_SENHA_INVALIDO(": login e senha inválidos, tente novamente!"),
	    CADASTRE_GR (" \n Apenas o LOGIN GERENCIAL pode cadastrar funcionários"),
	    LIMITE_EMPRESTIMO(": alcançou limite de empréstimos por pessoa (3 livros)"),
	    MULTA_EMPRESTIMO(": cliente possui multa"),
	    QUANTIDADE_EMPRESTIMO(": este livro só possui 1 quantidade neste momento"),
	    CREDENCIAIS("Erro de crendenciais"),
	    LIMITE_CARACTERE("Limite de caractere atingido!"),
	    ESPECIFICAR_QTT("Especifique a quantidade!"),
	    EXISTE("Existe"),
	    NAO_CONTEM("Não contém"),
	    CONTEM("contém"),
	    
	    INVALIDO_EMPRESTIMO("\n- EMPRÉSTIMO"),
	    INVALIDO_NOME("\n- Nome incorreto"),
	    INVALIDO_SOBRENOME("\n- Sobrenome incorreto"),
	    INVALIDO_TEL("\n- Nº telefone incorreto"),
	    INVALIDO_IDADE("\n- Idade deve ser entre 15 à 115 anos"),
	    INVALIDO_CPF("\n- Nº CPF não existe"),
	    INVALIDO_RUA("\n- Rua incorreta"),
	    INVALIDO_BAIRRO("\n- Bairro incorreto"),
	    INVALIDO_CEP("\n- CEP inválido"),
	    INVALIDO_NUM("\n- Número incorreto"),
	    INVALIDO_CLASS("\n- A classifição deve ser: A - LIVRO; B - REVISTA"),
	    INVALIDO_CODIGO("\n- Código incorreto"),
	    INVALIDO_EDICAO("\n- Edição incorreta"),
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
