public class Usuario implements Comparable<Usuario>{

    String usuario;
    String password;

    Usuario(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }

    Usuario(String usuario){
        this.usuario = usuario;
        this.password = "1234";
    }

    @Override
    public int compareTo(Usuario o) {
        if (o.usuario == this.usuario) return 0;
        return this.usuario.compareTo(o.usuario);
    }
}
