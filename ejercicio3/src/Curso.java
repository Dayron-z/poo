import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String codigo;
    private String nombre;
    private ArrayList<Estudiantes> listaEstudiantes;
    //Un método estático es el que se puede usar sin tener que instanciar la clase
    //Basicamente termina siendo una variable global.
    public static int index = 0;




    public Curso(String codigo, String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEstudiantes = new ArrayList<>();
    }


    public String getCodigo() {
        return codigo;
    }


    public void agregarEstudiante(Scanner objScanner){
        objScanner.nextLine();
        System.out.println("Ingresa el nombre del estudiante");
        String nombreEstudiante = objScanner.next();
        System.out.println("Ingresa el email del estudiante");
        String emailEstudiante = objScanner.next();

        Estudiantes objEstudiante = new Estudiantes(index,nombreEstudiante, emailEstudiante);
        this.listaEstudiantes.add(objEstudiante);

        System.out.println("Estudiante agregado correctamente");
        index ++;
    };


    public void listarEstudiantes(){
        if (this.listaEstudiantes.isEmpty()){
            System.out.println("No hay estudiantes en el curso ".concat(this.nombre));
        } else{
            System.out.println("Lista de estudiantes del Curso ".concat(this.nombre));
            for (Estudiantes iterador: this.listaEstudiantes){
                System.out.println(  index + " "+  iterador.toString());
            }
        }
    }


    public void eliminarEstudiante(Scanner objScanner){
        System.out.println("Ingrese el id del estudiante a eliminar");
        int idEliminar = objScanner.nextInt() - 1;
        //Para eliminar usamos el remove if, que es como tal, es un bucle
        boolean eliminar = listaEstudiantes.removeIf(estudiantes -> estudiantes.getId() == idEliminar);
        System.out.println(eliminar ? "Estudiante eliminado correctamente" : "No se pudo eliminar el estudiante");
    }



    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
