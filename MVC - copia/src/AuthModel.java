import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AuthModel {
	
	    public boolean autenticar(String usuario, String contrasena) throws IOException {
	    	
	    	try (BufferedReader users = new BufferedReader(new FileReader("src/recursos/users.txt"))){
	    		String linea;
	    		while((linea = users.readLine()) != null) {
	    			String[] campos = linea.split(",\\s*");
	    			
	    			if (campos.length >= 2) {
	                    String usuariotxt = campos[0].trim();
	                    String contrasenatxt = campos[1].trim();
	                    if (usuariotxt.equals(usuario) && contrasenatxt.equals(contrasena)) {
	                        return true;
	                    }
	                }
	    		}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	        return false;
	        
	    }
	    
	    public void registro(String usuario, String contrasena) {
	        System.out.println("Nuevo Usuario Registrado");
	        System.out.println("Usuario: " + usuario);
	        System.out.println("Contraseña: " + contrasena);
	    }
	}
