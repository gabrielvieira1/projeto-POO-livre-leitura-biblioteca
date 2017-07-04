package br.com.novaroma.projeto.negocio;

import br.com.novaroma.projeto.entidades.Entidade;
import br.com.novaroma.projeto.excecao.ExcecaoDao;
import br.com.novaroma.projeto.excecao.ExcecaoNegocio;

import java.util.ArrayList;

public interface IControladorGenerico<T extends Entidade> {

    void inserir(T entidade) throws ExcecaoNegocio, ExcecaoDao;
    void atualizar(T entidade) throws ExcecaoNegocio, ExcecaoDao;
    T consultar(String id) throws ExcecaoNegocio, ExcecaoDao;
    void remover(String id) throws ExcecaoNegocio, ExcecaoDao;
    ArrayList<T> listar() throws ExcecaoNegocio, ExcecaoDao;
    ArrayList<T> buscarTodos(String busca) throws ExcecaoNegocio, ExcecaoDao, Exception;

}
