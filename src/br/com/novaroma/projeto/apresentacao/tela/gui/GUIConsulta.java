package br.com.novaroma.projeto.apresentacao.tela.gui;
import br.com.novaroma.projeto.apresentacao.telas.JDialogLista;
import br.com.novaroma.projeto.apresentacao.telas.JFramePrincipal;
import br.com.novaroma.projeto.entidades.Entidade;
import br.com.novaroma.projeto.negocio.FabricaControlador;
import br.com.novaroma.projeto.negocio.IControladorCliente;
import br.com.novaroma.projeto.negocio.IControladorFuncionario;
import br.com.novaroma.projeto.negocio.IControladorGenerico;
import br.com.novaroma.projeto.negocio.IControladorLivro;
import br.com.novaroma.projeto.negocio.IControladorMaterialEspecial;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GUIConsulta extends JFramePrincipal {

	private static final long serialVersionUID = 1L;
	private String entidadeEscolhida;
    private String txtCampoPesquisa;
    private String txtCampoPesquisaFormatado;
    private IControladorCliente controladorCliente;
    private IControladorFuncionario controladorFuncionario;
    private IControladorLivro controladorLivro;
    private IControladorMaterialEspecial controladorMaterialEspecial;

    public GUIConsulta() {

    }

    public GUIConsulta(String entidadeEscolhida, String txtCampoPesquisa) {
        this.entidadeEscolhida = entidadeEscolhida;
        this.txtCampoPesquisa = txtCampoPesquisa;
        this.controladorCliente = FabricaControlador.getInstanciaControladorCliente();
        this.controladorFuncionario = FabricaControlador.getInstanciaControladorFuncionario();
        this.controladorLivro = FabricaControlador.getInstanciaControladorLivro();
        this.controladorMaterialEspecial = FabricaControlador.getInstanciaControladorMaterialEspecial();
    }

    public void consultar() {
        try {
            switch (entidadeEscolhida) {
                case Constt.ENTIDADE_CLIENTE:
                	consultarGenerico(controladorCliente);
                    break;
                case Constt.ENTIDADE_LIVRO:
                	consultarGenerico(controladorLivro);
                    break;
                case Constt.ENTIDADE_MATERIAL_ESPECIAL:
                	consultarGenerico(controladorMaterialEspecial);
                    break;
                case Constt.ENTIDADE_FUNCIONARIO:
                	consultarGenerico(controladorFuncionario);
                    break;
                case Constt.ENTIDADE_EMPRESTIMO:
                    consultarGenerico(true);
                    break;
                case Constt.ENTIDADE_DEVOLUCAO:
                    consultarGenerico(false);
                    break;

            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        }

    }
  
    
    private <T extends Entidade> void consultarGenerico(IControladorGenerico<T> controlador) throws Exception {

        txtCampoPesquisaFormatado = super.retirarCaracterEspecial(txtCampoPesquisa);
       
        ArrayList<T> entity = controlador.buscarTodos(txtCampoPesquisaFormatado);

        JDialogLista jDialogLista = new JDialogLista(this, true, (ArrayList<Object>) (Object) entity);
        jDialogLista.setVisible(true);
       
    }
    
  private void consultarGenerico(boolean check) throws Exception {
	  
	  ArrayList lista = null;
	  
	  if (check) {
			lista = controladorLivro.buscarTodos(txtCampoPesquisa, true);
		} else {
			lista = controladorLivro.buscarTodos(txtCampoPesquisa, false);
		}

		JDialogLista jDialogLista = new JDialogLista(this, true, (ArrayList<Object>) (Object) lista);
		jDialogLista.setVisible(true);
	  
  }

}
