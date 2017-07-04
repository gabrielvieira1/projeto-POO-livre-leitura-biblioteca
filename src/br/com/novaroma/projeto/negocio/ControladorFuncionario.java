package br.com.novaroma.projeto.negocio;

import br.com.novaroma.projeto.dao.FabricaDao;
import br.com.novaroma.projeto.dao.IDao;
import br.com.novaroma.projeto.entidades.Cliente;
import br.com.novaroma.projeto.entidades.Funcionario;
import br.com.novaroma.projeto.negocio.IControladorFuncionario;
import br.com.novaroma.projeto.negocio.ValidacoesDeEntradas;
import br.com.novaroma.projeto.util.Msg;
import br.com.novaroma.projeto.excecao.ExcecaoDao;
import br.com.novaroma.projeto.excecao.ExcecaoNegocio;
import java.util.ArrayList;

public class ControladorFuncionario implements IControladorFuncionario {

	public ControladorFuncionario() {
	}

	@Override
	public void inserir(Funcionario funcionario) throws ExcecaoNegocio, ExcecaoDao {
		
		if (!verificarValidacoesEntrada(funcionario)) {
			throw new ExcecaoNegocio(Msg.ENTRADA_INVALIDA.getStr() + msgExcecaoEntradaInvalida(funcionario));
		}

		IDao<Funcionario> dao = FabricaDao.getInstanciaDao(Funcionario.class);
		if (dao.exists(funcionario.getId())) {
			throw new ExcecaoNegocio(Msg.ENTIDADE_EXISTENTE.getStr());
		}

		if (verificarExisteLogin(funcionario.getLogin(), funcionario.getCpf())) {
			throw new ExcecaoNegocio(Msg.LOGIN_EXISTENTE.getStr());
		}

		dao.inserir(funcionario);

	}

	@Override
	public void atualizar(Funcionario funcionario) throws ExcecaoNegocio, ExcecaoDao {

		if (!verificarValidacoesEntrada(funcionario)) {
			throw new ExcecaoNegocio(Msg.ENTRADA_INVALIDA.getStr() + msgExcecaoEntradaInvalida(funcionario));

		}
		IDao<Funcionario> dao = FabricaDao.getInstanciaDao(Funcionario.class);
		
		if (!dao.exists(funcionario.getId())) {
			throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
		}

		if (verificarExisteLogin(funcionario.getLogin(), funcionario.getCpf())) {
			throw new ExcecaoNegocio(Msg.LOGIN_EXISTENTE.getStr());
		}

		dao.atualizar(funcionario);

	}

	@Override
	public void remover(String id) throws ExcecaoNegocio, ExcecaoDao {

		IDao<Funcionario> dao = FabricaDao.getInstanciaDao(Funcionario.class);
		if (!dao.exists(id)) {
			throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
		}

		dao.remover(id);

	}

	@Override
	public Funcionario consultar(String id) throws ExcecaoNegocio, ExcecaoDao {
		IDao<Funcionario> dao = FabricaDao.getInstanciaDao(Funcionario.class);

		if (!dao.exists(id)) {
			throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
		}
		
		return dao.consultar(id);
	}

	@Override
	public ArrayList<Funcionario> listar() throws ExcecaoNegocio, ExcecaoDao {
		IDao<Funcionario> dao = FabricaDao.getInstanciaDao(Funcionario.class);

		if (!dao.isValid()) {
			throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
		}

		return dao.listar();

	}

	@Override
	public ArrayList<Funcionario> buscarTodos(String busca) throws ExcecaoNegocio, ExcecaoDao {

		IDao<Funcionario> dao = FabricaDao.getInstanciaDao(Funcionario.class);
		if (!dao.isValid()) {
			throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
		}

		ArrayList<Funcionario> listFuncionario = dao.listar();
		ArrayList<Funcionario> list = new ArrayList<Funcionario>();
		
		for (Funcionario f : listFuncionario) {
			if (f.getLogin().equalsIgnoreCase(busca) 
					|| f.getSenha().equalsIgnoreCase(busca)
					|| f.getCpf().equalsIgnoreCase(busca) 
					|| String.valueOf(f.getIdade()).equalsIgnoreCase(busca)
					|| f.getNome().equalsIgnoreCase(busca) 
					|| f.getSobrenome().equalsIgnoreCase(busca)
					|| f.getTelefone().equalsIgnoreCase(busca)) {

				list.add(f);
			}
		}
		
		if (list.isEmpty()) {
			throw new ExcecaoNegocio(Msg.BUSCA_NAO_ENCONTRADA.getStr());
		}

		return list;
	}

	@Override
	public Funcionario consultarLogin(String login, String senha) throws ExcecaoNegocio, ExcecaoDao {
		IDao<Funcionario> dao = FabricaDao.getInstanciaDao(Funcionario.class);

		if (!dao.isValid()) {
			throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr() + Msg.CADASTRE_GR.getStr());
		}
		
		ArrayList<Funcionario> listF = dao.listar();
		for (Funcionario f : listF) {
			if (f.getLogin().equals(login)) {
				if (f.getSenha().equals(senha)) {
					return f;
				}
			}
		}
		throw new ExcecaoNegocio(Msg.LOGIN_SENHA_INVALIDO.getStr());
	}
	
	
	private boolean verificarExisteLogin(String login, String cpf) throws ExcecaoDao {
		IDao<Funcionario> dao = FabricaDao.getInstanciaDao(Funcionario.class);

		ArrayList<Funcionario> listFuncionario;
		if (!dao.isValid()){
			return false;
		}
		
		listFuncionario = dao.listar();

		for (Funcionario f : listFuncionario) {
			if (f.getLogin().equals(login)) {
				if (!f.getCpf().equals(cpf)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean verificarValidacoesEntrada(Funcionario funcionario) {

		return (ValidacoesDeEntradas.validarString(funcionario.getNome())
				&& ValidacoesDeEntradas.validarString(funcionario.getSobrenome())
				&& ValidacoesDeEntradas.validarNumero(funcionario.getTelefone())
				&& ValidacoesDeEntradas.validarIdade(funcionario.getIdade())
				&& ValidacoesDeEntradas.validarCPF(funcionario.getCpf())
				&& ValidacoesDeEntradas.validarString(funcionario.getEndereco().getRua())
				&& ValidacoesDeEntradas.validarString(funcionario.getEndereco().getBairro())
				&& ValidacoesDeEntradas.validarNumero(funcionario.getEndereco().getCep())
				&& ValidacoesDeEntradas.validarNumeroInteiro(funcionario.getEndereco().getNumero()));
	}

	private String msgExcecaoEntradaInvalida(Funcionario funcionario) {
		if (!ValidacoesDeEntradas.validarString(funcionario.getNome())) {
			return Msg.INVALIDO_NOME.getStr();
		} else if (!ValidacoesDeEntradas.validarString(funcionario.getSobrenome())) {
			return Msg.INVALIDO_SOBRENOME.getStr();
		} else if (!ValidacoesDeEntradas.validarNumero(funcionario.getTelefone())) {
			return Msg.INVALIDO_TEL.getStr();
		} else if (!ValidacoesDeEntradas.validarIdade(funcionario.getIdade())) {
			return Msg.INVALIDO_IDADE.getStr();
		} else if (!ValidacoesDeEntradas.validarCPF(funcionario.getCpf())) {
			return Msg.INVALIDO_CPF.getStr();
		} else if (!ValidacoesDeEntradas.validarString(funcionario.getEndereco().getRua())) {
			return Msg.INVALIDO_RUA.getStr();
		} else if (!ValidacoesDeEntradas.validarString(funcionario.getEndereco().getBairro())) {
			return Msg.INVALIDO_BAIRRO.getStr();
		} else if (!ValidacoesDeEntradas.validarNumero(funcionario.getEndereco().getCep())) {
			return Msg.INVALIDO_CEP.getStr();
		} else if (!ValidacoesDeEntradas.validarNumeroInteiro(funcionario.getEndereco().getNumero())) {
			return Msg.INVALIDO_NUM.getStr();
		} else {
			return Msg.VAZIO.getStr();
		}
	}

}
