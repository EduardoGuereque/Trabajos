
public class AuthModel {
	    public boolean autenticar(String usuario, String contrasena) {
	        return "admin".equals(usuario) && "1234".equals(contrasena);
	    }
	    
	    public void registro(String usuario, String contrasena) {
	        System.out.println("Nuevo Usuario Registrado");
	        System.out.println("Usuario: " + usuario);
	        System.out.println("Contraseña: " + contrasena);
	    }
	}
