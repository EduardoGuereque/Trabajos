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

public class Factura {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
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
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Factura window = new Factura();
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
	public Factura() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 255));
		frame.setBounds(100, 10, 679, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 0, 0));
		panel.setBounds(0, 0, 665, 73);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBackground(new Color(192, 192, 255));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton.setBounds(566, 16, 89, 36);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileWriter writer = new FileWriter("src/Recursos/Recursos.txt", true);
					writer.write("Inv Rec Number: " + textField.getText() + "\n");
					writer.write("Invoice Number: " + textField_1.getText() + "\n");
					writer.write("Car Number: " + comboBox.getSelectedItem().toString() + "\n");
					writer.write("Lease Number: " + textField_3.getText() + "\n");
					writer.write("Subls. Number: " + comboBox_1.getSelectedItem().toString() + "\n");
					writer.write("Start Date: " + spinner.getValue().toString() + "\n");
					writer.write("End Date: " + spinner_1.getValue().toString() + "\n");
					writer.write("Icode: " + comboBox_1_1.getSelectedItem().toString() + "\n");
					writer.write("Comments: " + comboBox_1_2.getSelectedItem().toString() + "\n");
					writer.write("Company Name: " + textField_9.getText() + "\n");
					writer.write("Rental Rate: " + textField_10.getText() + "\n");
					writer.write("How Invoiced: " + textField_11.getText() + "\n");
					writer.write("Invoice Month: " + textField_12.getText() + "\n");
					writer.write("Charge: " + textField_13.getText() + "\n");
					writer.write("Date Entered: " + spinner_2.getValue().toString() + "\n");
					writer.write("AR Number: " + textField_15.getText() + "\n");
					writer.write("Printed?: " + textField_16.getText());
					writer.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(192, 192, 255));
		panel_1.setBounds(10, 84, 645, 473);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inv Rec Number");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 118, 29);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(10, 47, 118, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Invoice Number");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(150, 11, 207, 29);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(150, 47, 207, 29);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Car Number");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(386, 11, 165, 29);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lease Number");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 87, 118, 29);
		panel_1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_3.setBounds(10, 123, 118, 29);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_4 = new JLabel("Subls. Number");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(150, 87, 207, 29);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Start Date");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(386, 87, 118, 29);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("End Date");
		lblNewLabel_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(517, 87, 118, 29);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Icode");
		lblNewLabel_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 163, 118, 29);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Comments");
		lblNewLabel_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(150, 163, 485, 29);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Company Name");
		lblNewLabel_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(10, 239, 347, 29);
		panel_1.add(lblNewLabel_9);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.LEFT);
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_9.setColumns(10);
		textField_9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_9.setBounds(10, 275, 347, 29);
		panel_1.add(textField_9);
		
		JLabel lblNewLabel_10 = new JLabel("Rental Rate");
		lblNewLabel_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(386, 239, 165, 29);
		panel_1.add(lblNewLabel_10);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.LEFT);
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_10.setColumns(10);
		textField_10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_10.setBounds(386, 275, 165, 29);
		panel_1.add(textField_10);
		
		JLabel lblNewLabel_11 = new JLabel("How Invoiced");
		lblNewLabel_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(10, 315, 118, 29);
		panel_1.add(lblNewLabel_11);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.LEFT);
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_11.setColumns(10);
		textField_11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_11.setBounds(10, 351, 118, 29);
		panel_1.add(textField_11);
		
		JLabel lblNewLabel_12 = new JLabel("Invoice Month");
		lblNewLabel_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(150, 315, 150, 29);
		panel_1.add(lblNewLabel_12);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.LEFT);
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_12.setColumns(10);
		textField_12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_12.setBounds(150, 351, 150, 29);
		panel_1.add(textField_12);
		
		JLabel lblNewLabel_13 = new JLabel("Charge (Ded.)");
		lblNewLabel_13.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(324, 315, 118, 29);
		panel_1.add(lblNewLabel_13);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.LEFT);
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_13.setColumns(10);
		textField_13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_13.setBounds(324, 351, 118, 29);
		panel_1.add(textField_13);
		
		JLabel lblNewLabel_14 = new JLabel("Date Entered");
		lblNewLabel_14.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(466, 315, 141, 29);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblArNumber = new JLabel("AR Number");
		lblArNumber.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblArNumber.setBounds(10, 391, 118, 29);
		panel_1.add(lblArNumber);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.LEFT);
		textField_15.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_15.setColumns(10);
		textField_15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_15.setBounds(10, 427, 118, 29);
		panel_1.add(textField_15);
		
		JLabel lblPrinted = new JLabel("Printed?");
		lblPrinted.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblPrinted.setBounds(150, 391, 74, 29);
		panel_1.add(lblPrinted);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.LEFT);
		textField_16.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_16.setColumns(10);
		textField_16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_16.setBounds(150, 427, 74, 29);
		panel_1.add(textField_16);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "123b", "256j", "652j", "821l", "256x", "734k", "036c", "012u", "015h", "820p", "257h"}));
		comboBox.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox.setBounds(386, 47, 249, 29);
		panel_1.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0000", "1637", "0916", "6380", "6132", "1680", "5703", "1694", "3836", "1604"}));
		comboBox_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_1.setBounds(150, 123, 207, 29);
		panel_1.add(comboBox_1);
		
		comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"000", "111", "222", "333", "444", "555"}));
		comboBox_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_1_1.setBounds(10, 199, 118, 29);
		panel_1.add(comboBox_1_1);
		
		comboBox_1_2 = new JComboBox();
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Very bad", "Bad", "Normal", "Good", "Very good"}));
		comboBox_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comboBox_1_2.setBounds(150, 199, 485, 29);
		panel_1.add(comboBox_1_2);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1748502000000L), new Date(1748502000000L), new Date(2537420400000L), Calendar.DAY_OF_WEEK_IN_MONTH));
		spinner.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinner.setBounds(386, 123, 118, 29);
		panel_1.add(spinner);
		
		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerDateModel(new Date(1748502000000L), new Date(1748502000000L), new Date(2537420400000L), Calendar.DAY_OF_WEEK_IN_MONTH));
		spinner_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinner_1.setBounds(514, 123, 118, 29);
		panel_1.add(spinner_1);
		
		spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerDateModel(new Date(1748502000000L), new Date(1748502000000L), new Date(2537420400000L), Calendar.DAY_OF_WEEK_IN_MONTH));
		spinner_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		spinner_2.setBounds(466, 351, 141, 29);
		panel_1.add(spinner_2);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnClose.setBackground(new Color(192, 192, 255));
		btnClose.setBounds(546, 427, 89, 35);
		panel_1.add(btnClose);
	}
}
