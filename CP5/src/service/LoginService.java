package service;

import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import model.Usuario;

public class LoginService {
    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
    private static LoginService instance;

    private LoginService() {}

    public static LoginService getInstance() {
        if (instance == null) {
            instance = new LoginService();
        }
        return instance;
    }

    public boolean login(String email, String senha) {
        Usuario usuario = usuarioDAO.buscarPorEmail(email);
        if (usuario != null) {
            return compararSenhas(usuario.getSenha(), senha);
        }
        return false;
    }

    private boolean compararSenhas(String senhaArmazenada, String senhaInformada) {
        return senhaArmazenada.equals(senhaInformada);
    }
}



