package service;

import model.Usuario;
import model.Perfil;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;
import dao.PerfilDAO;
import dao.PerfilDAOImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class CadastroUsuario {
    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
    private PerfilDAO perfilDAO = new PerfilDAOImpl();
    private Scanner scanner = new Scanner(System.in);

    public void cadastrarNovoUsuario() {
        System.out.print("Digite o e-mail (username): ");
        String email = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        System.out.print("Repita a senha: ");
        String repetirSenha = scanner.nextLine();

        if (!senha.equals(repetirSenha)) {
            System.out.println("As senhas não coincidem. Cadastro falhou.");
            return;
        }

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email, telefone, senha);
        usuarioDAO.salvar(usuario);

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite seu estado civil: ");
        String estadoCivil = scanner.nextLine();
        System.out.print("Digite seu gênero biológico: ");
        String generoBiologico = scanner.nextLine();
        System.out.print("Digite sua data de nascimento (AAAA-MM-DD): ");
        LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

        Perfil perfil = new Perfil(nome, email, telefone, "", estadoCivil, generoBiologico, dataNascimento, cpf);
        perfilDAO.salvar(perfil);

        System.out.println("Usuário e perfil cadastrados com sucesso!");
    }
}
