import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class INGRESO {

	private JFrame frame;
	private JTextField textField_3;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_16;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_1_1;
	private JComboBox comboBox_1_2;
	private JSpinner spinner;
	private JSpinner spinner_1;
	private JSpinner spinner_2;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_14;
	private JTextField textField_17;
	private JTextField textField_19;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INGRESO window = new INGRESO();
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
	public INGRESO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(212, 206, 198));
		frame.setBounds(100, 10, 679, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1.setBackground(new Color(128, 128, 128));
		panel_1_1_1.setBounds(10, 42, 305, 515);
		frame.getContentPane().add(panel_1_1_1);
		
		JLabel lblTown = new JLabel("First Name");
		lblTown.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblTown.setBounds(10, 11, 68, 29);
		panel_1_1_1.add(lblTown);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.LEFT);
		textField_20.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_20.setColumns(10);
		textField_20.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_20.setBounds(88, 12, 207, 29);
		panel_1_1_1.add(textField_20);
		
		JLabel lblZone = new JLabel("Surname");
		lblZone.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblZone.setBounds(10, 46, 68, 29);
		panel_1_1_1.add(lblZone);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.LEFT);
		textField_21.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_21.setColumns(10);
		textField_21.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_21.setBounds(88, 47, 207, 29);
		panel_1_1_1.add(textField_21);
		
		JLabel lblCountry = new JLabel("Street");
		lblCountry.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblCountry.setBounds(10, 86, 68, 29);
		panel_1_1_1.add(lblCountry);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.LEFT);
		textField_22.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_22.setColumns(10);
		textField_22.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_22.setBounds(88, 87, 207, 29);
		panel_1_1_1.add(textField_22);
		
		JLabel lblOwnership = new JLabel("Suburb");
		lblOwnership.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblOwnership.setBounds(10, 126, 68, 29);
		panel_1_1_1.add(lblOwnership);
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.LEFT);
		textField_23.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_23.setColumns(10);
		textField_23.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_23.setBounds(88, 127, 207, 29);
		panel_1_1_1.add(textField_23);
		
		JLabel lblMeei = new JLabel("City");
		lblMeei.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblMeei.setBounds(10, 166, 68, 29);
		panel_1_1_1.add(lblMeei);
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.LEFT);
		textField_24.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_24.setColumns(10);
		textField_24.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_24.setBounds(88, 167, 207, 29);
		panel_1_1_1.add(textField_24);
		
		JLabel lblTown_1 = new JLabel("Phone");
		lblTown_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblTown_1.setBounds(10, 206, 68, 29);
		panel_1_1_1.add(lblTown_1);
		
		JLabel lblZone_1 = new JLabel("Gender");
		lblZone_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblZone_1.setBounds(10, 241, 68, 29);
		panel_1_1_1.add(lblZone_1);
		
		JLabel lblCountry_1 = new JLabel("Birth date");
		lblCountry_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblCountry_1.setBounds(10, 281, 68, 29);
		panel_1_1_1.add(lblCountry_1);
		
		JLabel lblOwnership_1 = new JLabel("Start date");
		lblOwnership_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblOwnership_1.setBounds(10, 321, 68, 29);
		panel_1_1_1.add(lblOwnership_1);
		
		JLabel lblMeei_1 = new JLabel("End date");
		lblMeei_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblMeei_1.setBounds(10, 361, 68, 29);
		panel_1_1_1.add(lblMeei_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(88, 362, 207, 29);
		panel_1_1_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(88, 322, 207, 29);
		panel_1_1_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(88, 282, 207, 29);
		panel_1_1_1.add(textField_2);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_4.setColumns(10);
		textField_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_4.setBounds(88, 242, 207, 29);
		panel_1_1_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_5.setColumns(10);
		textField_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_5.setBounds(88, 207, 207, 29);
		panel_1_1_1.add(textField_5);
		
		JLabel lblOwnership_1_1 = new JLabel("Department");
		lblOwnership_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblOwnership_1_1.setBounds(10, 401, 68, 29);
		panel_1_1_1.add(lblOwnership_1_1);
		
		JLabel lblMeei_1_1 = new JLabel("Branch");
		lblMeei_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblMeei_1_1.setBounds(10, 441, 68, 29);
		panel_1_1_1.add(lblMeei_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Historic employee");
		chckbxNewCheckBox.setBackground(new Color(128, 128, 128));
		chckbxNewCheckBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(10, 485, 132, 23);
		panel_1_1_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxManager = new JCheckBox("Manager");
		chckbxManager.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		chckbxManager.setBackground(Color.GRAY);
		chckbxManager.setBounds(163, 486, 132, 23);
		panel_1_1_1.add(chckbxManager);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"NONE", "01", "02", "03"}));
		comboBox_2.setBounds(88, 402, 207, 28);
		panel_1_1_1.add(comboBox_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"NONE", "01", "02", "03"}));
		comboBox_2_1.setBounds(88, 441, 207, 28);
		panel_1_1_1.add(comboBox_2_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_1.setBackground(Color.GRAY);
		panel_1_1_1_1.setBounds(350, 42, 305, 125);
		frame.getContentPane().add(panel_1_1_1_1);
		
		JLabel lblTown_2 = new JLabel("Account number");
		lblTown_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblTown_2.setBounds(10, 11, 95, 29);
		panel_1_1_1_1.add(lblTown_2);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_8.setColumns(10);
		textField_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_8.setBounds(115, 12, 180, 29);
		panel_1_1_1_1.add(textField_8);
		
		JLabel lblZone_2 = new JLabel("Account holder");
		lblZone_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblZone_2.setBounds(10, 46, 95, 29);
		panel_1_1_1_1.add(lblZone_2);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.LEFT);
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_14.setColumns(10);
		textField_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_14.setBounds(115, 47, 180, 29);
		panel_1_1_1_1.add(textField_14);
		
		JLabel lblCountry_2 = new JLabel("Bank branch");
		lblCountry_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblCountry_2.setBounds(10, 86, 95, 29);
		panel_1_1_1_1.add(lblCountry_2);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.LEFT);
		textField_17.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_17.setColumns(10);
		textField_17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_17.setBounds(115, 87, 180, 29);
		panel_1_1_1_1.add(textField_17);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_1_1.setBackground(Color.GRAY);
		panel_1_1_1_1_1.setBounds(350, 213, 305, 125);
		frame.getContentPane().add(panel_1_1_1_1_1);
		
		JLabel lblTown_2_1 = new JLabel("Tax code");
		lblTown_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblTown_2_1.setBounds(10, 11, 68, 29);
		panel_1_1_1_1_1.add(lblTown_2_1);
		
		JLabel lblZone_2_1 = new JLabel("Tax number");
		lblZone_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblZone_2_1.setBounds(10, 46, 68, 29);
		panel_1_1_1_1_1.add(lblZone_2_1);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.LEFT);
		textField_19.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_19.setColumns(10);
		textField_19.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_19.setBounds(88, 47, 207, 29);
		panel_1_1_1_1_1.add(textField_19);
		
		JLabel lblCountry_2_1 = new JLabel("Pay period");
		lblCountry_2_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblCountry_2_1.setBounds(10, 86, 68, 29);
		panel_1_1_1_1_1.add(lblCountry_2_1);
		
		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] {"NONE", "012", "023", "034", "045"}));
		comboBox_2_2.setBounds(88, 12, 207, 28);
		panel_1_1_1_1_1.add(comboBox_2_2);
		
		JComboBox comboBox_2_3 = new JComboBox();
		comboBox_2_3.setModel(new DefaultComboBoxModel(new String[] {"NONE", "12 01 25", "11 04 22", "30 12 17"}));
		comboBox_2_3.setBounds(88, 87, 207, 28);
		panel_1_1_1_1_1.add(comboBox_2_3);
		
		JPanel panel_1_1_1_1_2 = new JPanel();
		panel_1_1_1_1_2.setLayout(null);
		panel_1_1_1_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_1_2.setBackground(Color.GRAY);
		panel_1_1_1_1_2.setBounds(350, 379, 305, 125);
		frame.getContentPane().add(panel_1_1_1_1_2);
		
		JLabel lblTown_2_2 = new JLabel("Notes");
		lblTown_2_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblTown_2_2.setBounds(10, 11, 68, 29);
		panel_1_1_1_1_2.add(lblTown_2_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 42, 285, 72);
		panel_1_1_1_1_2.add(textArea);
		
		JComboBox comboBox_2_4 = new JComboBox();
		comboBox_2_4.setModel(new DefaultComboBoxModel(new String[] {"NONE", "JUAN", "PEPE", "LUIS", "JOSE", "ALBERTO"}));
		comboBox_2_4.setBounds(428, 529, 227, 28);
		frame.getContentPane().add(comboBox_2_4);
		
		JLabel lblMeei_1_1_1 = new JLabel("Employee");
		lblMeei_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblMeei_1_1_1.setBounds(350, 528, 68, 29);
		frame.getContentPane().add(lblMeei_1_1_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBackground(new Color(212, 206, 198));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setBounds(10, 11, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            FileWriter writer = new FileWriter("src/Recursos/Recursos.txt", true);
		            writer.write("First Name: " + textField_20.getText() + "\n");
		            writer.write("Surname: " + textField_21.getText() + "\n");
		            writer.write("Street: " + textField_22.getText() + "\n");
		            writer.write("Suburb: " + textField_23.getText() + "\n");
		            writer.write("City: " + textField_24.getText() + "\n");
		            writer.write("Phone: " + textField_5.getText() + "\n");
		            writer.write("Gender: " + textField_4.getText() + "\n");
		            writer.write("Birth date: " + textField_2.getText() + "\n");
		            writer.write("Start date: " + textField_1.getText() + "\n");
		            writer.write("End date: " + textField.getText() + "\n");
		            writer.write("Department: " + comboBox_2.getSelectedItem().toString() + "\n");
		            writer.write("Branch: " + comboBox_2_1.getSelectedItem().toString() + "\n");
		            writer.write("Account number: " + textField_8.getText() + "\n");
		            writer.write("Account holder: " + textField_14.getText() + "\n");
		            writer.write("Bank branch: " + textField_17.getText() + "\n");
		            writer.write("Tax number: " + textField_19.getText() + "\n");
		            writer.write("Notes: " + textArea.getText() + "\n");
		            writer.write("Employee: " + comboBox_2_4.getSelectedItem().toString());
		            writer.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBackground(new Color(212, 206, 198));
		btnClose.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnClose.setBounds(566, 8, 89, 23);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnClose);

	}
}
