import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UserView extends JFrame {
    private JTable tabla;
    private DefaultTableModel tableModel;
	private JTextField name;
	private JTextField email;
	private JTextField role;
	private UserModel modelo = new UserModel();
	private UserView view;
	private UserController control = new UserController(modelo, view);
	

    public UserView() {
        setTitle("Lista de Usuarios");
        setSize(800, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        tableModel = new DefaultTableModel(new Object[]{"ID", "Nombre", "Email", "Role", "Número", "Creado", "Alta"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tabla = new JTable(tableModel);
        tabla.setRowHeight(28);
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabla.setGridColor(Color.LIGHT_GRAY);
        tabla.setShowVerticalLines(false);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        add(new JScrollPane(tabla), BorderLayout.CENTER);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(e -> dispose());
        
        JButton btnCrear = new JButton("Añadir");
        btnCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CrearUsuario crear = new CrearUsuario();
				crear.setVisible(true);
				
			}
		});
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tabla.getSelectedRow();
                if (filaSeleccionada != -1) {
                    int n = JOptionPane.showConfirmDialog(
                            UserView.this,
                            "¿Estás seguro de que deseas eliminar este producto?",
                            "Confirmar eliminación",
                            JOptionPane.YES_NO_OPTION);
                    
                    if (n == 0) {
                        int user_id = (int) tableModel.getValueAt(filaSeleccionada, 0);
                        control.delete(user_id);    
                        dispose();

                        List<Users> lista = modelo.getUsers();
        				mostrarUsuarios(lista);
        				setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(UserView.this, "Selecciona un producto para eliminar!", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(btnCerrar);
        panel.add(btnCrear);
        panel.add(btnEliminar);
        add(panel, BorderLayout.SOUTH);
    }

    public void mostrarUsuarios(List<Users> users) {
        tableModel.setRowCount(0);
        for (Users u : users) {
            tableModel.addRow(new Object[]{
                u.id,
                u.name,
                u.email,
                u.role,
                u.num,
                u.create_at,
                u.update_at
            });
        }
    }
    
    public class CrearUsuario extends JFrame {
    	
    	public CrearUsuario() {
    	setTitle("Crear Usuarios");
        setSize(800, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Nombre:");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel.setBounds(10, 11, 162, 28);
        getContentPane().add(lblNewLabel);
        
        name = new JTextField();
        name.setBounds(10, 50, 162, 28);
        getContentPane().add(name);
        name.setColumns(10);
        
        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblCorreo.setBounds(10, 106, 162, 28);
        getContentPane().add(lblCorreo);
        
        email = new JTextField();
        email.setColumns(10);
        email.setBounds(10, 145, 162, 28);
        getContentPane().add(email);
        
        JLabel lblRoll = new JLabel("Role:");
        lblRoll.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblRoll.setBounds(10, 206, 162, 28);
        getContentPane().add(lblRoll);
        
        role = new JTextField();
        role.setColumns(10);
        role.setBounds(10, 245, 162, 28);
        getContentPane().add(role);
        
        JButton btnNewButton = new JButton("Guardar");
        btnNewButton.setBounds(46, 322, 89, 23);
        getContentPane().add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserModel modelo = new UserModel();
				UserView view = new UserView();
				

				String nombre = name.getText();
				String correo = email.getText();
				String rol = role.getText();
				modelo.add(nombre, correo, rol);
				dispose();
				
				List<Users> lista = modelo.getUsers();
				view.mostrarUsuarios(lista);
				view.setVisible(true);

			}
		});

    	}
    }
    

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }
}
