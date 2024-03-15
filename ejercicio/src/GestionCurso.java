import java.util.ArrayList;
import java.util.Scanner;



public class GestionCurso {
/*    Clase GestionCursos: Encargada de administrar los cursos, incluyendo métodos para
    agregar cursos, inscribir estudiantes en cursos y listar estudiantes inscritos en un curso
    específico.*/
    private ArrayList<Curso> listaCursos;

    public GestionCurso() {
        this.listaCursos = new ArrayList<>();
        //Queremos que cuando instanciemos la clase GestionCurso, se cree un arrayList con un tipo de dato objeto Curso.
    }

    public void agregarCurso(Scanner objScan){
        System.out.println("Ingresa el nombre del nuevo curso");
        String nombre = objScan.next();

        System.out.println("Ingresa el código del nuevo curso");
        String codigo = objScan.next();


        //Preguntamos si encontró algun dato que se repita, sabremos que no existe un curso con este grupo cuando el iterador  que nos proporciona el metodo buscar codigo por curso nos retorna null

        if (this.buscarCursoPorCodigo(codigo) != null){
            System.out.println("\nYa existe un curso con este código");
        }else {
            Curso objCurso = new Curso(codigo,nombre);
            if (this.listaCursos.add(objCurso)) {
                System.out.println("Curso agregado correctamente");
            }else {
                System.out.println("No se pudo agregar el curso.");
            }
        }

    }


    public void listarTodosLosCursos(){
        if (this.listaCursos.isEmpty()){
            System.out.println("No hay cursos registrados\n");
        }else {
            for (Curso iterador: this.listaCursos){
                System.out.println(iterador.toString());
            }
        }
    }



    //Buscar curso por codigo

    public Curso buscarCursoPorCodigo(String codigoBuscar){
        //Necesitamos que reciba como parametro el codigo con el que vamos a buscar
        //Tengamos claro que iterador almacena en el momento que encuntra la coinicidencia
        for (Curso iterador: this.listaCursos){
            if (iterador.getCodigo().equalsIgnoreCase(codigoBuscar)){
                return iterador;
            }
        }

        //Es obligatorio retornar algo
        return null;
    }
}
