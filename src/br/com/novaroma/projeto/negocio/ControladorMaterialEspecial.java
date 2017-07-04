package br.com.novaroma.projeto.negocio;

import java.util.ArrayList;

import br.com.novaroma.projeto.dao.FabricaDao;
import br.com.novaroma.projeto.dao.IDao;
import br.com.novaroma.projeto.entidades.Funcionario;
import br.com.novaroma.projeto.entidades.MaterialEspecial;
import br.com.novaroma.projeto.negocio.IControladorMaterialEspecial;
import br.com.novaroma.projeto.negocio.ValidacoesDeEntradas;
import br.com.novaroma.projeto.util.Msg;
import br.com.novaroma.projeto.excecao.ExcecaoDao;
import br.com.novaroma.projeto.excecao.ExcecaoNegocio;

public class ControladorMaterialEspecial implements IControladorMaterialEspecial {

    public ControladorMaterialEspecial() {
    }

    @Override
    public void inserir(MaterialEspecial materialEspecial) throws ExcecaoNegocio, ExcecaoDao {

        if (!verificarValidacoesEntrada(materialEspecial)) {
        	throw new ExcecaoNegocio(Msg.ENTRADA_INVALIDA.getStr() + msgExcecaoEntradaInvalida(materialEspecial));
    	}
        
        IDao<MaterialEspecial> dao = FabricaDao.getInstanciaDao(MaterialEspecial.class);

        if (dao.exists(materialEspecial.getCodigo())) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_EXISTENTE.getStr());
        }

        dao.inserir(materialEspecial);

    }

    @Override
    public void atualizar(MaterialEspecial materialEspecial) throws ExcecaoNegocio, ExcecaoDao {

        if (!verificarValidacoesEntrada(materialEspecial)) {
        	throw new ExcecaoNegocio(Msg.ENTRADA_INVALIDA.getStr() + msgExcecaoEntradaInvalida(materialEspecial));
        }

        IDao<MaterialEspecial> dao = FabricaDao.getInstanciaDao(MaterialEspecial.class);
        
        if (!dao.exists(materialEspecial.getId())) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
        }

        dao.atualizar(materialEspecial);
        
    }

    @Override
    public void remover(String id) throws ExcecaoNegocio, ExcecaoDao {
        IDao<MaterialEspecial> dao = FabricaDao.getInstanciaDao(MaterialEspecial.class);
        if (!dao.exists(id)) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
        }

        dao.remover(id);
        
    }

    @Override
    public MaterialEspecial consultar(String id)throws ExcecaoNegocio, ExcecaoDao {

        IDao<MaterialEspecial> dao = FabricaDao.getInstanciaDao(MaterialEspecial.class);
        if (!dao.exists(id)) {
            throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
        }
        
        return dao.consultar(id);
        
    }

    @Override
    public ArrayList<MaterialEspecial> listar() throws ExcecaoNegocio, ExcecaoDao {

        IDao<MaterialEspecial> dao = FabricaDao.getInstanciaDao(MaterialEspecial.class);

        if (!dao.isValid()) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
        }
        
        return dao.listar();
        
    }

    @Override
    public ArrayList<MaterialEspecial> buscarTodos(String busca) throws ExcecaoNegocio, ExcecaoDao {
        
    	IDao<MaterialEspecial> dao = FabricaDao.getInstanciaDao(MaterialEspecial.class);

        if (!dao.isValid()) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
        }

        ArrayList<MaterialEspecial> listMaterialEspecial = dao.listar();
        ArrayList<MaterialEspecial> list = new ArrayList<MaterialEspecial>();
        
        
		for (MaterialEspecial mE : listMaterialEspecial) {
			if (mE.getMarca().equalsIgnoreCase(busca)
                    || mE.getClassificacao().equalsIgnoreCase(busca)
                    || mE.getCodigo().equalsIgnoreCase(busca)
                    || String.valueOf(mE.getEdicao()).equalsIgnoreCase(busca)
                    || mE.getEditora().equalsIgnoreCase(busca)) {

				list.add(mE);
				
            }
		}

		if (list.isEmpty()) {
			throw new ExcecaoNegocio(Msg.BUSCA_NAO_ENCONTRADA.getStr());
		}
		return list;
        
    }

    private boolean verificarValidacoesEntrada(MaterialEspecial materialEspecial) {

        return (ValidacoesDeEntradas.validarClassificacao(materialEspecial.getClassificacao())
                && ValidacoesDeEntradas.validarNumero(materialEspecial.getCodigo())
                && ValidacoesDeEntradas.validarNumeroInteiro(materialEspecial.getEdicao())
                && ValidacoesDeEntradas.validarString(materialEspecial.getEditora())
                && ValidacoesDeEntradas.validarString(materialEspecial.getMarca()));

    }
    
    
    private String msgExcecaoEntradaInvalida (MaterialEspecial materialEspecial){
         if(!ValidacoesDeEntradas.validarClassificacao(materialEspecial.getClassificacao())){
            return Msg.INVALIDO_CLASS.getStr();
        }else if(!ValidacoesDeEntradas.validarNumero(materialEspecial.getCodigo())){
            return Msg.INVALIDO_CODIGO.getStr();
        }else if(!ValidacoesDeEntradas.validarNumeroInteiro(materialEspecial.getEdicao())){
             return Msg.INVALIDO_EDICAO.getStr();
        }else if(!ValidacoesDeEntradas.validarNumeroString(materialEspecial.getEditora())){
            return Msg.INVALIDO_EDITORA.getStr();
        }else if(!ValidacoesDeEntradas.validarString(materialEspecial.getMarca())){
            return Msg.INVALIDO_MARCA.getStr();
        }else{
            return Msg.VAZIO.getStr();
        }
    }

}
