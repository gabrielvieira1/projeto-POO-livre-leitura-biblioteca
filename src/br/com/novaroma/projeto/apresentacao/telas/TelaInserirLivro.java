package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.apresentacao.tela.gui.GUIAtualizacao;
import br.com.novaroma.projeto.apresentacao.tela.gui.GUICadastro;

import br.com.novaroma.projeto.entidades.Livro;
import br.com.novaroma.projeto.negocio.FabricaControlador;
import br.com.novaroma.projeto.negocio.IControladorLivro;
import br.com.novaroma.projeto.negocio.LimiteDigitosECaractere;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import javax.swing.JOptionPane;

public class TelaInserirLivro extends JFramePrincipal {

	private static final long serialVersionUID = 1L;
	private static String idTela = Msg.VAZIO.getStr();

	public TelaInserirLivro() {
		super();
		construtor();

	}

	public TelaInserirLivro(String idTela) {
		super();
		construtor(idTela);
	}

	public TelaInserirLivro(String idTela, Livro livro) {
		super();
		construtor(idTela, livro);

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jButtonOK = new javax.swing.JButton();
		jButtonCancelar = new javax.swing.JButton();
		jTextFieldTitulo = new javax.swing.JTextField();
		jTextFieldAutor = new javax.swing.JTextField();
		jTextFieldVolume = new javax.swing.JTextField();
		jTextFieldNTombo = new javax.swing.JTextField();
		jTextFieldClassificacao = new javax.swing.JTextField();
		jTextFieldEdicao = new javax.swing.JTextField();
		jTextFieldEditora = new javax.swing.JTextField();
		jTextFieldQtdLivros = new javax.swing.JTextField();
		jFormattedTextFieldCodigo = new javax.swing.JFormattedTextField();
		jLabelTituloLivro = new javax.swing.JLabel();
		jButtonClean = new javax.swing.JButton();
		jLabelFundo = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Inserir Livro - LivreLeitura");
		setExtendedState(6);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jButtonOK.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/ok.png"))); // NOI18N
		jButtonOK.setText("OK");
		jButtonOK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonOKActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, -1, -1));

		jButtonCancelar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Cancelar.png"))); // NOI18N
		jButtonCancelar.setText("Cancelar");
		jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCancelarActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, -1, -1));

		jTextFieldTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextFieldTitulo.setVerifyInputWhenFocusTarget(false);
		jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldTituloActionPerformed(evt);
			}
		});
		getContentPane().add(jTextFieldTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 230, 270, 30));
		jTextFieldTitulo.getAccessibleContext().setAccessibleName("");

		jTextFieldAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextFieldAutor.setVerifyInputWhenFocusTarget(false);
		jTextFieldAutor.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldAutorActionPerformed(evt);
			}
		});
		getContentPane().add(jTextFieldAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 313, 270, 30));

		jTextFieldVolume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextFieldVolume.setVerifyInputWhenFocusTarget(false);
		jTextFieldVolume.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldVolumeActionPerformed(evt);
			}
		});
		getContentPane().add(jTextFieldVolume, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 396, 271, 30));

		jTextFieldNTombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextFieldNTombo.setVerifyInputWhenFocusTarget(false);
		jTextFieldNTombo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldNTomboActionPerformed(evt);
			}
		});
		getContentPane().add(jTextFieldNTombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 480, 269, 30));

		jTextFieldClassificacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextFieldClassificacao.setVerifyInputWhenFocusTarget(false);
		jTextFieldClassificacao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldClassificacaoActionPerformed(evt);
			}
		});
		getContentPane().add(jTextFieldClassificacao,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 253, 273, 30));

		jTextFieldEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextFieldEdicao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldEdicaoActionPerformed(evt);
			}
		});
		getContentPane().add(jTextFieldEdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 420, 270, 30));

		jTextFieldEditora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextFieldEditora.setVerifyInputWhenFocusTarget(false);
		jTextFieldEditora.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldEditoraActionPerformed(evt);
			}
		});
		getContentPane().add(jTextFieldEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 502, 271, 30));
		getContentPane().add(jTextFieldQtdLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 562, 270, 30));

		try {
			jFormattedTextFieldCodigo.setFormatterFactory(
					new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		jFormattedTextFieldCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jFormattedTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jFormattedTextFieldCodigoActionPerformed(evt);
			}
		});
		getContentPane().add(jFormattedTextFieldCodigo,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 336, 270, 30));

		jLabelTituloLivro.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
		getContentPane().add(jLabelTituloLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 230, 50));

		jButtonClean.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/eraser.png"))); // NOI18N
		jButtonClean.setText("Limpar");
		jButtonClean.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCleanActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, 90, -1));

		jLabelFundo.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/backgroundInserirLivro.jpg"))); // NOI18N
		getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 700));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldTituloActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldTituloActionPerformed

	private void jTextFieldAutorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldAutorActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldAutorActionPerformed

	private void jTextFieldVolumeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldVolumeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldVolumeActionPerformed

	private void jTextFieldNTomboActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldNTomboActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldNTomboActionPerformed

	private void jTextFieldClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldClassificacaoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldClassificacaoActionPerformed

	private void jTextFieldEdicaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldEdicaoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldEdicaoActionPerformed

	private void jTextFieldEditoraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldEditoraActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldEditoraActionPerformed

	private void jFormattedTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFormattedTextFieldCodigoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jFormattedTextFieldCodigoActionPerformed

	private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCleanActionPerformed
		acaoBotaoLimpar();
	}// GEN-LAST:event_jButtonCleanActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaInserirLivro.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaInserirLivro().setVisible(true);
			}
		});
	}

	private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {
		if (idTela.equals(Constt.ACTION_CADASTRAR)) {
			TelaCadastro tela = new TelaCadastro();
			tela.setVisible(true);
			this.dispose();
		} else {
			this.dispose();
		}
	}

	private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {
		if (verificarEspacoBranco()) {
			JOptionPane.showMessageDialog(rootPane, Msg.CAMPOS_VAZIOS.getStr(), Msg.ERROR.getStr(),
					JOptionPane.ERROR_MESSAGE);
		} else {
			inserirLivro();
		}

	}

	private void inserirLivro() {
		Livro livro = preencherDadosEntrada();
		IControladorLivro controlador = FabricaControlador.getInstanciaControladorLivro();
		try {
			switch (TelaInserirLivro.idTela) {
			case Constt.ACTION_CADASTRAR:
				GUICadastro guiCadastro = new GUICadastro();
				guiCadastro.cadastrarGenerico(controlador, livro);
				break;
			case Constt.ACTION_ATUALIZAR:
				GUIAtualizacao guiAtualizar = new GUIAtualizacao();
				guiAtualizar.atualizarGenerico(controlador, livro);
				break;
			}
			jButtonCancelar.doClick();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
		}

	}

	private Livro preencherDadosEntrada() {
		String classificacao = jTextFieldClassificacao.getText().toUpperCase();
		String codigo = jFormattedTextFieldCodigo.getText();
		int edicao = Integer.parseInt(jTextFieldEdicao.getText());
		String editora = jTextFieldEditora.getText();
		String titulo = jTextFieldTitulo.getText();
		String autor = jTextFieldAutor.getText();
		int volume = Integer.parseInt(jTextFieldVolume.getText());
		String nTombo = jTextFieldNTombo.getText();
		int qtdLivros = Integer.parseInt(jTextFieldQtdLivros.getText());

		Livro livro = new Livro(classificacao, codigo, edicao, editora, titulo, autor, volume, nTombo, qtdLivros);
		return livro;
	}

	private boolean verificarEspacoBranco() {
		return (super.isInvalid(jTextFieldClassificacao) || super.isInvalid(jFormattedTextFieldCodigo)
				|| super.isInvalid(jTextFieldEdicao) || super.isInvalid(jTextFieldEditora)
				|| super.isInvalid(jTextFieldTitulo) || super.isInvalid(jTextFieldAutor)
				|| super.isInvalid(jTextFieldVolume) || super.isInvalid(jTextFieldNTombo));
	}

	protected void acaoBotaoLimpar() {
		if (idTela.equals(Constt.ACTION_CADASTRAR)) {
			jFormattedTextFieldCodigo.setText(Msg.VAZIO.getStr());
		}
		jTextFieldClassificacao.setText(Msg.VAZIO.getStr());
		jTextFieldEdicao.setText(Msg.VAZIO.getStr());
		jTextFieldEditora.setText(Msg.VAZIO.getStr());
		jTextFieldTitulo.setText(Msg.VAZIO.getStr());
		jTextFieldAutor.setText(Msg.VAZIO.getStr());
		jTextFieldVolume.setText(Msg.VAZIO.getStr());
		jTextFieldNTombo.setText(Msg.VAZIO.getStr());
		jTextFieldQtdLivros.setText(Msg.VAZIO.getStr());
	}


	private javax.swing.JButton jButtonCancelar;
	private javax.swing.JButton jButtonClean;
	private javax.swing.JButton jButtonOK;
	private javax.swing.JFormattedTextField jFormattedTextFieldCodigo;
	private javax.swing.JLabel jLabelFundo;
	private javax.swing.JLabel jLabelTituloLivro;
	private javax.swing.JTextField jTextFieldAutor;
	private javax.swing.JTextField jTextFieldClassificacao;
	private javax.swing.JTextField jTextFieldEdicao;
	private javax.swing.JTextField jTextFieldEditora;
	private javax.swing.JTextField jTextFieldNTombo;
	private javax.swing.JTextField jTextFieldQtdLivros;
	private javax.swing.JTextField jTextFieldTitulo;
	private javax.swing.JTextField jTextFieldVolume;

	
	private void construtor() {
		super.alterarLayout();
		initComponents();
		try {
			jTextFieldVolume.setDocument(new LimiteDigitosECaractere(2));
			jTextFieldQtdLivros.setDocument(new LimiteDigitosECaractere(2));
			jTextFieldEdicao.setDocument(new LimiteDigitosECaractere(2));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
		}
	}

	private void construtor(String idTela) {
		super.alterarLayout();
		initComponents();
		try {
			jTextFieldVolume.setDocument(new LimiteDigitosECaractere(3));
			jTextFieldQtdLivros.setDocument(new LimiteDigitosECaractere(2));
			jTextFieldEdicao.setDocument(new LimiteDigitosECaractere(2));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
		}

		TelaInserirLivro.idTela = idTela;
		jLabelTituloLivro.setText(TelaInserirLivro.idTela);
	}

	private void construtor(String idTela, Livro livro) {
		super.alterarLayout();
		initComponents();
		try {
			jTextFieldVolume.setDocument(new LimiteDigitosECaractere(3));
			jTextFieldQtdLivros.setDocument(new LimiteDigitosECaractere(2));
			jTextFieldEdicao.setDocument(new LimiteDigitosECaractere(2));
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
		}

		TelaInserirLivro.idTela = idTela;
		jLabelTituloLivro.setText(TelaInserirLivro.idTela);
		this.jTextFieldClassificacao.setText(livro.getClassificacao());
		this.jFormattedTextFieldCodigo.setText(livro.getCodigo());
		this.jFormattedTextFieldCodigo.setEnabled(false);
		this.jTextFieldEdicao.setText(String.valueOf(livro.getEdicao()));
		this.jTextFieldEditora.setText(livro.getEditora());
		this.jTextFieldTitulo.setText(livro.getTitulo());
		this.jTextFieldAutor.setText(livro.getAutor());
		this.jTextFieldVolume.setText(String.valueOf(livro.getVolume()));
		this.jTextFieldNTombo.setText(livro.getNumeroDeTombo());
		this.jTextFieldQtdLivros.setText(String.valueOf(livro.getQtdLivros()));
	}
}
