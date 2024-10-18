package model;

public class Usuario {
    private String nome;
    private final String email; // E-mail como username
    private String telefone;
    protected String senha;

    public Usuario(String nome, String email, String telefone, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() { // Getter para a senha
        return senha;
    }

    @Override
    public String toString() {
        return String.format("Usuário [nome=%s, email=%s, telefone=%s]", nome, email, telefone);
    }
}





