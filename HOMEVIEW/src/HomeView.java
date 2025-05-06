import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeView {

	private JFrame frame;
	private Ajustes ajustes = new Ajustes();
	private Registro registro = new Registro();
	private Usuarios usuarios = new Usuarios();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeView window = new HomeView();
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
	public HomeView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 860, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(213, 243, 244));
		panel_1.setBounds(0, 0, 422, 189);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KIGÜI'S");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 45));
		lblNewLabel.setBounds(10, 11, 402, 83);
		panel_1.add(lblNewLabel);
		
		JLabel lblSoftware = new JLabel("SOFTWARE");
		lblSoftware.setFont(new Font("Cambria", Font.BOLD, 45));
		lblSoftware.setBounds(10, 94, 402, 83);
		panel_1.add(lblSoftware);
		
		JButton Btnajustes = new JButton("");
		Btnajustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ocultar();
				ajustes.mostrar();
				
			}
		});
		Btnajustes.setBackground(new Color(213, 243, 244));
		Btnajustes.setBounds(0, 0, 16, 16);
		panel_1.add(Btnajustes);
		Btnajustes.setIcon(new ImageIcon(HomeView.class.getResource("/recursos/ajuste.png")));
		
		JButton Btnagregar = new JButton("");
		Btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ocultar();
				registro.mostrar();
			}
		});
		Btnagregar.setBackground(new Color(213, 243, 244));
		Btnagregar.setIcon(new ImageIcon(HomeView.class.getResource("/recursos/agregar.png")));
		Btnagregar.setBounds(17, 0, 16, 16);
		panel_1.add(Btnagregar);
		
		JButton Btnusuarios = new JButton("");
		Btnusuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ocultar();
				usuarios.mostrar();
			}
		});
		Btnusuarios.setBackground(new Color(213, 243, 244));
		Btnusuarios.setIcon(new ImageIcon(HomeView.class.getResource("/recursos/usuario.png")));
		Btnusuarios.setBounds(34, 0, 16, 16);
		panel_1.add(Btnusuarios);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(169, 220, 218));
		panel_1_1.setBounds(422, 0, 424, 189);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(HomeView.class.getResource("/recursos/camaron-removebg-preview (3).png")));
		lblNewLabel_1.setBounds(50, 200, 268, 275);
		panel.add(lblNewLabel_1);
		
		JButton Btnconsejo = new JButton("Consejo del dia");
		Btnconsejo.setBackground(Color.WHITE);
		Btnconsejo.setIcon(new ImageIcon(HomeView.class.getResource("/recursos/idea (1).png")));
		Btnconsejo.setBounds(369, 219, 200, 100);
		panel.add(Btnconsejo);
		
		JButton btnHoraActual = new JButton("Hora actual");
		btnHoraActual.setBackground(Color.WHITE);
		btnHoraActual.setIcon(new ImageIcon(HomeView.class.getResource("/recursos/reloj-de-arena.png")));
		btnHoraActual.setBounds(617, 219, 200, 100);
		panel.add(btnHoraActual);
		
		JButton Btnnotificacion = new JButton("Notificaciones");
		Btnnotificacion.setIcon(new ImageIcon(HomeView.class.getResource("/recursos/texto.png")));
		Btnnotificacion.setBackground(Color.WHITE);
		Btnnotificacion.setBounds(617, 354, 200, 100);
		panel.add(Btnnotificacion);
		
		JButton Btnestadistica = new JButton("Estadisticas");
		Btnestadistica.setBackground(Color.WHITE);
		Btnestadistica.setIcon(new ImageIcon(HomeView.class.getResource("/recursos/estadisticas.png")));
		Btnestadistica.setBounds(369, 354, 200, 100);
		panel.add(Btnestadistica);
	}
	
	public void mostrar() {
        frame.setVisible(true);
    }
	
	public void ocultar() {
        frame.setVisible(false);
    }
}
