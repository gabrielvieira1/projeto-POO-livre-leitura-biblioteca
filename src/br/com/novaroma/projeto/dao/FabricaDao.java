package br.com.novaroma.projeto.dao;


import br.com.novaroma.projeto.entidades.Entidade;

public class FabricaDao {

	public static <T extends Entidade> IDao<T> getInstanciaDao(Class<T> myClass) {
		return new DaoGenerico<T>(myClass);
	}
	
	
}
