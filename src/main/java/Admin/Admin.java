public class Admin {

    private Admin() {};
    
    private static Admin instance = new Admin();

    public static Admin getInstance() {
        return instance;
    }

    private Set<string> usuariosAutorizados = new HashSet<>();

    public void autorizarUsuario(String usuario) {
        usuariosAutorizados.add(usuario);
    }

    public boolean isAutorizado(String usuario) {
        return usuariosAutorizados.contains(usuario);
    }
}
