package br.com.novaroma.projeto.apresentacao.tela.gui;

import br.com.novaroma.projeto.apresentacao.telas.JFramePrincipal;
import br.com.novaroma.projeto.negocio.FabricaControlador;
import br.com.novaroma.projeto.negocio.IControladorLivro;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import javax.swing.JOptionPane;

public class GUIEmprestimoDevolucao extends JFramePrincipal {

	private static final long serialVersionUID = 1L;
	private String cpf;
    private String codigo;
    IControladorLivro controlador;
    String idTela;

    public GUIEmprestimoDevolucao() {

    }

    public GUIEmprestimoDevolucao(String idTela, String cpf, String codigo) {
        this.idTela = idTela;
        this.cpf = cpf;
        this.codigo = codigo;
        controlador = FabricaControlador.getInstanciaControladorLivro();
    }

    public void buscarOpcaoSelect() {
    	
        try {
            switch (idTela) {
                case Constt.ACTION_EMPRESTAR:
                	controlador.emprestar(cpf, super.getFuncionario(), codigo);
                    JOptionPane.showMessageDialog(null, Msg.EMPRESTADO.getStr());
                    break;

                case Constt.ACTION_DEVOLVER:
                	 controlador.devolver(cpf, super.getFuncionario(), codigo);
                     JOptionPane.showMessageDialog(null, Msg.DEVOLVIVO.getStr());
                    break;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        }
    }

}
