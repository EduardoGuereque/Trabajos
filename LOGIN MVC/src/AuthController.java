import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;

public class AuthController {
    private AuthView vista;
    private AuthModel modelo;
    private Registro registro;

    public AuthController(AuthView vista, AuthModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.registro = new Registro();

        this.vista.getBtnLogin().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = vista.getUsuario();
                String contrasena = vista.getContrasena();

                if (modelo.autenticar(usuario, contrasena)) {
                	vista.lblMensaje.setForeground(Color.green);
                    vista.mostrarMensaje("Login realizado correctamnte");
                    vista.usuario.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
                    vista.contrasena.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
                } else {
                	vista.lblMensaje.setForeground(Color.red);
                    vista.mostrarMensaje("Usuario o contraseña incorrecta");
                    vista.usuario.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
                    vista.contrasena.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
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

