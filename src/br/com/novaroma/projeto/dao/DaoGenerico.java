package br.com.novaroma.projeto.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import br.com.novaroma.projeto.entidades.Entidade;
import br.com.novaroma.projeto.dao.IDao;
import br.com.novaroma.projeto.excecao.ExcecaoDao;
import br.com.novaroma.projeto.util.Constt;
import br.com.novaroma.projeto.util.Msg;

public class DaoGenerico<T extends Entidade> implements IDao<T> {

	private Class<T> type;

	public DaoGenerico(Class<T> type) {
		this.type = type;
	}

	@Override
	public void inserir(T entidade) throws ExcecaoDao {

		File file = getFileEntidade(entidade);

		FileOutputStream out;
		try {
			out = new FileOutputStream(file);
			ObjectOutputStream oout = new ObjectOutputStream(out);
			oout.writeObject(entidade);

			oout.flush();
			oout.close();
		} catch (Exception e) {
			throw new ExcecaoDao(Msg.INSERIR.getStr());
		}
	}

	@Override
	public void atualizar(T entidade) throws ExcecaoDao {

		File file = getFileEntidade(entidade);

		try {
			inserir(entidade);
		} catch (Exception e) {
			throw new ExcecaoDao(Msg.ATUALIZAR.getStr());
		}

	}

	@Override
	public void remover(String id) throws ExcecaoDao {
		File arquivo = getFileEntidade(id);
		try {
			arquivo.delete();
		} catch (Exception e) {
			throw new ExcecaoDao(Msg.REMOVER.getStr());
		}
	}

	@Override
	public T consultar(String id) throws ExcecaoDao {
		T entidade = null;
		try {
			File file = getFileEntidade(id);
			InputStream in = new FileInputStream(file);
			ObjectInputStream oin = new ObjectInputStream(in);
			entidade = (T) oin.readObject();

			oin.close();
			in.close();

			return entidade;

		} catch (Exception e) {
			throw new ExcecaoDao(Msg.CONSULTAR.getStr());
		}

	}

	@Override
	public ArrayList<T> listar() throws ExcecaoDao {
		String folder = type.getSimpleName();

		File diretorio = new File(folder);
		File fList[] = diretorio.listFiles();

		try {

			ArrayList<T> listaT = new ArrayList<T>();

			for (int i = 0; i < fList.length; i++) {
				InputStream in = new FileInputStream(fList[i]);
				ObjectInputStream oin = new ObjectInputStream(in);
				listaT.add((T) oin.readObject());

				oin.close();
				in.close();
			}

			return listaT;

		} catch (Exception e) {
			throw new ExcecaoDao(Msg.LISTAR.getStr());
		}
	}

	@Override
	public boolean exists(String id) {
		String folder = type.getSimpleName();
		File file = new File(folder, id + Constt.FILE_DATA);
		return file.exists();
	}

	@Override
	public boolean isValid() {
		String folder = type.getSimpleName();
		File diretorio = new File(folder);

		if (!diretorio.isDirectory()) {
			return diretorio.isDirectory();
		} else {
			File[] files = diretorio.listFiles();
			return files.length > 0;
		}
	}

	private File getFileEntidade(T entidade) {

		File folder = new File(type.getSimpleName());
		folder.mkdir();

		return new File(folder, entidade.getId() + Constt.FILE_DATA);
	}

	private File getFileEntidade(String id) {

		String folder = type.getSimpleName();
		return new File(folder, id + Constt.FILE_DATA);
	}

}
