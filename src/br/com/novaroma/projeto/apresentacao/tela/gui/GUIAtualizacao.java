package br.com.novaroma.projeto.apresentacao.tela.gui;

import br.com.novaroma.projeto.apresentacao.telas.JFramePrincipal;
import br.com.novaroma.projeto.apresentacao.telas.TelaInserirPessoa;
import br.com.novaroma.projeto.apresentacao.telas.TelaInserirLivro;
import br.com.novaroma.projeto.apresentacao.telas.TelaInserirMaterialEspecial;
import br.com.novaroma.projeto.entidades.Entidade;
import br.com.novaroma.projeto.entidades.Livro;
import br.com.novaroma.projeto.entidades.MaterialDidatico;
import br.com.novaroma.projeto.entidades.MaterialEspecial;
import br.com.novaroma.projeto.entidades.Pessoa;
import br.com.novaroma.projeto.negocio.FabricaControlador;
import br.com.novaroma.projeto.negocio.IControladorCliente;
import br.com.novaroma.projeto.negocio.IControladorFuncionario;
import br.com.novaroma.projeto.negocio.IControladorGenerico;
import br.com.novaroma.projeto.negocio.IControladorLivro;
import br.com.novaroma.projeto.negocio.IControladorMaterialEspecial;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;
import javax.swing.JOptionPane;

public class GUIAtualizacao extends JFramePrincipal {
	
	private static final long serialVersionUID = 1L;
	private String entidadeEscolhida;
	private String txtCampoPesquisa;
	private String txtCampoPesquisaFormatado;
	private IControladorCliente controladorCliente;
	private IControladorFuncionario controladorFuncionario;
	private IControladorLivro controladorLivro;
	private IControladorMaterialEspecial controladorMaterialEspecial;
	private String idTela;

	public GUIAtualizacao() {
		this.controladorCliente = FabricaControlador.getInstanciaControladorCliente();
		this.controladorFuncionario = FabricaControlador.getInstanciaControladorFuncionario();
		this.controladorLivro = FabricaControlador.getInstanciaControladorLivro();
		this.controladorMaterialEspecial = FabricaControlador.getInstanciaControladorMaterialEspecial();
	}

	public GUIAtualizacao(String entidadeEscolhida, String txtCampoPesquisa) {
		this.entidadeEscolhida = entidadeEscolhida;
		this.txtCampoPesquisa = txtCampoPesquisa;
		this.controladorCliente = FabricaControlador.getInstanciaControladorCliente();
		this.controladorFuncionario = FabricaControlador.getInstanciaControladorFuncionario();
		this.controladorLivro = FabricaControlador.getInstanciaControladorLivro();
		this.controladorMaterialEspecial = FabricaControlador.getInstanciaControladorMaterialEspecial();
	}

	public void verificarTelaAtualizar() throws Exception {
		switch (entidadeEscolhida) {
		case Constt.ENTIDADE_CLIENTE:
			this.idTela = Constt.ACTION_ATUALIZAR_CLIENTE;
			abrirTelaAtualizar(controladorCliente);
			break;
	
		case Constt.ENTIDADE_FUNCIONARIO:
			this.idTela = Constt.ACTION_ATUALIZAR_FUNCIONARIO;
			abrirTelaAtualizar(controladorFuncionario);
			break;

		case Constt.ENTIDADE_LIVRO:
			abrirTelaAtualizar(controladorLivro);
			break;

		case Constt.ENTIDADE_MATERIAL_ESPECIAL:
			abrirTelaAtualizar(controladorMaterialEspecial);
			break;
		}

	}

	private <T extends Entidade> void abrirTelaAtualizar(IControladorGenerico<T> controlador) throws Exception {
		txtCampoPesquisaFormatado = super.retirarCaracterEspecial(txtCampoPesquisa);

		T entity = controlador.consultar(txtCampoPesquisaFormatado);
		if (entity instanceof Pessoa) {
			TelaInserirPessoa telaCliente = new TelaInserirPessoa(idTela, (Pessoa) entity);
			telaCliente.setVisible(true);

		} else if (entity instanceof MaterialDidatico) {
			if (entity instanceof Livro) {
				TelaInserirLivro telaLivro = new TelaInserirLivro(Constt.ACTION_ATUALIZAR, (Livro) entity);
				telaLivro.setVisible(true);
			} else {
				TelaInserirMaterialEspecial telaMaterialEspecial = new TelaInserirMaterialEspecial(
						Constt.ACTION_ATUALIZAR, (MaterialEspecial) entity);
				telaMaterialEspecial.setVisible(true);
			}
		}

	}

	public <T extends Entidade> void atualizarGenerico(IControladorGenerico<T> controlador, T entity) throws Exception {
		controlador.atualizar(entity);
		JOptionPane.showMessageDialog(null, Msg.ATUALIZADO.getStr());
	}


	public void atualizarMaterialEspecial(MaterialEspecial materialEspecial) throws Exception {
		atualizarGenerico(controladorMaterialEspecial, materialEspecial);
	}

}
