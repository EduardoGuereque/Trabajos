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

public class Formulario {

	private JFrame frame;
	private JTextField textField;
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
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_14;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
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
	public Formulario() {
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

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(10, 21, 645, 144);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Year");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 38, 29);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(68, 12, 58, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Account");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 53, 52, 29);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(68, 54, 86, 29);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(171, 54, 58, 29);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Batch");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(252, 11, 52, 29);
		panel_1.add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_4.setColumns(10);
		textField_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_4.setBounds(310, 12, 86, 29);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_5.setColumns(10);
		textField_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_5.setBounds(413, 12, 58, 29);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Source");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(252, 53, 52, 29);
		panel_1.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"NONE", "OPC1", "OPC2"}));
		comboBox_2.setBounds(310, 53, 161, 29);
		panel_1.add(comboBox_2);
		
		JLabel lblCo = new JLabel("CO");
		lblCo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblCo.setBounds(496, 11, 38, 29);
		panel_1.add(lblCo);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_6.setColumns(10);
		textField_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_6.setBounds(554, 12, 58, 29);
		panel_1.add(textField_6);
		
		JLabel lblCmi = new JLabel("CMI");
		lblCmi.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblCmi.setBounds(496, 53, 38, 29);
		panel_1.add(lblCmi);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_7.setColumns(10);
		textField_7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_7.setBounds(554, 54, 58, 29);
		panel_1.add(textField_7);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Circumstance");
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(10, 93, 86, 29);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"NONE", "OPC1", "OPC2"}));
		comboBox_2_1.setBounds(106, 94, 277, 29);
		panel_1.add(comboBox_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Current Response Code");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(393, 93, 141, 29);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_8.setColumns(10);
		textField_8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_8.setBounds(554, 94, 58, 29);
		panel_1.add(textField_8);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(70, 176, 497, 43);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField_14 = new JTextField(textField.getText());
		textField_14.setHorizontalAlignment(SwingConstants.LEFT);
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_14.setColumns(10);
		textField_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_14.setBounds(54, 7, 86, 29);
		panel.add(textField_14);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.LEFT);
		textField_17.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_17.setColumns(10);
		textField_17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_17.setBounds(345, 7, 86, 29);
		panel.add(textField_17);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.setBackground(new Color(128, 128, 128));
		panel_1_1.setBounds(10, 230, 645, 74);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNaics = new JLabel("NAICS 07");
		lblNaics.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNaics.setBounds(81, 22, 68, 29);
		panel_1_1.add(lblNaics);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.LEFT);
		textField_18.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_18.setColumns(10);
		textField_18.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_18.setBounds(159, 23, 83, 29);
		panel_1_1.add(textField_18);
		
		JLabel lblNaics_2 = new JLabel("NAICS");
		lblNaics_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNaics_2.setBounds(388, 22, 68, 29);
		panel_1_1.add(lblNaics_2);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.LEFT);
		textField_19.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_19.setColumns(10);
		textField_19.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_19.setBounds(457, 23, 83, 29);
		panel_1_1.add(textField_19);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1.setBackground(new Color(128, 128, 128));
		panel_1_1_1.setBounds(10, 313, 645, 208);
		frame.getContentPane().add(panel_1_1_1);
		
		JLabel lblTown = new JLabel("Town");
		lblTown.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblTown.setBounds(81, 11, 68, 29);
		panel_1_1_1.add(lblTown);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.LEFT);
		textField_20.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_20.setColumns(10);
		textField_20.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_20.setBounds(159, 12, 83, 29);
		panel_1_1_1.add(textField_20);
		
		JLabel lblZone = new JLabel("Zone");
		lblZone.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblZone.setBounds(81, 46, 68, 29);
		panel_1_1_1.add(lblZone);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.LEFT);
		textField_21.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_21.setColumns(10);
		textField_21.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_21.setBounds(159, 47, 83, 29);
		panel_1_1_1.add(textField_21);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblCountry.setBounds(81, 86, 68, 29);
		panel_1_1_1.add(lblCountry);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.LEFT);
		textField_22.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_22.setColumns(10);
		textField_22.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_22.setBounds(159, 87, 83, 29);
		panel_1_1_1.add(textField_22);
		
		JLabel lblOwnership = new JLabel("Ownership");
		lblOwnership.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblOwnership.setBounds(81, 126, 68, 29);
		panel_1_1_1.add(lblOwnership);
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.LEFT);
		textField_23.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_23.setColumns(10);
		textField_23.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_23.setBounds(159, 127, 83, 29);
		panel_1_1_1.add(textField_23);
		
		JLabel lblMeei = new JLabel("MEEI");
		lblMeei.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblMeei.setBounds(81, 166, 68, 29);
		panel_1_1_1.add(lblMeei);
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.LEFT);
		textField_24.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_24.setColumns(10);
		textField_24.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_24.setBounds(159, 167, 83, 29);
		panel_1_1_1.add(textField_24);
		
		JLabel lblTown_1 = new JLabel("Town");
		lblTown_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblTown_1.setBounds(410, 10, 68, 29);
		panel_1_1_1.add(lblTown_1);
		
		textField_25 = new JTextField(textField_20.getText());
		textField_25.setHorizontalAlignment(SwingConstants.LEFT);
		textField_25.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_25.setColumns(10);
		textField_25.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_25.setBounds(488, 11, 83, 29);
		panel_1_1_1.add(textField_25);
		
		JLabel lblZone_1 = new JLabel("Zone");
		lblZone_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblZone_1.setBounds(410, 45, 68, 29);
		panel_1_1_1.add(lblZone_1);
		
		textField_26 = new JTextField(textField_21.getText());
		textField_26.setHorizontalAlignment(SwingConstants.LEFT);
		textField_26.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_26.setColumns(10);
		textField_26.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_26.setBounds(488, 46, 83, 29);
		panel_1_1_1.add(textField_26);
		
		JLabel lblCountry_1 = new JLabel("Country");
		lblCountry_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblCountry_1.setBounds(410, 85, 68, 29);
		panel_1_1_1.add(lblCountry_1);
		
		textField_27 = new JTextField(textField_22.getText());
		textField_27.setHorizontalAlignment(SwingConstants.LEFT);
		textField_27.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_27.setColumns(10);
		textField_27.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_27.setBounds(488, 86, 83, 29);
		panel_1_1_1.add(textField_27);
		
		JLabel lblOwnership_1 = new JLabel("Ownership");
		lblOwnership_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblOwnership_1.setBounds(410, 125, 68, 29);
		panel_1_1_1.add(lblOwnership_1);
		
		textField_28 = new JTextField(textField_23.getText());
		textField_28.setHorizontalAlignment(SwingConstants.LEFT);
		textField_28.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_28.setColumns(10);
		textField_28.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_28.setBounds(488, 126, 83, 29);
		panel_1_1_1.add(textField_28);
		
		JLabel lblMeei_1 = new JLabel("MEEI");
		lblMeei_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblMeei_1.setBounds(410, 165, 68, 29);
		panel_1_1_1.add(lblMeei_1);
		
		textField_29 = new JTextField(textField_24.getText());
		textField_29.setHorizontalAlignment(SwingConstants.LEFT);
		textField_29.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_29.setColumns(10);
		textField_29.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_29.setBounds(488, 166, 83, 29);
		panel_1_1_1.add(textField_29);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Resulting Response Code");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(30, 528, 141, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblCo_1 = new JLabel(textField_8.getText());
		lblCo_1.setBackground(SystemColor.inactiveCaptionBorder);
		lblCo_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		lblCo_1.setBounds(181, 528, 38, 29);
		frame.getContentPane().add(lblCo_1);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBackground(new Color(255, 99, 71));
		btnNewButton.setBounds(433, 532, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBackground(new Color(255, 99, 71));
		btnNewButton_1.setBounds(566, 532, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            FileWriter writer = new FileWriter("src/Recursos/Recursos.txt", true);
		            writer.write("Year: " + textField.getText() + "\n");
		            writer.write("Account: " + textField_1.getText() + "\n");
		            writer.write("Account (2): " + textField_2.getText() + "\n");
		            writer.write("Batch: " + textField_4.getText() + "\n");
		            writer.write("Batch (2): " + textField_5.getText() + "\n");
		            writer.write("Source: " + comboBox_2.getSelectedItem() + "\n");
		            writer.write("CO: " + textField_6.getText() + "\n");
		            writer.write("CMI: " + textField_7.getText() + "\n");
		            writer.write("Circumstance: " + comboBox_2_1.getSelectedItem() + "\n");
		            writer.write("Current Response Code: " + textField_8.getText() + "\n");
		            writer.write("NAICS: " + textField_14.getText() + "\n");
		            writer.write("Town: " + textField_21.getText() + "\n");
		            writer.write("Zone: " + textField_22.getText() + "\n");
		            writer.write("Country: " + textField_23.getText() + "\n");
		            writer.write("Ownership: " + textField_24.getText() + "\n");
		            writer.write("MEEI: " + textField_20.getText());
		            writer.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		});

		frame.getContentPane().add(btnNewButton_1);
	}
}
