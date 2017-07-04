package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.apresentacao.tela.gui.GUIEmprestimoDevolucao;
import br.com.novaroma.projeto.util.Msg;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TelaBuscaSecundario extends JFramePrincipal {

	private static final long serialVersionUID = 1L;
	private static String idTela = Msg.VAZIO.getStr();
	
	public TelaBuscaSecundario() {
		super();
		super.alterarLayout();
		initComponents();
	}

	public TelaBuscaSecundario(String idTela) {
		super();
		super.alterarLayout();

		initComponents();
		TelaBuscaSecundario.idTela = idTela;
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jButtonPesquisar = new javax.swing.JButton();
		jButtonVoltar = new javax.swing.JButton();
		jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
		jFormattedTextFieldCodigo = new javax.swing.JFormattedTextField();
		jLabelBuscaSecundario = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jButtonPesquisar.setBackground(new java.awt.Color(0, 0, 0));
		jButtonPesquisar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/busc1.jpeg"))); // NOI18N
		jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonPesquisarActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 32, 32));

		jButtonVoltar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/back.png"))); // NOI18N
		jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltarActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 32, 32));

		try {
			jFormattedTextFieldCpf.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		jFormattedTextFieldCpf.setVerifyInputWhenFocusTarget(false);
		jFormattedTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jFormattedTextFieldCpfActionPerformed(evt);
			}
		});
		jFormattedTextFieldCpf.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jFormattedTextFieldCpfKeyPressed(evt);
			}
		});
		getContentPane().add(jFormattedTextFieldCpf,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 84, 249, 20));

		try {
			jFormattedTextFieldCodigo.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		jFormattedTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				jFormattedTextFieldCodigoKeyPressed(evt);
			}
		});
		getContentPane().add(jFormattedTextFieldCodigo,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 139, 246, 21));

		jLabelBuscaSecundario.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/BuscaBlackgroundSec.jpg"))); // NOI18N
		getContentPane().add(jLabelBuscaSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 220));

		getAccessibleContext().setAccessibleName("Busca - LivreLeitura");

		setBounds(407, 295, 536, 249);
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();

	}

	private void jFormattedTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jFormattedTextFieldCpfKeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			jButtonPesquisar.doClick();
		}
	}

	private void jFormattedTextFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
			jButtonPesquisar.doClick();
		}
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaBuscaSecundario.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaBuscaSecundario().setVisible(true);
			}
		});
	}

	private boolean verificarEspacoBranco() {
		return super.isInvalid(jFormattedTextFieldCodigo) || super.isInvalid(jFormattedTextFieldCpf);
	}

	private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
		if (verificarEspacoBranco()) {
			JOptionPane.showMessageDialog(rootPane, Msg.CAMPOS_VAZIOS.getStr(), Msg.ERROR.getStr(),
					JOptionPane.ERROR_MESSAGE);
		} else {
			String cpf = super.retirarCaracterEspecial((String) jFormattedTextFieldCpf.getText());
			String codigo = jFormattedTextFieldCodigo.getText();
			GUIEmprestimoDevolucao guiEmprestimoDevolucao = new GUIEmprestimoDevolucao(idTela, cpf, codigo);
			guiEmprestimoDevolucao.buscarOpcaoSelect();
			this.dispose();
		}
	}

	

	private javax.swing.JButton jButtonPesquisar;
	private javax.swing.JButton jButtonVoltar;
	private javax.swing.JFormattedTextField jFormattedTextFieldCodigo;
	private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
	private javax.swing.JLabel jLabelBuscaSecundario;
}
