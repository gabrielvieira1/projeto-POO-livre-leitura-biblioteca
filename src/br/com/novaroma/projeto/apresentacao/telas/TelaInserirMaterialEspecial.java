package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.apresentacao.tela.gui.GUIAtualizacao;
import br.com.novaroma.projeto.apresentacao.tela.gui.GUICadastro;
import static br.com.novaroma.projeto.util.Constantes.*;

import br.com.novaroma.projeto.entidades.MaterialEspecial;
import br.com.novaroma.projeto.negocio.FabricaControlador;
import br.com.novaroma.projeto.negocio.IControladorCliente;
import br.com.novaroma.projeto.negocio.IControladorFuncionario;
import br.com.novaroma.projeto.negocio.IControladorMaterialEspecial;
import br.com.novaroma.projeto.negocio.LimiteDigitosECaractere;
import br.com.novaroma.projeto.util.Constantes;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import static br.com.novaroma.projeto.util.Messages.*;
import com.sun.org.apache.bcel.internal.Constants;
import javax.swing.JOptionPane;

public class TelaInserirMaterialEspecial extends JFramePrincipal {

	private static final long serialVersionUID = 1L;
	private static String idTela = Msg.VAZIO.getStr();

    public TelaInserirMaterialEspecial() {
        super();
        construtor();
    }

    public TelaInserirMaterialEspecial(String idTela) {
        super();
        construtor(idTela);
    }

    public TelaInserirMaterialEspecial(String idTela, MaterialEspecial materialEspecial) {
        super();
        construtor(idTela, materialEspecial);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldClassificacao = new javax.swing.JTextField();
        jTextFieldEdicao = new javax.swing.JTextField();
        jTextFieldEditora = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jFormattedTextFieldCodigo = new javax.swing.JFormattedTextField();
        jLabelTituloMaterialEspecial = new javax.swing.JLabel();
        jButtonClean = new javax.swing.JButton();
        jLabelOK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inserir Material Especial - LivreLeitura");
        setExtendedState(6);
        getContentPane().setLayout(null);

        jTextFieldMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMarca);
        jTextFieldMarca.setBounds(208, 260, 270, 30);

        jTextFieldClassificacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldClassificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClassificacaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldClassificacao);
        jTextFieldClassificacao.setBounds(904, 268, 270, 30);

        jTextFieldEdicao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEdicao);
        jTextFieldEdicao.setBounds(903, 432, 271, 30);
        jTextFieldEdicao.getAccessibleContext().setAccessibleDescription("");

        jTextFieldEditora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldEditora.setInheritsPopupMenu(true);
        jTextFieldEditora.setVerifyInputWhenFocusTarget(false);
        jTextFieldEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditoraActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEditora);
        jTextFieldEditora.setBounds(903, 510, 270, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/ok.png"))); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 630, 70, 25);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(740, 630, 100, 25);

        try {
            jFormattedTextFieldCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFormattedTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldCodigo);
        jFormattedTextFieldCodigo.setBounds(903, 351, 272, 30);

        jLabelTituloMaterialEspecial.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        getContentPane().add(jLabelTituloMaterialEspecial);
        jLabelTituloMaterialEspecial.setBounds(610, 20, 210, 50);

        jButtonClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/eraser.png"))); // NOI18N
        jButtonClean.setText("Limpar");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClean);
        jButtonClean.setBounds(640, 630, 90, 25);

        jLabelOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/backgroundInserirMaterialEspecial.jpg"))); // NOI18N
        getContentPane().add(jLabelOK);
        jLabelOK.setBounds(0, 0, 1370, 700);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldClassificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClassificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClassificacaoActionPerformed

    private void jTextFieldEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEdicaoActionPerformed

    private void jTextFieldMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarcaActionPerformed

    private void jTextFieldEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditoraActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       if(idTela.equals(Constt.ACTION_CADASTRAR)){
           TelaCadastro tela = new TelaCadastro();
           tela.setVisible(true);
           this.dispose();
       }else{
           this.dispose();
       }
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (verificarEspacoBranco()) {
            JOptionPane.showMessageDialog(rootPane, Msg.CAMPOS_VAZIOS.getStr(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        } else {
            inserirMaterialEspecial();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCodigoActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        acaoBotaoLimpar();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaInserirMaterialEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInserirMaterialEspecial().setVisible(true);
            }
        });
    }

    private void inserirMaterialEspecial() {
        MaterialEspecial materialEspecial = preencherDadosEntrada();
    	IControladorMaterialEspecial controlador = FabricaControlador.getInstanciaControladorMaterialEspecial();
        try {
            switch (TelaInserirMaterialEspecial.idTela) {
                case Constt.ACTION_CADASTRAR:
                	GUICadastro guiCadastro = new GUICadastro();
                    guiCadastro.cadastrarGenerico(controlador, materialEspecial);
                    break;
                case Constt.ACTION_ATUALIZAR:
                	GUIAtualizacao guiAtualizar = new GUIAtualizacao();
                	guiAtualizar.atualizarGenerico(controlador, materialEspecial);
                    break;
            }
            jButtonCancelar.doClick();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        } 
       
    }

    private MaterialEspecial preencherDadosEntrada() {
        String classificacao = jTextFieldClassificacao.getText().toUpperCase();
        String codigo = jFormattedTextFieldCodigo.getText();
        int edicao = Integer.parseInt(jTextFieldEdicao.getText());
        String editora = jTextFieldEditora.getText();
        String marca = jTextFieldMarca.getText();

        MaterialEspecial materialEspecial = new MaterialEspecial(classificacao, codigo, edicao, editora, marca);
        return materialEspecial;
    }

    private boolean verificarEspacoBranco() {
        return (super.isInvalid(jTextFieldClassificacao) || super.isInvalid(jFormattedTextFieldCodigo)
                || super.isInvalid(jTextFieldEdicao) || super.isInvalid(jTextFieldEditora)
                || super.isInvalid(jTextFieldMarca));
    }

    protected void acaoBotaoLimpar() {
        if (idTela.equals(Constt.ACTION_CADASTRAR)) {
            jFormattedTextFieldCodigo.setText(Msg.VAZIO.getStr());
        }
        jTextFieldClassificacao.setText(Msg.VAZIO.getStr());
        jFormattedTextFieldCodigo.setText(Msg.VAZIO.getStr());
        jTextFieldEdicao.setText(Msg.VAZIO.getStr());
        jTextFieldEditora.setText(Msg.VAZIO.getStr());
        jTextFieldMarca.setText(Msg.VAZIO.getStr());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JFormattedTextField jFormattedTextFieldCodigo;
    private javax.swing.JLabel jLabelOK;
    private javax.swing.JLabel jLabelTituloMaterialEspecial;
    private javax.swing.JTextField jTextFieldClassificacao;
    private javax.swing.JTextField jTextFieldEdicao;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldMarca;
    // End of variables declaration//GEN-END:variables

    private void construtor() {
        super.alterarLayout();
        initComponents();
        try {
            jTextFieldEdicao.setDocument(new LimiteDigitosECaractere(2));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private void construtor(String idTela) {
        super.alterarLayout();
        initComponents();
        try {
            jTextFieldEdicao.setDocument(new LimiteDigitosECaractere(2));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        }
        TelaInserirMaterialEspecial.idTela = idTela;
        jLabelTituloMaterialEspecial.setText(TelaInserirMaterialEspecial.idTela);
    }

    private void construtor(String idTela, MaterialEspecial materialEspecial) {

        super.alterarLayout();
        initComponents();
        try {
            jTextFieldEdicao.setDocument(new LimiteDigitosECaractere(2));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        }
        TelaInserirMaterialEspecial.idTela = idTela;
        jLabelTituloMaterialEspecial.setText(TelaInserirMaterialEspecial.idTela);
        this.jTextFieldClassificacao.setText(materialEspecial.getClassificacao());
        this.jFormattedTextFieldCodigo.setText(materialEspecial.getCodigo());
        this.jFormattedTextFieldCodigo.setEnabled(false);
        this.jTextFieldEdicao.setText(String.valueOf(materialEspecial.getEdicao()));
        this.jTextFieldEditora.setText(materialEspecial.getEditora());
        this.jTextFieldMarca.setText(materialEspecial.getMarca());
    }
}
