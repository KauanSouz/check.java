package factory;

import model.Seguro;
import java.time.LocalDate;

public class SeguroFactory {
    public static Seguro criarSeguro(String tipo, double valor, LocalDate dataInicio, LocalDate dataVencimento) {
        return new Seguro(tipo, valor, dataInicio, dataVencimento);
    }
}
