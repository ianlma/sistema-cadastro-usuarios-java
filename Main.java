import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaCadastro sistema = new SistemaCadastro();

        int opcao;

        do {

            System.out.println("\n=== SISTEMA DE CADASTRO ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    sistema.cadastrarUsuario(nome, email);
                    System.out.println("Usuário cadastrado!");

                    break;

                case 2:

                    sistema.listarUsuarios();
                    break;

                case 3:

                    System.out.println("Saindo do sistema...");
                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 3);

        scanner.close();

    }

}
