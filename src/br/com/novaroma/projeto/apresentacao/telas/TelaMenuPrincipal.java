package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.apresentacao.tela.gui.GUILista;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import javax.swing.JOptionPane;

public class TelaMenuPrincipal extends JFramePrincipal {

	private static final long serialVersionUID = 1L;
	private static String idTela = Msg.VAZIO.getStr();

	public TelaMenuPrincipal() {
		super();
		super.alterarLayout();
		initComponents();
		jButtonOK.setVisible(false);
		jComboBoxOpcaoEntidades.setVisible(false);

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jMenuItem1 = new javax.swing.JMenuItem();
		buttonGroup1 = new javax.swing.ButtonGroup();
		buttonGroup2 = new javax.swing.ButtonGroup();
		jButtonConsultar = new javax.swing.JButton();
		jButtonListar = new javax.swing.JButton();
		jButtonEmprestar = new javax.swing.JButton();
		jButtonDevolver = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jButtonCadastrar = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jButtonSair = new javax.swing.JButton();
		jComboBoxOpcaoEntidades = new javax.swing.JComboBox<>();
		jButtonOK = new javax.swing.JButton();
		jButtonVoltar2 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();

		jMenuItem1.setText("jMenuItem1");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Menu - Leitura Livre");
		setMinimumSize(new java.awt.Dimension(735, 389));
		setResizable(false);
		getContentPane().setLayout(null);

		jButtonConsultar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Consulta.png"))); // NOI18N
		jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonConsultarActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonConsultar);
		jButtonConsultar.setBounds(220, 170, 80, 80);

		jButtonListar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Listar.png"))); // NOI18N
		jButtonListar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonListarActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonListar);
		jButtonListar.setBounds(320, 170, 80, 80);

		jButtonEmprestar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Emprestar.png"))); // NOI18N
		jButtonEmprestar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonEmprestarActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonEmprestar);
		jButtonEmprestar.setBounds(420, 170, 80, 80);

		jButtonDevolver.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/devolver.png"))); // NOI18N
		jButtonDevolver.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonDevolverActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonDevolver);
		jButtonDevolver.setBounds(520, 170, 80, 80);

		jLabel5.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
		jLabel5.setText("Consultar");
		getContentPane().add(jLabel5);
		jLabel5.setBounds(230, 150, 60, 16);

		jLabel6.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
		jLabel6.setText("Listar");
		getContentPane().add(jLabel6);
		jLabel6.setBounds(340, 150, 50, 16);

		jLabel8.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
		jLabel8.setText("Cadastrar");
		getContentPane().add(jLabel8);
		jLabel8.setBounds(130, 150, 70, 16);

		jLabel7.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
		jLabel7.setText("Emprestar");
		getContentPane().add(jLabel7);
		jLabel7.setBounds(430, 150, 70, 16);

		jLabel9.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/logoFundo2.png"))); // NOI18N
		getContentPane().add(jLabel9);
		jLabel9.setBounds(300, 10, 130, 90);

		jButtonCadastrar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Cadastrar.png"))); // NOI18N
		jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCadastrarActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonCadastrar);
		jButtonCadastrar.setBounds(120, 170, 80, 80);

		jLabel10.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
		jLabel10.setText("Devolver");
		getContentPane().add(jLabel10);
		jLabel10.setBounds(530, 150, 70, 16);

		jButtonSair.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Sair.png"))); // NOI18N
		jButtonSair.setText("Sair");
		jButtonSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSairActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonSair);
		jButtonSair.setBounds(330, 320, 70, 30);

		jComboBoxOpcaoEntidades.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Clientes", "Livros", "Material Especial", "Empréstimo", "Devolução" }));
		jComboBoxOpcaoEntidades.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxOpcaoEntidadesActionPerformed(evt);
			}
		});
		getContentPane().add(jComboBoxOpcaoEntidades);
		jComboBoxOpcaoEntidades.setBounds(300, 260, 140, 20);

		jButtonOK.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/ok.png"))); // NOI18N
		jButtonOK.setText("OK");
		jButtonOK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonOKActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonOK);
		jButtonOK.setBounds(330, 290, 70, 23);

		jButtonVoltar2.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/voltar.png"))); // NOI18N
		jButtonVoltar2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonVoltar2ActionPerformed(evt);
			}
		});
		getContentPane().add(jButtonVoltar2);
		jButtonVoltar2.setBounds(20, 330, 30, 20);

		jLabel2.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Fundo2.jpg"))); // NOI18N
		getContentPane().add(jLabel2);
		jLabel2.setBounds(0, 0, 740, 390);

		pack();
		setLocationRelativeTo(null);
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
			java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaMenuPrincipal().setVisible(true);
			}
		});
	}

	private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		abrirCadastrar();
	}
	
	private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {
		idTela = Constt.ACTION_CONSULTAR;
		jComboBoxOpcaoEntidades.setVisible(true);
	}

	private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {
		jComboBoxOpcaoEntidades.setVisible(true);
		idTela = Constt.ACTION_LISTAR;

	}

	private void jButtonEmprestarActionPerformed(java.awt.event.ActionEvent evt) {
		
		jComboBoxOpcaoEntidades.setVisible(false);
		jButtonOK.setVisible(false);
		abrirBusca(Constt.ACTION_EMPRESTAR);
	}

	private void jButtonDevolverActionPerformed(java.awt.event.ActionEvent evt) {

		jComboBoxOpcaoEntidades.setVisible(false);
		jButtonOK.setVisible(false);
		abrirBusca(Constt.ACTION_DEVOLVER);
	}
	
	private void jComboBoxOpcaoEntidadesActionPerformed(java.awt.event.ActionEvent evt) {
		jButtonOK.setVisible(true);
	}

	private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(null, Msg.FINALIZAR.getStr(), Msg.LIVRE_LEITURA.getStr(), 1);
		System.exit(0);
	}


	private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {
		String escolhaEntidade = (String) jComboBoxOpcaoEntidades.getSelectedItem();
		if (idTela.equals(Constt.ACTION_LISTAR)) {
			GUILista guiLista = new GUILista(escolhaEntidade);
			guiLista.listar();
		} else {
			abrirBusca();
		}
	}

	private void jButtonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {
		TelaLogin l = new TelaLogin();
		l.setVisible(true);
		this.dispose();
	}

	public void abrirBusca() {
		String escolhaEntidade = (String) jComboBoxOpcaoEntidades.getSelectedItem();
		TelaBusca busca = new TelaBusca(escolhaEntidade, idTela);
		busca.setVisible(true);
	}

	public void abrirBusca(String idTela) {
		TelaBuscaSecundario busca = new TelaBuscaSecundario(idTela);
		busca.setVisible(true);
	}

	public void abrirCadastrar() {
		TelaCadastro cadastro = new TelaCadastro();
		cadastro.setVisible(true);
		this.dispose();
	}
	


	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.JButton jButtonCadastrar;
	private javax.swing.JButton jButtonConsultar;
	private javax.swing.JButton jButtonDevolver;
	private javax.swing.JButton jButtonEmprestar;
	private javax.swing.JButton jButtonListar;
	private javax.swing.JButton jButtonOK;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JButton jButtonVoltar2;
	public static javax.swing.JComboBox<String> jComboBoxOpcaoEntidades;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenuItem jMenuItem1;

}
