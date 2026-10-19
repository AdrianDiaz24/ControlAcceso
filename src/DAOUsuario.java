import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class DAOUsuario {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removeUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
}
