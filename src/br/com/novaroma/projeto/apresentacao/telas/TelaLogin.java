package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.entidades.Funcionario;
import br.com.novaroma.projeto.excecao.ExcecaoDao;
import br.com.novaroma.projeto.excecao.ExcecaoNegocio;
import br.com.novaroma.projeto.negocio.FabricaControlador;
import br.com.novaroma.projeto.negocio.IControladorFuncionario;
import br.com.novaroma.projeto.negocio.IControladorLivro;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class TelaLogin extends JFramePrincipal {

	private static final long serialVersionUID = 1L;

	public TelaLogin() {
		super();
		super.alterarLayout();
		initComponents();
	}

	private void initComponents() {

		jPasswordSenha = new javax.swing.JPasswordField();
		jLabel2 = new javax.swing.JLabel();
		jButtonOK = new javax.swing.JButton();
		jButtonCancelar = new javax.swing.JButton();
		jTextFieldlLogin = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Login - LeituraLivre");
		setMinimumSize(new java.awt.Dimension(600, 230));
		setResizable(false);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPasswordSenha.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordSenhaActionPerformed(evt);
			}
		});
		jPasswordSenha.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jPasswordSenhaKeyPressed(evt);
			}
		});
		getContentPane().add(jPasswordSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 150, -1));

		jLabel2.setText("Senha:");
		getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

		jButtonOK.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/ok.png"))); // NOI18N
		jButtonOK.setText("OK");
		jButtonOK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonOKActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

		jButtonCancelar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Cancelar.png"))); // NOI18N
		jButtonCancelar.setText("Cancelar");
		jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCancelarActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

		jTextFieldlLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldlLoginActionPerformed(evt);
			}
		});
		jTextFieldlLogin.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jTextFieldlLoginKeyPressed(evt);
			}
		});
		getContentPane().add(jTextFieldlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 150, -1));

		jLabel1.setText("Login:");
		getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

		jLabel4.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Fundo.jpg"))); // NOI18N
		jLabel4.setMaximumSize(new java.awt.Dimension(610, 235));
		jLabel4.setMinimumSize(new java.awt.Dimension(610, 235));
		jLabel4.setPreferredSize(new java.awt.Dimension(610, 235));
		getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 270));

		setSize(new java.awt.Dimension(605, 283));
		setLocationRelativeTo(null);
	}

	private void jPasswordSenhaActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jTextFieldlLoginActionPerformed(java.awt.event.ActionEvent evt) {

	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaLogin().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButtonCancelar;
	private javax.swing.JButton jButtonOK;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPasswordField jPasswordSenha;
	private javax.swing.JTextField jTextFieldlLogin;

	private void jPasswordSenhaKeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			jButtonOK.doClick();
		}
	}

	private void jTextFieldlLoginKeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			jButtonOK.doClick();
		}
	}

	private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(null, Msg.FINALIZAR.getStr(), Msg.LIVRE_LEITURA.getStr(), 1);
		System.exit(0);
	}

	private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {

		if (verificarEspacoBranco()) {
			JOptionPane.showMessageDialog(rootPane, Msg.CAMPOS_VAZIOS.getStr(), Msg.ERROR.getStr(),
					JOptionPane.INFORMATION_MESSAGE);
			acaoBotaoLimpar();
			
		} else if (verificarLoginGerencial()) {
			entrar(Constt.ENTIDADE_GERENTE);
		} else {
			try {
				if (verificarLogin()) {
					entrar(Constt.ENTIDADE_FUNCIONARIO);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}

	private boolean verificarLoginGerencial() {
		String login = jTextFieldlLogin.getText();
		String senha = jPasswordSenha.getText();
		Funcionario gerente = new Funcionario();
		super.salvarLoginFuncionario(gerente);
		return (login.equals(gerente.getLogin()) && senha.equals(gerente.getSenha()));
	}

	private boolean verificarLogin() throws ExcecaoNegocio, ExcecaoDao {
		String login = jTextFieldlLogin.getText();
		String senha = jPasswordSenha.getText();

		IControladorFuncionario controladorFuncionario = FabricaControlador.getInstanciaControladorFuncionario();
		acaoBotaoLimpar();
		Funcionario funcionario = controladorFuncionario.consultarLogin(login, senha);
		if(funcionario != null){
			super.salvarLoginFuncionario(funcionario);
			return true;
		}
		
		return false;

	}

	private void entrar(String entidade) {

		if (entidade.equals(Constt.ENTIDADE_GERENTE)) {
			UIManager.put("OptionPane.cancelButtonText", "Cancelar");
			UIManager.put("OptionPane.noButtonText", "Não");
			UIManager.put("OptionPane.yesButtonText", "Sim");
			int escolha = JOptionPane.showConfirmDialog(null, Msg.CONFIRM.getStr());
			if (escolha == 1) {
				TelaMenuPrincipal p = new TelaMenuPrincipal();
				p.setVisible(true);
				this.dispose();
			} else if (escolha == 0) {
				TelaGerencial g = new TelaGerencial();
				g.setVisible(true);
				this.dispose();
			}
		}else if (entidade.equals(Constt.ENTIDADE_FUNCIONARIO)) {
            TelaMenuPrincipal p = new TelaMenuPrincipal();
            p.setVisible(true);
            this.dispose();
        }

	}

	private boolean verificarEspacoBranco() {
		return super.isInvalid(jTextFieldlLogin) || super.isInvalid(jPasswordSenha);
	}

	protected void acaoBotaoLimpar() {
		jTextFieldlLogin.setText(Msg.VAZIO.getStr());
		jPasswordSenha.setText(Msg.VAZIO.getStr());
	}

}
