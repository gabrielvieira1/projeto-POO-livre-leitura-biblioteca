
package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.apresentacao.tela.gui.GUIRemocao;
import br.com.novaroma.projeto.apresentacao.tela.gui.GUIConsulta;
import br.com.novaroma.projeto.apresentacao.tela.gui.GUIAtualizacao;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TelaBusca extends JFramePrincipal {


	private static final long serialVersionUID = 1L;
	private static String idTela;
    private static String entidadeEscolhida;
    private static boolean booClick;

    public TelaBusca() {
        super();

        super.alterarLayout();
        initComponents();
        TelaBusca.idTela = Msg.VAZIO.getStr();
        TelaBusca.entidadeEscolhida =  Msg.VAZIO.getStr();
        TelaBusca.booClick = false;
    }

    public TelaBusca(String idTela) {
        super();
        super.alterarLayout();

        initComponents();
        TelaBusca.idTela = idTela;
        jTextFieldCampoPesquisa.setText(getText());
        jTextFieldCampoPesquisa.setFocusable(false);
        TelaBusca.booClick = false;
    }

    public TelaBusca(String entidadeEscolhida, String idTela) {
        super();
        super.alterarLayout();

        initComponents();
        TelaBusca.idTela = idTela;
        TelaBusca.entidadeEscolhida = entidadeEscolhida;
        jTextFieldCampoPesquisa.setText(getText());
        jTextFieldCampoPesquisa.setFocusable(false);
        TelaBusca.booClick = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldCampoPesquisa = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busca - LivreLeitura");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCampoPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCampoPesquisa.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCampoPesquisa.setToolTipText("");
        jTextFieldCampoPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCampoPesquisaFocusGained(evt);
            }
        });
        jTextFieldCampoPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldCampoPesquisaMousePressed(evt);
            }
        });
        jTextFieldCampoPesquisa.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTextFieldCampoPesquisaComponentShown(evt);
            }
        });
        jTextFieldCampoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCampoPesquisaActionPerformed(evt);
            }
        });
        jTextFieldCampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCampoPesquisaKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldCampoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 105, 233, 25));

        jButtonPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/busc1.jpeg"))); // NOI18N
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 102, 32, 32));

        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/back.png"))); // NOI18N
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 102, 32, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/BuscaBlackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 200));

        setBounds(407, 295, 534, 229);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCampoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCampoPesquisaActionPerformed

    }

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();

    }

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
        if (verificarEspacoBranco()) {
            JOptionPane.showMessageDialog(rootPane, Msg.CAMPO_VAZIO.getStr(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
            acaoBotaoLimpar();
        } else {
            buscarOpcaoSelect();
        }
    }

    private void jTextFieldCampoPesquisaFocusGained(java.awt.event.FocusEvent evt) {

    }

    private void jTextFieldCampoPesquisaComponentShown(java.awt.event.ComponentEvent evt) {
       
    }

    private void jTextFieldCampoPesquisaMousePressed(java.awt.event.MouseEvent evt) {
        if (!booClick) {
            jTextFieldCampoPesquisa.setText(Msg.VAZIO.getStr());
            jTextFieldCampoPesquisa.setForeground(Color.BLACK);
            jTextFieldCampoPesquisa.setFocusable(true);
            jTextFieldCampoPesquisa.requestFocus();
            TelaBusca.booClick = true;
        }
    }

    private void jTextFieldCampoPesquisaKeyPressed(java.awt.event.KeyEvent evt) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBusca().setVisible(true);
            }
        });
    }

    private void buscarOpcaoSelect() {
        String txtCampoPesquisa = (String) jTextFieldCampoPesquisa.getText();

        try {
            switch (idTela) {
                case Constt.ACTION_REMOVER:
                	GUIRemocao guiRemocao = new GUIRemocao(entidadeEscolhida, txtCampoPesquisa);
                	guiRemocao.remover();
                    break;
                case Constt.ACTION_ATUALIZAR:
                	GUIAtualizacao guiAtualizar = new GUIAtualizacao(entidadeEscolhida, txtCampoPesquisa);
                    guiAtualizar.verificarTelaAtualizar();
                    break;
                case Constt.ACTION_CONSULTAR:
                	GUIConsulta guiConsulta = new GUIConsulta(entidadeEscolhida, txtCampoPesquisa);
                    guiConsulta.consultar();
                    break;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        } finally {
            this.dispose();
        }
    }

    protected void acaoBotaoLimpar() {
        jTextFieldCampoPesquisa.setText(Msg.VAZIO.getStr());
    }

    private boolean verificarEspacoBranco() {
        return super.isInvalid(jTextFieldCampoPesquisa);
    }

    public String getText() {
        String txt =  Msg.VAZIO.getStr();;
        if (TelaBusca.idTela.equals(Constt.ACTION_REMOVER) || TelaBusca.idTela.equals(Constt.ACTION_ATUALIZAR)) {
            if (entidadeEscolhida.equals(Constt.ENTIDADE_CLIENTE) || entidadeEscolhida.equals(Constt.ENTIDADE_FUNCIONARIO)) {
                return Msg.BUSCA_CPF.getStr();
            } else {
                return Msg.BUSCA_CODIGO.getStr();
            }
        } else if (TelaBusca.idTela.equals(Constt.ACTION_CONSULTAR)) {
            return Msg.BUSCA.getStr();
        } else {
            return Msg.BUSCA_CPF.getStr();
        }
    }


    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldCampoPesquisa;
}
