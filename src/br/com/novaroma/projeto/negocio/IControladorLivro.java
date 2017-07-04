package br.com.novaroma.projeto.negocio;

import br.com.novaroma.projeto.entidades.Devolucao;
import br.com.novaroma.projeto.entidades.Emprestimo;
import java.util.ArrayList;

import br.com.novaroma.projeto.entidades.Livro;
import br.com.novaroma.projeto.negocio.IControladorGenerico;

public interface IControladorLivro extends IControladorGenerico<Livro> {
	
        void emprestar(String idCliente, String nomeFuncionario, String idLivro) throws Exception;
        void devolver(String idCliente, String funcionario, String idLivro) throws Exception;
        ArrayList<Livro> buscarTodos(String busca) throws Exception;
        ArrayList<Emprestimo> listarEmprestimo() throws Exception;
        ArrayList<Devolucao> listarDevolucao() throws Exception;
        ArrayList buscarTodos(String busca, boolean identifica) throws Exception;
}
