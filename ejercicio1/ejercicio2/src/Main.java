// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        //Instanciamos de las clase EmpleadoTemporal y EmpleadoPermante

        Empleado empleadoPermanente1 = new EmpleadoPermanente("Andres Zapata",  28, 1, 3000, 3);


        //Duda: Preguntar acerca del tipo de dato con el que se crean los empleados
        Empleado empleaadoTemporal1 = new EmpleadoTemporal("Andres Tabares", 20, 2, 25000, "31/12/2025");




        gestionEmpleados.agregarEmpleado(empleadoPermanente1);
        gestionEmpleados.agregarEmpleado(empleaadoTemporal1);


        gestionEmpleados.listarEmpleados();

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        //gestionEmpleados.eliminarEmpleado(1);

        System.out.println("Lista despues de eliminar");
        GestionEmpleados g = new GestionEmpleados();

    }
}