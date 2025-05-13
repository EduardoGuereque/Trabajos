import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ProductView extends JFrame {
    private JTable tabla;
    private DefaultTableModel tableModel;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JButton btnCerrar;
    private ProductController controlador;

    public ProductView(ProductController controlador) {
        this.controlador = controlador;
        setTitle("Gestión de Productos");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Configura tabla
        tableModel = new DefaultTableModel(new Object[]{"ID", "Nombre", "Precio", "Stock"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacemos la tabla no editable
            }
        };

        tabla = new JTable(tableModel);
        tabla.setRowHeight(28);
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabla.setGridColor(Color.LIGHT_GRAY);
        tabla.setShowVerticalLines(false);

        // Alinear celdas al centro
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        add(new JScrollPane(tabla), BorderLayout.CENTER);

        // Botones
        btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarProductos();
            }
        });

        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tabla.getSelectedRow();
                if (filaSeleccionada != -1) {
                    int confirm = JOptionPane.showConfirmDialog(
                            ProductView.this,
                            "¿Estás seguro de que deseas eliminar este producto?",
                            "Confirmar eliminación",
                            JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        int idProducto = (int) tableModel.getValueAt(filaSeleccionada, 0);
                        controlador.eliminarProducto(idProducto); // Método que deberías definir
                        tableModel.removeRow(filaSeleccionada);
                    }
                } else {
                    JOptionPane.showMessageDialog(ProductView.this, "Selecciona un producto para eliminar.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra solo esta ventana
            }
        });

        JPanel panel = new JPanel();
        panel.add(btnActualizar);
        panel.add(btnEliminar);
        panel.add(btnCerrar);
        add(panel, BorderLayout.SOUTH);
    }

    public void actualizarTabla(List<Productos> productos) {
        tableModel.setRowCount(0);
        for (Productos p : productos) {
            tableModel.addRow(new Object[]{
                p.getId(),
                p.getNombre(),
                p.getPrecio(),
                p.getCantidad()
            });
        }
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }
}
