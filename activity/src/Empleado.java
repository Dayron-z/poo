public class Empleado extends Persona {
/*    Clase Empleado: Hereda de Persona y añade propiedades como idEmpleado y salario. Usa
    encapsulamiento adecuadamente.*/


    private double salario;
    private static int idEmpleado = 1;


    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", salario=" + salario +
                '}';
    }

}
