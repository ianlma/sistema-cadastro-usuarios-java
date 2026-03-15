public class Main {

    public static void main(String[] args) {

        SistemaCadastro sistema = new SistemaCadastro();

        sistema.cadastrarUsuario("João", "joao@email.com");
        sistema.cadastrarUsuario("Maria", "maria@email.com");

        sistema.listarUsuarios();

    }

}
