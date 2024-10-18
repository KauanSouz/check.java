package service;

import model.Perfil;
import dao.PerfilDAO;
import dao.PerfilDAOImpl;

public class PerfilService {
    private PerfilDAO perfilDAO = new PerfilDAOImpl();

    public void cadastrarPerfil(Perfil perfil) {
        perfilDAO.salvar(perfil);
    }
}
