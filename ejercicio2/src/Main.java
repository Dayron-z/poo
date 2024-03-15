
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*        Ejercicio 1: Sistema de Control de Inventarios
        Objetivo: Crear un sistema para manejar el inventario de un almacén, aplicando
        encapsulamiento y herencia, y utilizando ArrayList para almacenar los productos.

        Principios de POO aplicados: Encapsulamiento, Herencia.

                Requisitos:

        Clase Producto: Base para todos los productos, con propiedades como id, nombre, y
        precio. Implementa getters y setters para aplicar el encapsulamiento.
        Clase ProductoEspecifico: Hereda de Producto y añade propiedades específicas, como
        categoria o marca.
                Clase Inventario: Utiliza un ArrayList de objetos Producto para gestionar el inventario.
        Implementa métodos para añadir, eliminar, y listar productos, además de buscar productos
        por nombre o categoría.*/

        Inventario inventario = new Inventario();


        Producto producto1 = new Producto(1, "Regla", 2.50);
        Producto producto02 = new Producto(2, "Lapiz", 2.50);
        ProductoEspecifico producto2 = new ProductoEspecifico(3, "Cuaderno", 2.50, "Papeleria", "Norma");

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto02);
        inventario.agregarProducto(producto2);


        //Comentar estas lineas para primera vista
        System.out.println("\n Después de eliminar");

        inventario.elimniarProducto(1);

        inventario.listarProductos();

    }
}