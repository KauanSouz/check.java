package service;

import model.Seguro;
import dao.SeguroDAO;
import dao.SeguroDAOImpl;

public class SeguroService {
    private SeguroDAO seguroDAO = new SeguroDAOImpl();

    public void cadastrarSeguro(Seguro seguro) {
        seguroDAO.salvar(seguro);
    }
}

