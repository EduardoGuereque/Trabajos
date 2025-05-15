
public class Main{

	public static void main(String[] args) {
		
		AuthView vista = new AuthView();
        AuthModel modelo = new AuthModel();
        new AuthController(vista, modelo);
        
        
		

	}

}

