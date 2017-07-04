package br.com.novaroma.projeto.negocio;

import br.com.novaroma.projeto.entidades.Funcionario;
import br.com.novaroma.projeto.excecao.*;

public interface IControladorFuncionario extends IControladorGenerico<Funcionario> {

    Funcionario consultarLogin(String login, String senha) throws ExcecaoNegocio, ExcecaoDao;

}
