package servico;

import java.util.Collection;

import dao.UsuarioDao;
import modelo.Usuario;

public class UsuarioServico {
	private UsuarioDao dao;
	
	public Usuario obter(Long id) {
		dao = new UsuarioDao();
		
		return dao.obter(id);
	}

	public void salvar(Usuario usuario) {
		dao = new UsuarioDao();
		
		dao.salvar(usuario);
	}

	public void editar(Usuario usuario) {
		dao = new UsuarioDao();
		
		dao.editar(usuario);
	}

	public void remover(Long id) {
		dao = new UsuarioDao();
		
		dao.remover(id);
	}

	public Collection<Usuario> listar() {
		dao = new UsuarioDao();
		
		return dao.listar();
	}
}
