import java.util.Scanner;

public class VerificacaoLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "Emer";
        String senha = "Emer123";

        System.out.println("Digite seu usuario:");
        String infusuario = sc.nextLine();
        System.out.println("Digite sua senha:");
        String infsenha = sc.nextLine();
        if (infusuario.equals(usuario) && infsenha.equals(senha)) {
            System.out.println("Login efetuado com sucesso!");
        }
        else {
            System.out.println("Usuário ou senha incorreto!");
        }
    }
}
