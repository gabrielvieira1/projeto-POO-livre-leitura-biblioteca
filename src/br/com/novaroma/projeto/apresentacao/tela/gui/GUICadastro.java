package br.com.novaroma.projeto.apresentacao.tela.gui;

import br.com.novaroma.projeto.apresentacao.telas.TelaInserirPessoa;
import br.com.novaroma.projeto.apresentacao.telas.TelaInserirLivro;
import br.com.novaroma.projeto.apresentacao.telas.TelaInserirMaterialEspecial;
import br.com.novaroma.projeto.entidades.Entidade;
import br.com.novaroma.projeto.negocio.IControladorGenerico;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import javax.swing.JOptionPane;

public class GUICadastro {
    private static String entidadeEscolhida;
    
    public GUICadastro () {
    }
    
    public GUICadastro(String entidadeEscolhida) {
        GUICadastro.entidadeEscolhida = entidadeEscolhida;
    }

    public void inserir() {
        switch (entidadeEscolhida) {

            case Constt.ENTIDADE_CLIENTE:
                TelaInserirPessoa p = new TelaInserirPessoa(Constt.ACTION_CADASTRAR_CLIENTE);
                p.setVisible(true);
                break;

            case Constt.ENTIDADE_LIVRO:
                TelaInserirLivro l = new TelaInserirLivro(Constt.ACTION_CADASTRAR);
                l.setVisible(true);
                break;

            case Constt.ENTIDADE_MATERIAL_ESPECIAL:
                TelaInserirMaterialEspecial mE = new TelaInserirMaterialEspecial(Constt.ACTION_CADASTRAR);
                mE.setVisible(true);
                break;
        }
    }

    public <T extends Entidade> void cadastrarGenerico(IControladorGenerico<T> controlador, T entity) throws Exception {
        
    	controlador.inserir(entity);
        JOptionPane.showMessageDialog(null, Msg.CADASTRADO.getStr());

    }

}
