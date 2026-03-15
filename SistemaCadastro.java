import java.util.ArrayList;

public class SistemaCadastro {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(String nome, String email) {
        usuarios.add(new Usuario(nome, email));
    }

    public void listarUsuarios() {

        for (Usuario u : usuarios) {
            System.out.println("Nome: " + u.nome + " | Email: " + u.email);
        }

    }

}
