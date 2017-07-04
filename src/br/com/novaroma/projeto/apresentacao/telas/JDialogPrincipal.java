
package br.com.novaroma.projeto.apresentacao.telas;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import javax.swing.JDialog;

public abstract class JDialogPrincipal extends JDialog {

	
	private static final long serialVersionUID = 1L;


	public JDialogPrincipal() {
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Frame arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Dialog owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Window owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Frame owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Dialog owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Dialog owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Window owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Window owner, String title, ModalityType modalityType) {
		super(owner, title, modalityType);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Frame owner, String title, boolean modal, GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Dialog owner, String title, boolean modal, GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		// TODO Auto-generated constructor stub
	}

	public JDialogPrincipal(Window owner, String title, ModalityType modalityType, GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		// TODO Auto-generated constructor stub
	}

         protected String reformatarCpf(String cpf){
           
            String cpfNovo = "";
            for(int i = 0; i < cpf.length(); i++){
                 cpfNovo+= cpf.charAt(i);
                    if(i==2 || i==5 || i ==8){
                         cpfNovo += ".";
                    }
            }
          return cpfNovo;    
        }
         
         
         
        protected String reformatarCep(String cep){
           String cepNovo = "";
           for(int i = 0; i < cep.length(); i++){
             cepNovo+= cep.charAt(i);
             if(i==1){
               cepNovo += ".";
             }   
             if(i==4){
               cepNovo += "-";
            }
           }
           return cepNovo;
        }
        
        
        protected String reformatarTelefone(String tel){
            String telNovo = "";
            for(int i = 0; i < tel.length(); i++){
             
              if(i==0){
                telNovo += "(";
              }  
              telNovo+= tel.charAt(i); 
              if(i==1){
                  telNovo += ")";
              }

              if(i==5){
                  telNovo += "-";
              }
           }
           return telNovo;
        }
        
        
}
