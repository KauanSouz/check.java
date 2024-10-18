package login;

import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import model.Usuario;
import service.LoginService;

public class LoginImpl implements LoginInterface {
    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    @Override
    public boolean autenticar(String email, String senha) {
        Usuario usuario = usuarioDAO.buscarPorEmail(email);
        if (usuario != null) {
            return LoginService.getInstance().login(email, senha);
        }
        return false;
    }
}



