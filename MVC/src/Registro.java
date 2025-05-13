import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Registro {

	private JFrame frame;
	public JTextField usuario;
	public JPasswordField contrasena;
	private JButton btnRegistrar;
	public JLabel lblMensaje;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JButton btnVolver;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
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
	public Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 497, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO");
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
		lblNewLabel_1_1.setBounds(172, 294, 137, 23);
		panel.add(lblNewLabel_1_1);
		
		contrasena = new JPasswordField();
		contrasena.setBounds(172, 317, 137, 22);
		panel.add(contrasena);
		
		btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setBounds(172, 389, 137, 23);
		panel.add(btnRegistrar);
		
		lblMensaje = new JLabel("", SwingConstants.CENTER);
		lblMensaje.setForeground(new Color(0, 0, 0));
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
        lblMensaje.setBounds(74, 441, 332, 39);
        panel.add(lblMensaje);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(172, 255, 137, 23);
        panel.add(textField);
        
        lblNewLabel_2 = new JLabel("CORREO");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(172, 233, 137, 23);
        panel.add(lblNewLabel_2);
        
        btnVolver = new JButton("VOLVER");
        btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnVolver.setBounds(10, 487, 81, 23);
		panel.add(btnVolver);
        
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

    public void setBtnRegistrarListener(ActionListener e) {
        btnRegistrar.addActionListener(e);
    }

    public void setBtnVolverListener(ActionListener e) {
        btnVolver.addActionListener(e);
    }

}
