package br.com.novaroma.projeto.apresentacao.telas;
import br.com.novaroma.projeto.apresentacao.tela.gui.GUICadastro;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;


public class TelaCadastro extends JFramePrincipal {

	private static final long serialVersionUID = 1L;
	private static String idTela = Msg.VAZIO.getStr();
   
    public TelaCadastro() {
        super();
        super.alterarLayout();
        initComponents();
        jButtonOK.setVisible(false);
        jComboBoxOpcaoEntidades.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButtonInserir = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jComboBoxOpcaoEntidades = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro - LivreLeitura");
        setMinimumSize(new java.awt.Dimension(735, 389));
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Inserir.png"))); // NOI18N
        jButtonInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInserir);
        jButtonInserir.setBounds(190, 150, 80, 80);

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Remover2.png"))); // NOI18N
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemover);
        jButtonRemover.setBounds(320, 150, 80, 80);

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Atualizar2.png"))); // NOI18N
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar);
        jButtonAtualizar.setBounds(450, 150, 80, 80);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel1.setText("Inserir");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 130, 70, 16);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setText("Remover");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 130, 70, 16);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel4.setText("Atualizar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 130, 70, 16);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/logoFundo2.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(300, 10, 130, 90);

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/voltar.png"))); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(327, 310, 80, 20);

        jButtonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/ok.png"))); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOK);
        jButtonOK.setBounds(330, 270, 70, 23);

        jComboBoxOpcaoEntidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes", "Livros", "Material Especial" }));
        jComboBoxOpcaoEntidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcaoEntidadesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxOpcaoEntidades);
        jComboBoxOpcaoEntidades.setBounds(300, 240, 140, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Fundo2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 390);

        pack();
        setLocationRelativeTo(null);
    }

    private void jButtonInserirActionPerformed(java.awt.event.ActionEvent evt) {
        jComboBoxOpcaoEntidades.setVisible(true);
        jButtonOK.setVisible(false);
        idTela = Constt.ACTION_CADASTRAR;

    }

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {

        if (idTela.equals(Constt.ACTION_CADASTRAR)) {
            GUICadastro guiCadastro = new GUICadastro((String)jComboBoxOpcaoEntidades.getSelectedItem());
            guiCadastro.inserir();
            this.dispose();
        } else {
            abrirBusca();
        }

    }

    private void jComboBoxOpcaoEntidadesActionPerformed(java.awt.event.ActionEvent evt) {
        jButtonOK.setVisible(true);

    }

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {
        jComboBoxOpcaoEntidades.setVisible(true);
        jButtonOK.setVisible(false);
        idTela = Constt.ACTION_REMOVER;

    }

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        jComboBoxOpcaoEntidades.setVisible(true);
        jButtonOK.setVisible(false);
        idTela = Constt.ACTION_ATUALIZAR;

    }

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        TelaMenuPrincipal p = new TelaMenuPrincipal();
        p.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

   
    public void abrirBusca() {
        String entidadeEscolhida = (String) jComboBoxOpcaoEntidades.getSelectedItem();
        TelaBusca busca = new TelaBusca(entidadeEscolhida, idTela);
        busca.setVisible(true);
    }


    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonInserir;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonVoltar;
    public static javax.swing.JComboBox<String> jComboBoxOpcaoEntidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    
}
