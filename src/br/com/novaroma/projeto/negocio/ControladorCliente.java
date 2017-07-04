package br.com.novaroma.projeto.negocio;

import java.util.ArrayList;

import br.com.novaroma.projeto.dao.FabricaDao;
import br.com.novaroma.projeto.dao.IDao;
import br.com.novaroma.projeto.entidades.Cliente;
import br.com.novaroma.projeto.entidades.Endereco;
import br.com.novaroma.projeto.negocio.IControladorCliente;
import br.com.novaroma.projeto.negocio.ValidacoesDeEntradas;
import br.com.novaroma.projeto.util.Msg;
import br.com.novaroma.projeto.excecao.ExcecaoDao;
import br.com.novaroma.projeto.excecao.ExcecaoNegocio;

public class ControladorCliente implements IControladorCliente {

	public ControladorCliente() {
	}

	@Override
	public void inserir(Cliente cliente) throws ExcecaoNegocio, ExcecaoDao {

		if (!verificarValidacoesEntrada(cliente)) {
			throw new ExcecaoNegocio(Msg.ENTRADA_INVALIDA.getStr() + msgExcecaoEntradaInvalida(cliente));
		}

		IDao<Cliente> dao = FabricaDao.getInstanciaDao(Cliente.class);
		if (dao.exists(cliente.getId())) {
			throw new ExcecaoNegocio(Msg.ENTIDADE_EXISTENTE.getStr());
		}
		
		dao.inserir(cliente);
	}

	@Override
	public void atualizar(Cliente cliente) throws ExcecaoNegocio, ExcecaoDao {

		if (!verificarValidacoesEntrada(cliente)) {
			throw new ExcecaoNegocio(Msg.ENTRADA_INVALIDA.getStr() + msgExcecaoEntradaInvalida(cliente));
		}
		
		IDao<Cliente> dao = FabricaDao.getInstanciaDao(Cliente.class);
		if (!dao.exists(cliente.getId())) {
			throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
		}
		
		dao.atualizar(cliente);
		
	}

	@Override
	public void remover(String id) throws ExcecaoNegocio, ExcecaoDao {

		IDao<Cliente> dao = FabricaDao.getInstanciaDao(Cliente.class);
		if (!dao.exists(id)) {
			throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
		}
		
		dao.remover(id);
	}

	@Override
	public Cliente consultar(String id) throws ExcecaoNegocio, ExcecaoDao {
		IDao<Cliente> dao = FabricaDao.getInstanciaDao(Cliente.class);

		if (!dao.exists(id)) {
			throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
		}
		
		return dao.consultar(id);
	}

	@Override
	public ArrayList<Cliente> listar() throws ExcecaoNegocio, ExcecaoDao {
		IDao<Cliente> dao = FabricaDao.getInstanciaDao(Cliente.class);

		if (!dao.isValid()) {
			throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
		}

		return dao.listar();
	}

	@Override
	public ArrayList<Cliente> buscarTodos(String busca) throws ExcecaoDao, ExcecaoNegocio {
		
		
		IDao<Cliente> dao = FabricaDao.getInstanciaDao(Cliente.class);
		if (!dao.isValid()) {
			throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
		}
		
		ArrayList<Cliente> listCliente =  dao.listar();
		ArrayList<Cliente> list = new ArrayList<Cliente>();
		for(Cliente c : listCliente) {
				if (String.valueOf(c.getContadorLivro()).equalsIgnoreCase(busca)
						|| c.getCpf().equalsIgnoreCase(busca)
						|| String.valueOf(c.getIdade()).equalsIgnoreCase(busca)
						|| c.getNome().equalsIgnoreCase(busca)
						|| c.getSobrenome().equalsIgnoreCase(busca)
						|| c.getTelefone().equalsIgnoreCase(busca)
						|| c.getEndereco().getBairro().equalsIgnoreCase(busca)
						|| c.getEndereco().getCep().equalsIgnoreCase(busca)
						|| c.getEndereco().getComplemento().equalsIgnoreCase(busca)
						|| String.valueOf(c.getEndereco().getNumero()).equalsIgnoreCase(busca)
						|| c.getEndereco().getRua().equalsIgnoreCase(busca)){
					list.add(c);
				}
		}

		if(list.isEmpty()){
			throw new ExcecaoNegocio(Msg.BUSCA_NAO_ENCONTRADA.getStr());
		}
		return list;
	}

	private boolean verificarValidacoesEntrada(Cliente cliente) {

		return (ValidacoesDeEntradas.validarString(cliente.getNome())
				&& ValidacoesDeEntradas.validarString(cliente.getSobrenome())
				&& ValidacoesDeEntradas.validarNumero(cliente.getTelefone())
				&& ValidacoesDeEntradas.validarIdade(cliente.getIdade())
				&& ValidacoesDeEntradas.validarCPF(cliente.getCpf())
				&& ValidacoesDeEntradas.validarString(cliente.getEndereco().getRua())
				&& ValidacoesDeEntradas.validarString(cliente.getEndereco().getBairro())
				&& ValidacoesDeEntradas.validarNumero(cliente.getEndereco().getCep())
				&& ValidacoesDeEntradas.validarNumeroInteiro(cliente.getEndereco().getNumero()));
	}
	

	private String msgExcecaoEntradaInvalida(Cliente cliente) {
		if (!ValidacoesDeEntradas.validarString(cliente.getNome())) {
			return Msg.INVALIDO_NOME.getStr();
		} else if (!ValidacoesDeEntradas.validarString(cliente.getSobrenome())) {
			return Msg.INVALIDO_SOBRENOME.getStr();
		} else if (!ValidacoesDeEntradas.validarNumero(cliente.getTelefone())) {
			return Msg.INVALIDO_TEL.getStr();
		} else if (!ValidacoesDeEntradas.validarIdade(cliente.getIdade())) {
			return Msg.INVALIDO_IDADE.getStr();
		} else if (!ValidacoesDeEntradas.validarCPF(cliente.getCpf())) {
			return Msg.INVALIDO_CPF.getStr();
		} else if (!ValidacoesDeEntradas.validarString(cliente.getEndereco().getRua())) {
			return Msg.INVALIDO_RUA.getStr();
		} else if (!ValidacoesDeEntradas.validarString(cliente.getEndereco().getBairro())) {
			return Msg.INVALIDO_BAIRRO.getStr();
		} else if (!ValidacoesDeEntradas.validarNumero(cliente.getEndereco().getCep())) {
			return Msg.INVALIDO_CEP.getStr();
		} else if (!ValidacoesDeEntradas.validarNumeroInteiro(cliente.getEndereco().getNumero())) {
			return Msg.INVALIDO_NUM.getStr();
		} else {
			return Msg.VAZIO.getStr();
		}
	}

}
