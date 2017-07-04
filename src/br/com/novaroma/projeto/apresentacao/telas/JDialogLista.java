package br.com.novaroma.projeto.apresentacao.telas;

import br.com.novaroma.projeto.entidades.Devolucao;
import br.com.novaroma.projeto.entidades.Emprestimo;
import br.com.novaroma.projeto.entidades.Livro;
import br.com.novaroma.projeto.entidades.MaterialEspecial;
import br.com.novaroma.projeto.util.Msg;
import br.com.novaroma.projeto.entidades.Cliente;
import br.com.novaroma.projeto.entidades.Funcionario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class JDialogLista extends JDialogPrincipal {

	private static final long serialVersionUID = 1L;
	private ArrayList<Object> object;
	private DefaultTableModel modeloTabela;

	public JDialogLista(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		construtor();
	}

	public JDialogLista(java.awt.Frame parent, boolean modal, ArrayList<Object> ob) {
		super(parent, modal);
		construtor(ob);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTableListar = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("LivreLeitura");
		setResizable(false);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jTableListar.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] {

		}));
		jTableListar.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jTableListarAncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});
		jScrollPane1.setViewportView(jTableListar);

		getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1140, 560));

		pack();
		setLocationRelativeTo(null);
	}

	private void jTableListarAncestorAdded(javax.swing.event.AncestorEvent evt) {

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
			java.util.logging.Logger.getLogger(JDialogLista.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				JDialogLista dialog = new JDialogLista(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	private void construtor() {

		initComponents();
		jTableListar.setEnabled(false);
		jTableListar.getParent().setBackground(new Color(0, 219, 230));
		modeloTabela = new DefaultTableModel(null, identificarModelo());
		listar();
	}

	private void construtor(ArrayList<Object> ob) {
		initComponents();
		jTableListar.setEnabled(false);
		jTableListar.getParent().setBackground(new Color(0, 219, 230));
		setList(ob);
		modeloTabela = new DefaultTableModel(null, identificarModelo());
		listar();
	}

	private String[] identificarModelo() {
		String[] model = null;

		Object ob = this.object.get(0);

		if (ob instanceof Cliente) {
			model = new String[] { "Nome", "Sobrenome", "Idade", "Cpf", "Telefone", "Rua", "Bairro", "Nº", "Cep",
					"Complemento", "Emprestimos" };

		} else if (ob instanceof Livro) {
			model = new String[] { "Título", "Autor", "Classificação", "Código", "Edicao", "Editora", "Volume",
					"Nº Tombo", "Qtd Livros" };

		} else if (ob instanceof MaterialEspecial) {
			model = new String[] { "Marca", "Classificação", "Código", "Edicao", "Editora" };

		} else if (ob instanceof Emprestimo) {
			model = new String[] { "Nome", "Cpf", "Livro 1", "Data Emprestimo 1", "Funcionario 1", "Livro 2",
					"Data Emprestimo 2", "Funcionario 2", "Livro 3", "Data Emprestimo 3", "Funcionario 3" };

		} else if (ob instanceof Devolucao) {
			model = new String[] { "Nome", "Cpf", "Livro", "Data Devolucao", "Funcionario" };

		} else if (ob instanceof Funcionario) {
			model = new String[] { "Nome", "Sobrenome", "Login", "Senha", "Idade", "Cpf", "Telefone", "Rua", "Bairro",
					"Nº", "Cep", "Complemento" };
		}

		return model;
	}

	public void setList(ArrayList<Object> ob) {
		this.object = ob;
	}

	private void listar() {
		Object ob = this.object.get(0);
					

		for (int i = 0; i < this.object.size(); i++) {
			if (ob instanceof Cliente) {

				Cliente p = (Cliente) this.object.get(i);
				String cpf = super.reformatarCpf(p.getCpf());
				String telefone = super.reformatarTelefone(p.getTelefone());
				String cep = super.reformatarCep(p.getEndereco().getCep());

				this.modeloTabela.addRow(new String[] { p.getNome(), p.getSobrenome(), String.valueOf(p.getIdade()),
						cpf, telefone, p.getEndereco().getRua(), p.getEndereco().getBairro(),
						String.valueOf(p.getEndereco().getNumero()), cep, p.getEndereco().getComplemento(),
						String.valueOf(p.getContadorLivro()) });
				jTableListar.setModel(modeloTabela);

			} else if (ob instanceof Funcionario) {

				Funcionario func = (Funcionario) this.object.get(i);

				String cpf = super.reformatarCpf(func.getCpf());
				String telefone = super.reformatarTelefone(func.getTelefone());
				String cep = super.reformatarCep(func.getEndereco().getCep());

				this.modeloTabela.addRow(new String[] { func.getNome(), func.getSobrenome(), func.getLogin(),
						func.getSenha(), String.valueOf(func.getIdade()), cpf, telefone, func.getEndereco().getRua(),
						func.getEndereco().getBairro(), String.valueOf(func.getEndereco().getNumero()), cep,
						func.getEndereco().getComplemento() });
				jTableListar.setModel(modeloTabela);

			} else if (ob instanceof Livro) {

				Livro l = (Livro) this.object.get(i);
				this.modeloTabela.addRow(new String[] { l.getTitulo(), l.getAutor(), l.getClassificacao(),
						l.getCodigo(), String.valueOf(l.getEdicao()), l.getEditora(), String.valueOf(l.getVolume()),
						l.getNumeroDeTombo(), String.valueOf(l.getQtdLivros()) });
				jTableListar.setModel(modeloTabela);

			} else if (ob instanceof MaterialEspecial) {

				MaterialEspecial mE = (MaterialEspecial) this.object.get(i);
				this.modeloTabela.addRow(new String[] { mE.getMarca(), mE.getClassificacao(), mE.getCodigo(),
						String.valueOf(mE.getEdicao()), mE.getEditora(), });
				jTableListar.setModel(modeloTabela);

			} else if (ob instanceof Emprestimo) {

				Emprestimo em = (Emprestimo) this.object.get(i);
				Vector row = new Vector();

				row.add(em.getNome());
				row.add(em.getCpf());

				for (int j = 0; j < em.getLivros().size(); j++) {
					row.add(em.getLivros().get(j));
					row.add(em.getDataEmprestimos().get(j));
					row.add(em.getNomeFuncionario().get(j));
				}

				this.modeloTabela.addRow(row);
				jTableListar.setModel(modeloTabela);

			} else if (ob instanceof Devolucao) {

				Devolucao dev = (Devolucao) this.object.get(i);
				for (int j = 0; j < dev.getLivros().size(); j++) {
					
					this.modeloTabela.addRow(new String[] { dev.getNome(), dev.getCpf(), dev.getLivros().get(j),
							dev.getDataEmprestimos().get(j), dev.getNomeFuncionario().get(j) });
					jTableListar.setModel(modeloTabela);

				}

			}
		}
	}

	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTableListar;
}
