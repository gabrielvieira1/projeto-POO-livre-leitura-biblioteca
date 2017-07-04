package br.com.novaroma.projeto.apresentacao.tela.gui;

import br.com.novaroma.projeto.apresentacao.telas.JFramePrincipal;
import br.com.novaroma.projeto.entidades.Entidade;
import br.com.novaroma.projeto.excecao.ExcecaoEntidadeNaoExiste;
import br.com.novaroma.projeto.negocio.FabricaControlador;
import br.com.novaroma.projeto.negocio.IControladorCliente;
import br.com.novaroma.projeto.negocio.IControladorFuncionario;
import br.com.novaroma.projeto.negocio.IControladorGenerico;
import br.com.novaroma.projeto.negocio.IControladorLivro;
import br.com.novaroma.projeto.negocio.IControladorMaterialEspecial;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import javax.swing.JOptionPane;

public class GUIRemocao extends JFramePrincipal {

	private static final long serialVersionUID = 1L;
	private String entidadeEscolhida;
	private String txtCampoPesquisa;
	private String txtCampoPesquisaFormatado;
	private IControladorCliente controladorCliente;
	private IControladorFuncionario controladorFuncionario;
	private IControladorLivro controladorLivro;
	private IControladorMaterialEspecial controladorMaterialEspecial;

	public GUIRemocao() {

	}

	public GUIRemocao(String entidadeEscolhida, String txtCampoPesquisa) {
		this.entidadeEscolhida = entidadeEscolhida;
		this.txtCampoPesquisa = txtCampoPesquisa;
		this.controladorCliente = FabricaControlador.getInstanciaControladorCliente();
		this.controladorFuncionario = FabricaControlador.getInstanciaControladorFuncionario();
		this.controladorLivro = FabricaControlador.getInstanciaControladorLivro();
		this.controladorMaterialEspecial = FabricaControlador.getInstanciaControladorMaterialEspecial();
	}

	public void remover() throws ExcecaoEntidadeNaoExiste {
		try {
			switch (entidadeEscolhida) {
			case Constt.ENTIDADE_CLIENTE:
				removerGenerico(controladorCliente);
				break;

			case Constt.ENTIDADE_LIVRO:
				removerGenerico(controladorLivro);
				break;

			case Constt.ENTIDADE_MATERIAL_ESPECIAL:
				removerGenerico(controladorMaterialEspecial);
				break;
			
			case Constt.ENTIDADE_FUNCIONARIO:
				removerGenerico(controladorFuncionario);
				break;
			}
			
			
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
		}
	}

	private <T extends Entidade> void removerGenerico(IControladorGenerico<T> controlador) throws Exception {

		txtCampoPesquisaFormatado = super.retirarCaracterEspecial(txtCampoPesquisa);

		try {
			controlador.remover(txtCampoPesquisaFormatado);
			JOptionPane.showMessageDialog(null, Msg.REMOVIDO.getStr());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
		}
	}

}
