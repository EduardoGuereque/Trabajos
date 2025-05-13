import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {
	
    private final String filePath = "src/json/products2.json";

    public List<Productos> obtenerProductos() {
        List<Productos> productos = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            JSONObject raiz = (JSONObject) parser.parse(reader);
            JSONArray arregloObjetos = (JSONArray) raiz.get("productos");

            for (Object item : arregloObjetos) {
                JSONObject objeto = (JSONObject) item;
                int id = ((Long) objeto.get("id")).intValue();
                String nombre = (String) objeto.get("nombre");
                double precio = (double) objeto.get("precio");
                int stock = ((Long) objeto.get("stock")).intValue();
                productos.add(new Productos(id, nombre, precio, stock));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return productos;
    }

    public void eliminarProductoPorId(int idAEliminar) {
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(filePath)) {
            JSONObject raiz = (JSONObject) parser.parse(reader);
            JSONArray arregloObjetos = (JSONArray) raiz.get("productos");

            JSONArray nuevosProductos = new JSONArray();

            for (Object item : arregloObjetos) {
                JSONObject producto = (JSONObject) item;
                int id = ((Long) producto.get("id")).intValue();
                if (id != idAEliminar) {
                    nuevosProductos.add(producto);
                }
            }

            // Reemplazar y guardar
            raiz.put("productos", nuevosProductos);

            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(raiz.toJSONString());
                writer.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
