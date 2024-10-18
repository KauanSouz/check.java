package model;

import java.time.LocalDate;

public class Perfil extends Usuario {
    private String endereco;
    private String estadoCivil;
    private String generoBiologico;
    private LocalDate dataNascimento;
    private final String cpf;

    public Perfil(String nome, String email, String telefone, String endereco, String estadoCivil, String generoBiologico, LocalDate dataNascimento, String cpf) {
        super(nome, email, telefone, "");
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.generoBiologico = generoBiologico;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGeneroBiologico() {
        return generoBiologico;
    }

    public void setGeneroBiologico(String generoBiologico) {
        this.generoBiologico = generoBiologico;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return String.format("Perfil [nome=%s, email=%s, telefone=%s, endereco=%s, estadoCivil=%s, generoBiologico=%s, dataNascimento=%s, cpf=%s]",
                getNome(), getEmail(), getTelefone(), endereco, estadoCivil, generoBiologico, dataNascimento, cpf);
    }
}
