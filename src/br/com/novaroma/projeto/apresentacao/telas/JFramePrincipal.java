package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.entidades.Funcionario;
import static br.com.novaroma.projeto.util.Messages.ERROR_LOOK_AND_FEEL;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.UIManager;

public abstract class JFramePrincipal extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private static Funcionario funcionarioLogin;
   
   
    public JFramePrincipal() throws HeadlessException {

    }

    public JFramePrincipal(GraphicsConfiguration arg0) {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    public JFramePrincipal(String arg0) throws HeadlessException {
        super(arg0);
        // TODO Auto-generated constructor stub
    }

    public JFramePrincipal(String arg0, GraphicsConfiguration arg1) {
        super(arg0, arg1);
        // TODO Auto-generated constructor stub
    }

    protected void alterarLayout() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.getDefaults().put("OptionPane.background",new Color(217,232,238));
            UIManager.put ("Panel.background", new Color(217,232,238));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ERROR_LOOK_AND_FEEL);
        }
    }

    protected boolean isInvalid(JTextField campo) {
        String txt = campo.getText().replaceAll(" ","");
        return txt.isEmpty();
    }
    
     protected boolean isInvalid(JFormattedTextField campo) {
        String txt = ((String) retirarCaracterEspecial(campo.getText()));
        return txt.isEmpty();
    }

    protected String retirarCaracterEspecial(String string) {
        string = string.replaceAll("\\.", "");
        string = string.replaceAll("-", "");
        string = string.replaceAll("\\(", "");
        string = string.replaceAll("\\)", "");
        string = string.trim();
        return string;
    }

    protected void salvarLoginFuncionario(Funcionario funcionario) {
        JFramePrincipal.funcionarioLogin = funcionario;
    }

	public String getFuncionario() {
		return funcionarioLogin.getNome();
	}

   

}
