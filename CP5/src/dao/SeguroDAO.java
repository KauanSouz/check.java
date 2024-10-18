package dao;

import model.Seguro;

public interface SeguroDAO {
    void salvar(Seguro seguro);
    Seguro buscarPorTipo(String tipo);
    void atualizar(Seguro seguro);
}

