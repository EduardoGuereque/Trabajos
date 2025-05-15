import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class UserView extends JFrame {
    private JTable tabla;
    private DefaultTableModel tableModel;

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

        JPanel panel = new JPanel();
        panel.add(btnCerrar);
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

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }
}
