package dao;

import model.Seguro;

import java.util.HashMap;
import java.util.Map;

public class SeguroDAOImpl implements SeguroDAO {
    private Map<String, Seguro> seguros = new HashMap<>();

    @Override
    public void salvar(Seguro seguro) {
        seguros.put(seguro.getTipo(), seguro);
    }

    @Override
    public Seguro buscarPorTipo(String tipo) {
        return seguros.get(tipo);
    }

    @Override
    public void atualizar(Seguro seguro) {
        seguros.put(seguro.getTipo(), seguro);
    }
}

