package factory;

import model.Perfil;
import java.time.LocalDate;

public class PerfilFactory {
    public static Perfil criarPerfil(String nome, String email, String telefone, String endereco, String estadoCivil, String generoBiologico, LocalDate dataNascimento, String cpf) {
        return new Perfil(nome, email, telefone, endereco, estadoCivil, generoBiologico, dataNascimento, cpf);
    }
}
