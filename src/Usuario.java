public class Usuario implements Comparable<Usuario>{

    String usuario;
    String password;

    @Override
    public int compareTo(Usuario o) {
        if (o.usuario == this.usuario) return 0;
        return this.usuario.compareTo(o.usuario);
    }
}
