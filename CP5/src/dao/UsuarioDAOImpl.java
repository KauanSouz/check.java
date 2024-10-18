package dao;

import model.Usuario;

import java.util.HashMap;
import java.util.Map;

public class UsuarioDAOImpl implements UsuarioDAO {
    private Map<String, Usuario> usuarios = new HashMap<>();

    @Override
    public void salvar(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        return usuarios.get(email);
    }

    @Override
    public void atualizar(Usuario usuario) {
        usuarios.put(usuario.getEmail(), usuario);
    }
}


