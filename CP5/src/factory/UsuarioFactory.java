package factory;

import model.Usuario;

public class UsuarioFactory {
    public static Usuario criarUsuario(String nome, String email, String telefone, String senha) {
        return new Usuario(nome, email, telefone, senha);
    }
}

