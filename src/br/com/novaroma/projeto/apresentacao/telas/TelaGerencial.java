package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.apresentacao.tela.gui.GUILista;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import javax.swing.JOptionPane;

public class TelaGerencial extends JFramePrincipal {

    
	private static final long serialVersionUID = 1L;
	private String idTela = "";

    public TelaGerencial() {
        super();
        super.alterarLayout();
        initComponents();
        jComboBoxOpcao.setVisible(false);
        jButtonOK.setVisible(false);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButtonCadastro = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jComboBoxOpcao = new javax.swing.JComboBox<>();
        jButtonOK = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonVoltar2 = new javax.swing.JButton();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerência - LivreLeitura");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel2.setText("Funcionário");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel4.setText("Cadastrar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 135, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("ACESSO GERENCIAL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 85, 110, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel5.setText("Consultar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 135, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel6.setText("Listar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 135, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel7.setText("Funcionário");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel8.setText("Funcionário");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel10.setText("Remover");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 135, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel11.setText("Atualizar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 135, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel12.setText("Funcionário");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel13.setText("Funcionário");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/logoFundo2.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jButtonCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/funcionario.png"))); // NOI18N
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 90, 80));

        jButtonAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Atualizar2.png"))); // NOI18N
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 90, 80));

        jButtonRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Remover2.png"))); // NOI18N
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, 80));

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Consulta.png"))); // NOI18N
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 90, 80));

        jButtonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Listar.png"))); // NOI18N
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 90, 80));

        jComboBoxOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionário", "Empréstimo" }));
        jComboBoxOpcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOpcaoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxOpcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 100, -1));

        jButtonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/ok.png"))); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, 25));

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Sair.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, 30));

        jButtonVoltar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/voltar.png"))); // NOI18N
        jButtonVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 30, 20));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Fundo2.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 370));

        setSize(new java.awt.Dimension(753, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
        TelaInserirPessoa p = new TelaInserirPessoa(Constt.ACTION_CADASTRAR_FUNCIONARIO);
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCadastroActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        idTela = Constt.ACTION_ATUALIZAR;
        abrirBusca();

    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        idTela = Constt.ACTION_REMOVER;
        abrirBusca();
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        idTela = Constt.ACTION_CONSULTAR;
        jComboBoxOpcao.setVisible(true);

    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        idTela = Constt.ACTION_LISTAR;
        jComboBoxOpcao.setVisible(true);

    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jComboBoxOpcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOpcaoActionPerformed
        jButtonOK.setVisible(true);
    }//GEN-LAST:event_jComboBoxOpcaoActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        String entidadeEscolhida = (String) jComboBoxOpcao.getSelectedItem();
        if (idTela.equals(Constt.ACTION_CONSULTAR)) {
            abrirBusca(entidadeEscolhida);
        } else {
            GUILista guiLista = new GUILista(entidadeEscolhida);
            guiLista.listar();
        }
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        JOptionPane.showMessageDialog(null, Msg.FINALIZAR.getStr(), Msg.LIVRE_LEITURA.getStr(), 1);
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltar2ActionPerformed
        TelaLogin l = new TelaLogin();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltar2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerencial().setVisible(true);
            }
        });
    }

    private void abrirBusca() {
        TelaBusca busca = new TelaBusca(Constt.ENTIDADE_FUNCIONARIO, idTela);
        busca.setVisible(true);
    }

    private void abrirBusca(String entidadeEscolha) {
        TelaBusca busca = new TelaBusca(entidadeEscolha, idTela);
        busca.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVoltar2;
    private javax.swing.JComboBox<String> jComboBoxOpcao;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFundo;
    // End of variables declaration//GEN-END:variables
}
