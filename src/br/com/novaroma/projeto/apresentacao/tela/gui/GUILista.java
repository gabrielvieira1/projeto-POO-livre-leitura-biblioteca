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

public class GUILista extends JFramePrincipal {

	private static final long serialVersionUID = 1L;
	private IControladorCliente controladorCliente;
	private IControladorFuncionario controladorFuncionario;
	private IControladorLivro controladorLivro;
	private IControladorMaterialEspecial controladorMaterialEspecial;
	private static String escolhaEntidade;

	public GUILista() {
	}

	public GUILista(String escolhaEntidade) {
		this.controladorCliente = FabricaControlador.getInstanciaControladorCliente();
		this.controladorFuncionario = FabricaControlador.getInstanciaControladorFuncionario();
		this.controladorLivro = FabricaControlador.getInstanciaControladorLivro();
		this.controladorMaterialEspecial = FabricaControlador.getInstanciaControladorMaterialEspecial();
		GUILista.escolhaEntidade = escolhaEntidade;
	}

	public void listar() {
		try {
			switch (escolhaEntidade) {
			case Constt.ENTIDADE_CLIENTE:
				listarGenerico(controladorCliente);
				break;

			case Constt.ENTIDADE_LIVRO:
				listarGenerico(controladorLivro);
				break;

			case Constt.ENTIDADE_MATERIAL_ESPECIAL:
				listarGenerico(controladorMaterialEspecial);
				break;

			case Constt.ENTIDADE_FUNCIONARIO:
				listarGenerico(controladorFuncionario);
				break;

			case Constt.ENTIDADE_EMPRESTIMO:
				listarGenerico(true);
				break;

			case Constt.ENTIDADE_DEVOLUCAO:
				listarGenerico(false);
				break;

			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
		}
	}

	private <T extends Entidade> void listarGenerico(IControladorGenerico<T> controlador) throws Exception {

		ArrayList<T> entity = null;

		entity = controlador.listar();
		JDialogLista jDialogLista = new JDialogLista(this, true, (ArrayList<Object>) (Object) entity);
		jDialogLista.setVisible(true);

	}

	private void listarGenerico(boolean check) throws Exception {
		ArrayList lista = null;

		if (check) {
			lista = controladorLivro.listarEmprestimo();
		} else {
			lista = controladorLivro.listarDevolucao();
		}

		JDialogLista jDialogLista = new JDialogLista(this, true, (ArrayList<Object>) (Object) lista);
		jDialogLista.setVisible(true);
	}

}
