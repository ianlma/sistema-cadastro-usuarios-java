import java.util.ArrayList;

class Usuario {
    String nome;
    String email;

    Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}

public class SistemaCadastro {

    static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void cadastrar(String nome, String email) {
        usuarios.add(new Usuario(nome, email));
    }

    public static void listar() {
        for (Usuario u : usuarios) {
            System.out.println("Nome: " + u.nome + " | Email: " + u.email);
        }
    }

    public static void main(String[] args) {

        cadastrar("Ian", "ian@email.com");
        cadastrar("Maria", "maria@email.com");

        listar();
    }
}
