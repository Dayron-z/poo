import java.util.ArrayList;

public class GestionEmpleados {
    //Creamos un arraylist
    private ArrayList<Empleado> empleados;


    //Se crea cada que instanciamos un objeto
    public GestionEmpleados() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public boolean eliminarEmpleado(int idEmpleado){
        return empleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
    }



    public void listarEmpleados(){
        for (Empleado iterador : empleados){
            System.out.println("ID empleado: " + iterador.getIdEmpleado() + "\n" + "Nombre: " + iterador.getNombre() + "\n"  + "Salario" + iterador.getSalario());
        }
    }

}
