import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public boolean elimniarProducto(int id){
        return productos.removeIf(producto -> producto.getId() == id);
    }


    public void listarProductos(){
        for (Producto iterador: productos){
            System.out.println("ID: " + iterador.getId() + ", Nombre: " + iterador.getNombre() + ", Precio " + iterador.getPrecio());
        }
    }
}
