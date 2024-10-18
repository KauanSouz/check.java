import java.time.LocalDate;

import model.Perfil;
import model.Seguro;
import service.CadastroUsuario;
import service.PerfilService;
import service.SeguroService;
import service.LoginService;

public class Main {
    public static void main(String[] args) {
        CadastroUsuario cadastroUsuario = new CadastroUsuario();

        cadastroUsuario.cadastrarNovoUsuario();

        PerfilService perfilService = new PerfilService();
        Perfil perfil = new Perfil("Maria Silva", "maria@example.com", "(11) 91234-5678", "Av. Brasil, 456", "Casada", "Feminino", LocalDate.of(1985, 5, 15), "123.456.789-01");
        perfilService.cadastrarPerfil(perfil);

        SeguroService seguroService = new SeguroService();
        Seguro seguro = new Seguro("Seguro de Vida", 1500.75, LocalDate.of(2024, 1, 1), LocalDate.of(2025, 1, 1));
        seguroService.cadastrarSeguro(seguro);

        LoginService loginService = LoginService.getInstance();
        boolean autenticado = loginService.login("maria@example.com", "senhaExemplo"); // Troque por uma senha real

        if (autenticado) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha na autenticação.");
        }

        System.out.println(perfil);
    }
}
