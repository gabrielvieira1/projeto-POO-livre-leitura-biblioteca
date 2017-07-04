package br.com.novaroma.projeto.dao;

import java.util.ArrayList;

import br.com.novaroma.projeto.excecao.ExcecaoDao;

public interface IDao<T> {

	void inserir(T entidade) throws ExcecaoDao;
	void atualizar(T entidade) throws ExcecaoDao;
	void remover(String id) throws ExcecaoDao;
	ArrayList<T> listar() throws ExcecaoDao;
	T consultar(String id) throws ExcecaoDao;
	boolean exists(String id);
	boolean isValid();

}
