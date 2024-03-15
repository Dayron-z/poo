import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmpleados {

    //Creamos un ArrayList que almacenará los empleados
    private ArrayList<Empleado> empleados;

    public GestionEmpleados() {
        this.empleados = new ArrayList<>();
    }

    public void añadirEmpleados(Scanner objScanner){
        System.out.println("Ingresa el nombre del empleado");
        String nombre = objScanner.next();
        System.out.println("Ingresa la edad del empleado");
        int edad = objScanner.nextInt();
        System.out.println("Ingrese el salario del empleado");
        double salario = objScanner.nextDouble();

        Empleado nuevoEmpleado = (new Empleado(nombre, edad, salario));

        empleados.add(nuevoEmpleado);


        System.out.println("Empleado agregado con exito");
    }


    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }


}
