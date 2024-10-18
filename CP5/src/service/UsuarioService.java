package service;

import model.Usuario;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;

public class UsuarioService {
    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    public void cadastrarUsuario(Usuario usuario) {
        usuarioDAO.salvar(usuario);
    }
}

