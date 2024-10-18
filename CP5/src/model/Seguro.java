package model;

import java.time.LocalDate;

public class Seguro {
    private String tipo;
    private double valor;
    private LocalDate dataInicio;
    private LocalDate dataVencimento;

    public Seguro(String tipo, double valor, LocalDate dataInicio, LocalDate dataVencimento) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataVencimento = dataVencimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return String.format("Seguro [tipo=%s, valor=%.2f, dataInicio=%s, dataVencimento=%s]",
                tipo, valor, dataInicio, dataVencimento);
    }
}
