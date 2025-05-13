import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AuthController {
    private AuthView vista;
    private AuthModel modelo;
    private Registro registro;
    private ProductController productController; 

    public AuthController(AuthView vista, AuthModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.registro = new Registro();
        this.productController = new ProductController();

        this.vista.getBtnLogin().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = vista.getUsuario();
                String contrasena = vista.getContrasena();

                try {
                    if (modelo.autenticar(usuario, contrasena)) {
                        vista.ocultar();
                        productController.mostrarProductos(); 
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos",
                                "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        registro.setBtnRegistrarListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = registro.getUsuario();
                String contrasena = registro.getContrasena();
                modelo.registro(usuario, contrasena);
                registro.ocultar();
                vista.mostrar();
            }
        });

        this.vista.getBtnRegistro().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                vista.ocultar();
                registro.mostrar();
            }
        });

        registro.setBtnVolverListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registro.ocultar();
                vista.mostrar();
            }
        });

        this.vista.mostrar();
    }
}