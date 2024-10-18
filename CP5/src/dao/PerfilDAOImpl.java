package dao;

import model.Perfil;

import java.util.HashMap;
import java.util.Map;

public class PerfilDAOImpl implements PerfilDAO {
    private Map<String, Perfil> perfis = new HashMap<>();

    @Override
    public void salvar(Perfil perfil) {
        perfis.put(perfil.getEmail(), perfil);
    }

    @Override
    public Perfil buscarPorEmail(String email) {
        return perfis.get(email);
    }

    @Override
    public void atualizar(Perfil perfil) {
        perfis.put(perfil.getEmail(), perfil);
    }
}
