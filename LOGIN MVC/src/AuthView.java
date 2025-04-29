import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthView {

	private JFrame frame;
	public JTextField usuario;
	public JPasswordField contrasena;
	private JButton btnLogin;
	public JLabel lblMensaje;
	private JButton btnRegistrarse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthView window = new AuthView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AuthView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(700, 100, 497, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(74, 11, 332, 61);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE DE USUARIO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(172, 163, 137, 23);
		panel.add(lblNewLabel_1);
		
		usuario = new JTextField();
		usuario.setBounds(172, 185, 137, 23);
		panel.add(usuario);
		usuario.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("CONTRASEÑA");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(172, 222, 137, 23);
		panel.add(lblNewLabel_1_1);
		
		contrasena = new JPasswordField();
		contrasena.setBounds(172, 245, 137, 22);
		panel.add(contrasena);
		
		btnLogin = new JButton("INICIAR SESION");
		btnLogin.setBounds(172, 350, 137, 23);
		panel.add(btnLogin);
		
		lblMensaje = new JLabel("", SwingConstants.CENTER);
		lblMensaje.setForeground(new Color(0, 0, 0));
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
        lblMensaje.setBounds(74, 400, 332, 39);
        panel.add(lblMensaje);
        
        btnRegistrarse = new JButton("REGISTRARSE");
        btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnRegistrarse.setBounds(221, 384, 88, 15);
		panel.add(btnRegistrarse);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AuthView.class.getResource("/recursos/FONDO.jpg")));
		lblNewLabel_2.setBounds(0, 0, 483, 521);
		panel.add(lblNewLabel_2);
		
		
	}
	
	public void mostrar() {
        frame.setVisible(true);
    }
	
	public void ocultar() {
        frame.setVisible(false);
    }

    public String getUsuario() {
        return usuario.getText();
    }

    public String getContrasena() {
    	String textoTA = contrasena.getText();
        return new String(textoTA);
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void mostrarMensaje(String mensaje) {
        lblMensaje.setText(mensaje);
    }
    
    public JButton getBtnRegistro() {
        return btnRegistrarse;
    }
}


