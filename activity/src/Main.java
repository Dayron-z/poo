import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Ejercicio 2: Sistema de Registro de Empleados
        Objetivo: Desarrollar un sistema para manejar los empleados de una empresa, aplicando
        encapsulamiento, herencia y polimorfismo, y utilizando ArrayList para almacenar los
        empleados.

                Principios de POO aplicados: Encapsulamiento, Herencia, Polimorfismo.

                Requisitos:

        Clase Persona: Con propiedades básicas como nombre y edad.
                Clase Empleado: Hereda de Persona y añade propiedades como idEmpleado y salario. Usa
        encapsulamiento adecuadamente.
        Clase EmpleadoTemporal y Clase EmpleadoPermanente: Heredan de Empleado y
        representan diferentes tipos de empleados.
                Clase GestionEmpleados: Utiliza un ArrayList para gestionar objetos del tipo Empleado.
                Implementa métodos para añadir, eliminar y mostrar empleados. Utiliza polimorfismo para
        manejar diferentes tipos de empleados.*/
        Scanner objScanner = new Scanner(System.in);
        GestionEmpleados objEmpleado = new GestionEmpleados();
        int opcion = 0;

        do {
            System.out.println("""
                Ingresa una opcion
                1- Añadir empleado 
                2- Eliminar empleado
                3- Mostrar empleados
                4 - Salir
                """);
            opcion = objScanner.nextInt();


            switch (opcion){
                case 1:
                    objEmpleado.añadirEmpleados(objScanner);
                    break;
                case 3:
                    objEmpleado.mostrarEmpleados();
            }

        }while(opcion != 4);



    }
}