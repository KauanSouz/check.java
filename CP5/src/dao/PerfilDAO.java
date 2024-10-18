package dao;

import model.Perfil;

public interface PerfilDAO {
    void salvar(Perfil perfil);
    Perfil buscarPorEmail(String email);
    void atualizar(Perfil perfil);
}
