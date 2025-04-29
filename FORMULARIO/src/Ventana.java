import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 50, 547, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 533, 568);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DON KAMARON");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(265, 11, 258, 52);
		panel.add(lblNewLabel);
		
		JLabel lblRegistroDeUsuarios = new JLabel("REGISTRO DE USUARIOS");
		lblRegistroDeUsuarios.setVerticalAlignment(SwingConstants.TOP);
		lblRegistroDeUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroDeUsuarios.setFont(new Font("Serif", Font.BOLD, 15));
		lblRegistroDeUsuarios.setBounds(265, 65, 258, 52);
		panel.add(lblRegistroDeUsuarios);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Ventana.class.getResource("/recursos/camaron.png")));
		lblNewLabel_1.setBounds(10, 11, 107, 92);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FORMULARIO DE INSCRIPCION AL SISTEMA");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel_2.setBounds(20, 114, 490, 52);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOMBRE(S):");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(20, 177, 67, 25);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(97, 177, 406, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("APELLIDOS:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1.setBounds(20, 217, 67, 25);
		panel.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 217, 406, 25);
		panel.add(textField_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("EMPRESA:");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1.setBounds(20, 253, 67, 25);
		panel.add(lblNewLabel_3_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(97, 253, 406, 25);
		panel.add(textField_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("AMBITO:");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1_1.setBounds(20, 289, 67, 25);
		panel.add(lblNewLabel_3_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECCIONAR", "TECNOLOGIA", "MODA", "SALUD", "EDUCACION", "COMERCIO", "GAMING", "TURISMO"}));
		comboBox.setBounds(97, 289, 406, 25);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("CARGO:");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1_2.setBounds(20, 325, 67, 25);
		panel.add(lblNewLabel_3_1_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(97, 325, 406, 25);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(97, 361, 204, 25);
		panel.add(textField_4);
		
		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("USUARIO:");
		lblNewLabel_3_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1_2_1.setBounds(20, 361, 67, 25);
		panel.add(lblNewLabel_3_1_1_2_1);
		
		JLabel lblNewLabel_3_1_1_2_1_1 = new JLabel("CONTRASEÑA:");
		lblNewLabel_3_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1_2_1_1.setBounds(20, 397, 67, 25);
		panel.add(lblNewLabel_3_1_1_2_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 397, 204, 25);
		panel.add(passwordField);
		
		JLabel lblNewLabel_3_1_1_2_1_1_1 = new JLabel("REPETIR");
		lblNewLabel_3_1_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1_2_1_1_1.setBounds(20, 433, 67, 25);
		panel.add(lblNewLabel_3_1_1_2_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(97, 457, 204, 25);
		panel.add(passwordField_1);
		
		JLabel lblNewLabel_3_1_1_2_1_1_2 = new JLabel("CONTRASEÑA:");
		lblNewLabel_3_1_1_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1_2_1_1_2.setBounds(20, 457, 67, 25);
		panel.add(lblNewLabel_3_1_1_2_1_1_2);
		
		JLabel lblNewLabel_3_1_1_2_2 = new JLabel("CORREO:");
		lblNewLabel_3_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_3_1_1_2_2.setBounds(20, 491, 67, 25);
		panel.add(lblNewLabel_3_1_1_2_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(97, 491, 406, 25);
		panel.add(textField_5);
		
		JButton btnNewButton = new JButton("REGISTRARSE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = textField.getText();
                String apellido = textField_1.getText();
                String empresa = textField_2.getText();
                String ambito = comboBox.getSelectedItem().toString();
                String cargo = textField_3.getText();
                String usuario = textField_4.getText();
                String contrasena = passwordField.getText();
                String contrasena2 = passwordField_1.getText();
                String correo = textField_5.getText();
                
                if (nombre.isEmpty() || apellido.isEmpty() || empresa.isEmpty() || 
                    ambito.equals("SELECCIONAR") || cargo.isEmpty() || usuario.isEmpty() ||
                    contrasena.isEmpty() || contrasena2.isEmpty() || correo.isEmpty()) {
                	
                    JOptionPane.showMessageDialog(null, "Datos incompletos", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (!contrasena.equals(contrasena2)) {
                	
                    JOptionPane.showMessageDialog(null, "Las contraseñas deben ser iguales", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    FileWriter users = new FileWriter("usuarios.txt", true);
                    users.write(nombre + "|" + apellido + "|" + empresa + "|" + ambito + "|" + 
                             cargo + "|" + usuario + "|" + correo + "|" + contrasena + "\n");
                    users.close();
                    JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
                    
                    textField.setText("");
                    textField_1.setText("");
                    textField_2.setText("");
                    comboBox.setSelectedIndex(0);
                    textField_3.setText("");
                    textField_4.setText("");
                    passwordField.setText("");
                    passwordField_1.setText("");
                    textField_5.setText("");

                } catch (IOException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error desconocido", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(212, 534, 99, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Ventana.class.getResource("/recursos/fondo2.jpg")));
		lblNewLabel_4.setBounds(0, 0, 533, 568);
		panel.add(lblNewLabel_4);
		
		
	}
}
