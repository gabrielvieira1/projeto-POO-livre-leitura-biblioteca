package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.apresentacao.tela.gui.GUIAtualizacao;
import br.com.novaroma.projeto.apresentacao.tela.gui.GUICadastro;

import br.com.novaroma.projeto.entidades.Endereco;
import br.com.novaroma.projeto.entidades.Cliente;
import br.com.novaroma.projeto.entidades.Funcionario;
import br.com.novaroma.projeto.entidades.Pessoa;
import br.com.novaroma.projeto.negocio.FabricaControlador;
import br.com.novaroma.projeto.negocio.IControladorCliente;
import br.com.novaroma.projeto.negocio.IControladorFuncionario;
import br.com.novaroma.projeto.negocio.LimiteDigitosECaractere;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

import javax.swing.JOptionPane;


public class TelaInserirPessoa extends JFramePrincipal {

   
	private static final long serialVersionUID = 1L;
	
    private static String idTela = Msg.VAZIO.getStr();
    private Cliente cliente;

    public TelaInserirPessoa() {
        super();
        construtor();
    }

    public TelaInserirPessoa(String idTela) {
        super();
        construtor(idTela);

    }

    public TelaInserirPessoa(String idTela, Pessoa pessoa) {
        super();
        construtor(idTela, pessoa);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelTituloCliente = new javax.swing.JLabel();
        jLabelIconLogin = new javax.swing.JLabel();
        jLabelIconSenha = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jTextFieldSenha = new javax.swing.JTextField();
        jButtonClean = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inserir - LivreLeitura");
        setExtendedState(6);
        getContentPane().setLayout(null);

        jButtonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/ok.png"))); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOK);
        jButtonOK.setBounds(540, 630, 70, 25);

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar);
        jButtonCancelar.setBounds(720, 630, 110, 25);

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(208, 215, 225, 30);

        jTextFieldSobrenome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSobrenomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSobrenome);
        jTextFieldSobrenome.setBounds(450, 215, 225, 30);

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFormattedTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCpfActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldCpf);
        jFormattedTextFieldCpf.setBounds(208, 371, 232, 30);

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jFormattedTextFieldTelefone);
        jFormattedTextFieldTelefone.setBounds(208, 449, 233, 30);

        jTextFieldRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldRua.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jTextFieldRua);
        jTextFieldRua.setBounds(872, 215, 438, 30);

        jTextFieldBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBairro);
        jTextFieldBairro.setBounds(872, 298, 436, 30);
        jTextFieldBairro.getAccessibleContext().setAccessibleDescription("");

        jTextFieldComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldComplemento.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jTextFieldComplemento);
        jTextFieldComplemento.setBounds(873, 382, 435, 29);
        jTextFieldComplemento.getAccessibleContext().setAccessibleName("");

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFormattedTextFieldCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCepActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldCep);
        jFormattedTextFieldCep.setBounds(873, 532, 247, 30);
        jFormattedTextFieldCep.getAccessibleContext().setAccessibleDescription("");

        jTextFieldIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdade);
        jTextFieldIdade.setBounds(207, 290, 60, 30);

        jTextFieldNumero.setVerifyInputWhenFocusTarget(false);
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNumero);
        jTextFieldNumero.setBounds(872, 457, 59, 29);

        jLabelTituloCliente.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        getContentPane().add(jLabelTituloCliente);
        jLabelTituloCliente.setBounds(610, 20, 450, 50);

        jLabelIconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/Login.png"))); // NOI18N
        jLabelIconLogin.setText("LOGIN:");
        getContentPane().add(jLabelIconLogin);
        jLabelIconLogin.setBounds(150, 500, 120, 50);

        jLabelIconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/senha.png"))); // NOI18N
        jLabelIconSenha.setText(" SENHA:");
        getContentPane().add(jLabelIconSenha);
        jLabelIconSenha.setBounds(150, 550, 110, 60);

        jTextFieldLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextFieldLogin);
        jTextFieldLogin.setBounds(250, 510, 190, 30);

        jTextFieldSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jTextFieldSenha);
        jTextFieldSenha.setBounds(250, 560, 190, 30);

        jButtonClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/eraser.png"))); // NOI18N
        jButtonClean.setText("Limpar");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClean);
        jButtonClean.setBounds(620, 630, 90, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/novaroma/projeto/apresentacao/images/backgroundInserirPessoa.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -70, 1450, 840);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairroActionPerformed

    private void jTextFieldSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSobrenomeActionPerformed

    private void jTextFieldIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdadeActionPerformed
    }//GEN-LAST:event_jTextFieldIdadeActionPerformed

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

   
    private void jFormattedTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfActionPerformed

    private void jFormattedTextFieldCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCepActionPerformed

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        acaoBotaoLimpar();
    }//GEN-LAST:event_jButtonCleanActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInserirPessoa().setVisible(true);
            }
        });
    }
    
    
   

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        if (idTela.contains(Constt.ACTION_CADASTRAR_CLIENTE)) {
            TelaCadastro t = new TelaCadastro();
            t.setVisible(true);
        } else if (idTela.contains(Constt.ACTION_CADASTRAR_FUNCIONARIO)) {
            TelaGerencial t = new TelaGerencial();
            t.setVisible(true);
        }
        this.dispose();
    }

    
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        if (verificarEspacoBranco()) {
            JOptionPane.showMessageDialog(rootPane, Msg.CAMPOS_VAZIOS.getStr(), Msg.ERROR.getStr(), JOptionPane.INFORMATION_MESSAGE);
        } else {
            inserirPessoa();
        }

    }
    
    private void inserirPessoa() {
        Funcionario funcionario = null;
        Cliente clienteNovo = null; 
        IControladorCliente controladorC = FabricaControlador.getInstanciaControladorCliente();
        IControladorFuncionario controladorF = FabricaControlador.getInstanciaControladorFuncionario();
        
        if(idTela.contains(Constt.FUNCIONARIO)){
        	funcionario = (Funcionario) preencherDadosEntrada();
        }else{
        	clienteNovo = (Cliente) preencherDadosEntrada();
        }

        GUICadastro guiCadastro = new GUICadastro();
        GUIAtualizacao guiAtualizacao = new GUIAtualizacao();
        try {
            switch (TelaInserirPessoa.idTela) {
                case Constt.ACTION_CADASTRAR_CLIENTE:
                	guiCadastro.cadastrarGenerico(controladorC, clienteNovo);
                    break;
                case Constt.ACTION_ATUALIZAR_CLIENTE:
                    guiAtualizacao.atualizarGenerico(controladorC, clienteNovo);
                    break;
                case Constt.ACTION_CADASTRAR_FUNCIONARIO:
                    guiCadastro.cadastrarGenerico(controladorF, funcionario);
                    break;
                case Constt.ACTION_ATUALIZAR_FUNCIONARIO:
                    guiAtualizacao.atualizarGenerico(controladorF, funcionario);
                    break;
               }

            jButtonCancelar.doClick();

        } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private Pessoa preencherDadosEntrada() {

        String nome = jTextFieldNome.getText();
        String sobrenome = jTextFieldSobrenome.getText();
        int idade = Integer.parseInt(jTextFieldIdade.getText());
        String cpf = super.retirarCaracterEspecial(jFormattedTextFieldCpf.getText());
        String tel = super.retirarCaracterEspecial(jFormattedTextFieldTelefone.getText());
        String rua = jTextFieldRua.getText();
        String bairro = jTextFieldBairro.getText();
        String complemento = jTextFieldComplemento.getText();
        int num = Integer.parseInt(jTextFieldNumero.getText());
        String cep = super.retirarCaracterEspecial(jFormattedTextFieldCep.getText());
        Endereco endereco = new Endereco(rua, bairro, num, cep, complemento);

        if (idTela.contains(Constt.FUNCIONARIO)) {
            String login = jTextFieldLogin.getText();
            String senha = jTextFieldSenha.getText();
            Funcionario funcionario = new Funcionario(nome, sobrenome, idade, cpf, tel, endereco, login, senha);
            return funcionario;
        } else {
            Cliente clienteNovo = new Cliente(nome, sobrenome, idade, cpf, tel, endereco);
            if (TelaInserirPessoa.idTela.equals(Constt.ACTION_ATUALIZAR_CLIENTE)) {
                clienteNovo.setContadorLivro(this.cliente.getContadorLivro());
            }
           return clienteNovo;
        }
    }

    private boolean verificarEspacoBranco() {
        return (super.isInvalid(jTextFieldBairro) || super.isInvalid(jTextFieldComplemento)
                || super.isInvalid(jTextFieldIdade) || super.isInvalid(jTextFieldNome)
                || super.isInvalid(jTextFieldNumero) || super.isInvalid(jTextFieldRua)
                || super.isInvalid(jTextFieldSobrenome) || super.isInvalid(jFormattedTextFieldCep)
                || super.isInvalid(jFormattedTextFieldCpf) || super.isInvalid(jFormattedTextFieldTelefone));

    }

    protected void acaoBotaoLimpar() {
        if (idTela.contains(Constt.ACTION_CADASTRAR)) {
            jFormattedTextFieldCpf.setText(Msg.VAZIO.getStr());
        }
        jTextFieldBairro.setText(Msg.VAZIO.getStr());
        jTextFieldComplemento.setText(Msg.VAZIO.getStr());
        jTextFieldIdade.setText(Msg.VAZIO.getStr());
        jTextFieldNome.setText(Msg.VAZIO.getStr());
        jTextFieldNumero.setText(Msg.VAZIO.getStr());
        jTextFieldRua.setText(Msg.VAZIO.getStr());
        jTextFieldSobrenome.setText(Msg.VAZIO.getStr());
        jFormattedTextFieldCep.setText(Msg.VAZIO.getStr());
        jFormattedTextFieldTelefone.setText(Msg.VAZIO.getStr());
    }


    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIconLogin;
    private javax.swing.JLabel jLabelIconSenha;
    private javax.swing.JLabel jLabelTituloCliente;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldSobrenome;

    private void construtor() {
        super.alterarLayout();
        initComponents();
       try {
            jTextFieldIdade.setDocument(new LimiteDigitosECaractere(3));
            jTextFieldNumero.setDocument(new LimiteDigitosECaractere(5));
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        }
        jLabelIconLogin.setVisible(false);
        jTextFieldLogin.setVisible(false);
        jLabelIconSenha.setVisible(false);
        jTextFieldSenha.setVisible(false);
    }

    private void construtor(String idTela) {
        super.alterarLayout();
        initComponents();

        try {
            jTextFieldIdade.setDocument(new LimiteDigitosECaractere(3));
            jTextFieldNumero.setDocument(new LimiteDigitosECaractere(5));
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        }
        TelaInserirPessoa.idTela = idTela;
        jLabelTituloCliente.setText(TelaInserirPessoa.idTela);
        if (idTela.equals(Constt.ACTION_CADASTRAR_FUNCIONARIO)) {
            jLabelIconLogin.setVisible(true);
            jTextFieldLogin.setVisible(true);
            jLabelIconSenha.setVisible(true);
            jTextFieldSenha.setVisible(true);
        } else {
            jLabelIconLogin.setVisible(false);
            jTextFieldLogin.setVisible(false);
            jLabelIconSenha.setVisible(false);
            jTextFieldSenha.setVisible(false);
        }
    }

    private void construtor(String idTela, Pessoa pessoa) {
        super.alterarLayout();
        initComponents();

        try {
            jTextFieldIdade.setDocument(new LimiteDigitosECaractere(3));
            jTextFieldNumero.setDocument(new LimiteDigitosECaractere(5));
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, ex.getMessage(), Msg.ERROR.getStr(), JOptionPane.ERROR_MESSAGE);
        }

        TelaInserirPessoa.idTela = idTela;
        jLabelTituloCliente.setText(TelaInserirPessoa.idTela);
        this.jTextFieldNome.setText(pessoa.getNome());
        this.jTextFieldSobrenome.setText(pessoa.getSobrenome());
        this.jTextFieldIdade.setText(String.valueOf(pessoa.getIdade()));
        this.jFormattedTextFieldCpf.setText(pessoa.getCpf());
        this.jFormattedTextFieldCpf.setEditable(false);
        this.jFormattedTextFieldTelefone.setText(pessoa.getTelefone());
        this.jTextFieldRua.setText(pessoa.getEndereco().getRua());
        this.jTextFieldBairro.setText(String.valueOf(pessoa.getEndereco().getBairro()));
        this.jTextFieldComplemento.setText(pessoa.getEndereco().getComplemento());
        this.jTextFieldNumero.setText(String.valueOf(pessoa.getEndereco().getNumero()));
        this.jFormattedTextFieldCep.setText(pessoa.getEndereco().getCep());

        if (pessoa instanceof Funcionario) {
            Funcionario func = (Funcionario) pessoa;
            jLabelIconLogin.setVisible(true);
            jTextFieldLogin.setVisible(true);
            jLabelIconSenha.setVisible(true);
            jTextFieldSenha.setVisible(true);
            this.jTextFieldLogin.setText(func.getLogin());
            this.jTextFieldSenha.setText(func.getSenha());

        } else {
            jLabelIconLogin.setVisible(false);
            jTextFieldLogin.setVisible(false);
            jLabelIconSenha.setVisible(false);
            jTextFieldSenha.setVisible(false);
            this.cliente = (Cliente) pessoa;
        }

    }

}
