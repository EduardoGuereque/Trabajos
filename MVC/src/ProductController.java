import java.util.List;

import javax.swing.JFrame;

public class ProductController {
    private ProductModel modelo;
    private ProductView vista;

    public ProductController() {
        modelo = new ProductModel();
        vista = new ProductView(this);
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo la ventana de productos
    }

    public void mostrarProductos() {
        List<Productos> productos = modelo.obtenerProductos();
        vista.actualizarTabla(productos);
        vista.setVisible(true); // Mostrar la vista de productos
    }
    
    public void eliminarProducto(int id) {
        modelo.eliminarProductoPorId(id);
    }
}