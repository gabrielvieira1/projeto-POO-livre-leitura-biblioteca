package br.com.novaroma.projeto.negocio;

import java.util.ArrayList;

import br.com.novaroma.projeto.entidades.Emprestimo;
import br.com.novaroma.projeto.entidades.Funcionario;
import br.com.novaroma.projeto.entidades.Devolucao;
import br.com.novaroma.projeto.entidades.Livro;
import br.com.novaroma.projeto.negocio.IControladorLivro;
import br.com.novaroma.projeto.negocio.ValidacoesDeEntradas;
import br.com.novaroma.projeto.util.Msg;
import br.com.novaroma.projeto.dao.FabricaDao;
import br.com.novaroma.projeto.dao.IDao;
import br.com.novaroma.projeto.entidades.Cliente;
import br.com.novaroma.projeto.excecao.ExcecaoDao;
import br.com.novaroma.projeto.excecao.ExcecaoNegocio;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControladorLivro implements IControladorLivro {

    public ControladorLivro() {
    }

    @Override
    public void inserir(Livro livro)  throws ExcecaoNegocio, ExcecaoDao {

        if (!verificarValidacoesEntrada(livro)) {
        	throw new ExcecaoNegocio(Msg.ENTRADA_INVALIDA.getStr() + msgExcecaoEntradaInvalida(livro));
        }
        
        IDao<Livro> dao = FabricaDao.getInstanciaDao(Livro.class);


        if (dao.exists(livro.getId())) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_EXISTENTE.getStr());
        }

        dao.inserir(livro);

    }

    @Override
    public void atualizar(Livro livro)  throws ExcecaoNegocio, ExcecaoDao {

        if (!verificarValidacoesEntrada(livro)) {
        	throw new ExcecaoNegocio(Msg.ENTRADA_INVALIDA.getStr() + msgExcecaoEntradaInvalida(livro));
        }
        
        IDao<Livro> dao = FabricaDao.getInstanciaDao(Livro.class);

        if (!dao.exists(livro.getId())) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
        }

        dao.atualizar(livro);
        
    }

    @Override
    public void remover(String id)  throws ExcecaoNegocio, ExcecaoDao {
        IDao<Livro> dao = FabricaDao.getInstanciaDao(Livro.class);
        if (!dao.exists(id)) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
        }

        dao.remover(id);
       
    }

    @Override
    public Livro consultar(String id)  throws ExcecaoNegocio, ExcecaoDao {

        IDao<Livro> dao = FabricaDao.getInstanciaDao(Livro.class);
        if (!dao.exists(id)) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr());
        }

        return dao.consultar(id);
       
    }

    @Override
    public ArrayList<Livro> listar()  throws ExcecaoNegocio, ExcecaoDao {

        IDao<Livro> dao = FabricaDao.getInstanciaDao(Livro.class);

        if (!dao.isValid()) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
        }

        return dao.listar();
        
    }
    
    @Override
    public ArrayList<Livro> buscarTodos(String busca) throws ExcecaoNegocio, ExcecaoDao {
        IDao<Livro> dao = FabricaDao.getInstanciaDao(Livro.class);

        if (!dao.isValid()) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
        }

        ArrayList<Livro> listLivros = dao.listar();
		ArrayList<Livro> list = new ArrayList<Livro>();

        for (Livro l : listLivros) {
            if (l.getAutor().equalsIgnoreCase(busca)
                    || l.getClassificacao().equalsIgnoreCase(busca)
                    || l.getCodigo().equalsIgnoreCase(busca)
                    || String.valueOf(l.getEdicao()).equalsIgnoreCase(busca)
                    || l.getEditora().equalsIgnoreCase(busca)
                    || l.getNumeroDeTombo().equalsIgnoreCase(busca)
                    || String.valueOf(l.getQtdLivros()).equalsIgnoreCase(busca)
                    || l.getTitulo().equalsIgnoreCase(busca)
                    || String.valueOf(l.getVolume()).equalsIgnoreCase(busca)) {

                list.add(l);
                
            }
        }

        if (list.isEmpty()) {
        	throw new ExcecaoNegocio(Msg.BUSCA_NAO_ENCONTRADA.getStr());
        }
        
        return list;
    }
    
    @Override
	public ArrayList buscarTodos(String busca, boolean identifica) throws ExcecaoNegocio, ExcecaoDao {
		IDao dao = null;
		ArrayList list = null;
		
		if (identifica) {
			dao = FabricaDao.getInstanciaDao(Emprestimo.class);
			list = new ArrayList<Emprestimo>();
		} else {
			dao = FabricaDao.getInstanciaDao(Devolucao.class);
			list = new ArrayList<Devolucao>();
		}
		
		if (!dao.isValid()) {
			throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
		}
		
		ArrayList lista = dao.listar();
		
		boolean achou;
		for (int i = 0; i < lista.size(); i++) {
			if(pesquisarCliente(((Devolucao)lista.get(i)), busca)
				|| pesquisarData(((Devolucao)lista.get(i)).getDataEmprestimos(), busca)
			    || pesquisarLivro(((Devolucao)lista.get(i)).getLivros(), busca)
				|| pesquisarNomeFunc(((Devolucao)lista.get(i)).getNomeFuncionario(), busca)){
				list.add(lista.get(i));			
			}
		}
		
		if (list.isEmpty()) {
			throw new ExcecaoNegocio(Msg.BUSCA_NAO_ENCONTRADA.getStr());
		}
		return list;
	}
    
    private boolean pesquisarCliente(Devolucao dev, String busca) {
    	return(dev.getNome().equalsIgnoreCase(busca)
				|| dev.getCpf().equalsIgnoreCase(busca));
	}

    private boolean pesquisarNomeFunc(ArrayList<String> list, String busca) {
    	for (String nome : list) {
    		if(nome.equalsIgnoreCase(busca)){
    			return true;
    		}
    	}
        return false;
    }
    
    
    private boolean pesquisarData(ArrayList<String> list, String busca) {
    	for (String data : list) {
    		if(data.equalsIgnoreCase(busca)){
    			return true;
    		}
    	}
        return false;
    }

    private boolean pesquisarLivro(ArrayList<String> listaLivro, String busca) {
    	for (String livro :  listaLivro) {
    		if(livro.equalsIgnoreCase(busca)){
    			return true;
    		}
    	}
        return false;

    }
    
    
    @Override
    public ArrayList<Emprestimo> listarEmprestimo()  throws ExcecaoNegocio, ExcecaoDao {

        IDao<Emprestimo> dao = FabricaDao.getInstanciaDao(Emprestimo.class);

        if (!dao.isValid()) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
        }

        return dao.listar();
        
    }

    @Override
    public ArrayList<Devolucao> listarDevolucao()  throws ExcecaoNegocio, ExcecaoDao {

        IDao<Devolucao> dao = FabricaDao.getInstanciaDao(Devolucao.class);

        if (!dao.isValid()) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr());
        }

        return dao.listar();

    }

    @Override
    public void emprestar(String idCliente, String nomeFuncionario, String idLivro)  throws ExcecaoNegocio, ExcecaoDao {
    	
        IDao<Cliente> daoCliente = FabricaDao.getInstanciaDao(Cliente.class);
        IDao<Livro> daoLivro = FabricaDao.getInstanciaDao(Livro.class);
       
        if(!daoCliente.exists(idCliente) && !daoLivro.exists(idLivro)) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr() + Msg.INVALIDO_IDCLIENTE.getStr() + Msg.INVALIDO_IDLIVRO.getStr());
        }
        
        if (!daoCliente.exists(idCliente)){
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr() + Msg.INVALIDO_IDCLIENTE.getStr());
        }

        if(!daoLivro.exists(idLivro)) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr() + Msg.INVALIDO_IDLIVRO.getStr());
        }
        
        Cliente cliente = daoCliente.consultar(idCliente);
        Livro livro = daoLivro.consultar(idLivro);

        if (cliente.getContadorLivro() >= 3) { 
        	 throw new ExcecaoNegocio(Msg.LIMITE_EMPRESTIMO.getStr());
        }
           
        if (livro.getQtdLivros() <= 1){
        	throw new ExcecaoNegocio(Msg.QUANTIDADE_EMPRESTIMO.getStr());
        }

        IDao<Emprestimo> daoEmprestimo = FabricaDao.getInstanciaDao(Emprestimo.class);
        String stringDataEmprestimo = getData();
        Emprestimo emprestimo = null;
        
        if (!daoEmprestimo.exists(idCliente)) {
        	emprestimo = new Emprestimo(cliente.getNome(), idCliente, nomeFuncionario, idLivro, stringDataEmprestimo);
            daoEmprestimo.inserir(emprestimo);
        } else {
            emprestimo = daoEmprestimo.consultar(idCliente);
            emprestimo.getNomeFuncionario().add(nomeFuncionario);
            emprestimo.getLivros().add(idLivro);
            emprestimo.getDataEmprestimos().add(stringDataEmprestimo);
            daoEmprestimo.atualizar(emprestimo);
        }

        cliente.setContadorLivro(cliente.getContadorLivro() + 1);
        livro.setQtdLivros(livro.getQtdLivros() - 1);
        daoCliente.atualizar(cliente);
        daoLivro.atualizar(livro);
    	
    }



    @Override
    public void devolver(String idCliente, String nomeFuncionario, String idLivro) throws ExcecaoNegocio, ExcecaoDao {
    	
    	IDao<Cliente> daoCliente = FabricaDao.getInstanciaDao(Cliente.class);
        IDao<Livro> daoLivro = FabricaDao.getInstanciaDao(Livro.class);

        IDao<Emprestimo> daoEmprestimo = FabricaDao.getInstanciaDao(Emprestimo.class);
        IDao<Devolucao> daoDevolucao = FabricaDao.getInstanciaDao(Devolucao.class);
        
        if(!daoCliente.exists(idCliente) && !daoLivro.exists(idLivro)) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr() + Msg.INVALIDO_IDCLIENTE.getStr() + Msg.INVALIDO_IDLIVRO.getStr());
        }
        
        if (!daoCliente.exists(idCliente)){
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr() + Msg.INVALIDO_IDCLIENTE.getStr());
        }

        if(!daoLivro.exists(idLivro)) {
        	throw new ExcecaoNegocio(Msg.ENTIDADE_NAO_EXISTE.getStr() + Msg.INVALIDO_IDLIVRO.getStr());
        }
        
        if (!daoCliente.isValid()) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr() + Msg.INVALIDO_IDCLIENTE.getStr());
        }
        
        if (!daoLivro.isValid()) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr() +  Msg.INVALIDO_IDLIVRO.getStr());
        }
        
        if(!daoEmprestimo.exists(idCliente)) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr() + Msg.INVALIDO_IDCLIENTE.getStr());
        }
        
        if (!daoEmprestimo.isValid()) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr() + Msg.INVALIDO_EMPRESTIMO.getStr());
        }
        
        Cliente cliente = daoCliente.consultar(idCliente);
        Livro livro = daoLivro.consultar(idLivro);

        Emprestimo emprestimo = (Emprestimo) daoEmprestimo.consultar(idCliente);
        String dataEmprestimo = Msg.VAZIO.getStr();

        for (int i = 0; i < emprestimo.getLivros().size(); i++) {
            if (idLivro.equals(emprestimo.getLivros().get(i))) {
                dataEmprestimo = (emprestimo.getDataEmprestimos().get(i));
                emprestimo.getLivros().remove(i);
                emprestimo.getDataEmprestimos().remove(i);
                break;
            }
        }
        
        if (dataEmprestimo.equals(Msg.VAZIO.getStr())) {
        	throw new ExcecaoNegocio(Msg.SEM_REGISTROS.getStr()  + Msg.INVALIDO_EMPRESTIMO.getStr());
        }

        if (emprestimo.getLivros().isEmpty()) {
            daoEmprestimo.remover(emprestimo.getId());
        } else {
            daoEmprestimo.inserir(emprestimo);
        }

        Devolucao devolucao = null;

        if (!daoDevolucao.exists(idCliente)) {
        	devolucao = new Devolucao(emprestimo.getNome(), idCliente, nomeFuncionario, idLivro, dataEmprestimo);
        	 daoDevolucao.inserir(devolucao);
        } else {
        	
        	devolucao = daoDevolucao.consultar(idCliente);
        	devolucao.getNomeFuncionario().add(nomeFuncionario);
        	devolucao.getLivros().add(idLivro);
            devolucao.getDataEmprestimos().add(dataEmprestimo);
            daoDevolucao.atualizar(devolucao);
        }

        
        cliente.setContadorLivro(cliente.getContadorLivro() - 1);
        
        livro.setQtdLivros(livro.getQtdLivros() + 1);
        daoCliente.atualizar(cliente);
        daoLivro.atualizar(livro);

    }

    
   
			
		

    private boolean verificarValidacoesEntrada(Livro livro) {

        return (ValidacoesDeEntradas.validarClassificacao(livro.getClassificacao())
                && ValidacoesDeEntradas.validarNumero(livro.getCodigo())
                && ValidacoesDeEntradas.validarNumeroInteiro(livro.getEdicao())
                && ValidacoesDeEntradas.validarString(livro.getEditora())
                && ValidacoesDeEntradas.validarString(livro.getAutor())
                && ValidacoesDeEntradas.validarNumeroInteiro(livro.getVolume())
                && ValidacoesDeEntradas.validarNumeroString(livro.getNumeroDeTombo()));

    }

    private String msgExcecaoEntradaInvalida(Livro livro) {
        if (!ValidacoesDeEntradas.validarClassificacao(livro.getClassificacao())) {
            return Msg.INVALIDO_CLASS.getStr();
        } else if (!ValidacoesDeEntradas.validarNumero(livro.getCodigo())) {
            return Msg.INVALIDO_CODIGO.getStr();
        } else if (!ValidacoesDeEntradas.validarNumeroInteiro(livro.getEdicao())) {
            return Msg.INVALIDO_EDICAO.getStr();
        } else if (!ValidacoesDeEntradas.validarString(livro.getEditora())) {
            return Msg.INVALIDO_EDITORA.getStr();
        } else if (!ValidacoesDeEntradas.validarString(livro.getAutor())) {
            return Msg.INVALIDO_AUTOR.getStr();
        } else if (!ValidacoesDeEntradas.validarNumeroInteiro(livro.getVolume())) {
            return Msg.INVALIDO_VOLUME.getStr();
        } else if (!ValidacoesDeEntradas.validarNumeroString(livro.getNumeroDeTombo())) {
            return Msg.INVALIDO_TOMBO.getStr();
        } else {
        	return Msg.VAZIO.getStr();
        }
    }
    
    private String getData() {
        Calendar c = Calendar.getInstance();
        DateFormat formataDeDateParaString = DateFormat.getDateInstance();
        java.util.Date data = c.getTime();
        String stringDataDeEmprestimo = formataDeDateParaString.format(data);
        return stringDataDeEmprestimo;
    }

}
