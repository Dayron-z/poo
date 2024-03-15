import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creamos instancias necesarias
        Scanner objScanner  =new Scanner(System.in);

        //Recordemos el patron de ejecucion una vez se instancia el objGestionCurso
        // Una vez se crea, la  importancia radica exclusivamente en su metodos, ya que como tal no recibe argumentos de constructor
        // A su vez cuenta con un arraylist que almacena cursos
        //Cada que se instancie un objeto de la clase Gestion curso se crea un ArrayList, por lo que en este caso al solo instanciar un objeto de esta clase, entendemos que unicamente se crea ese arrayList en la ejecución del programa

        GestionCurso objGestionCurso = new GestionCurso();

    int option = 0;
        do {

            System.out.println("""
                    MENU DE OPCIONES
                    1. Administrar Estudiantes
                    2. Administrar Cursos
                    3. Salir
                                        
                    Ingrese una opción: 
                    """);

            option = objScanner.nextInt();

            switch (option){
                //Caso: Administrar estudiantes
                case 1:
                    int option2 = 0;

                    do {
                        System.out.println("""
                                1 - Agregar estudiante a curso                                
                                2. Listar todos los estudiantes de un curso
                                3. Eliminar estudiante de un curso
                                4. Salir
                                                                
                                Ingresa una opción: 
                                """);

                        option2 = objScanner.nextInt();

                        switch (option2){
                            case 1:
                                objGestionCurso.listarTodosLosCursos();

                                System.out.println("Ingresa el codigo del curso donde desea ingresar al estudiante");
                                String codigoCurso = objScanner.next();

                                //Es importante notar la importancia de buscar curso por codigo, ya que en este nos ayuda a asignar curso especifico
                                Curso objCurso = objGestionCurso.buscarCursoPorCodigo(codigoCurso);

                                if (objCurso == null){
                                    System.out.println("El codigo es inválido");
                                }else{
                                    //En este punto objCurso ya es un curso especifico, por ende procedemos a agregar al estudiante
                                    objCurso.agregarEstudiante(objScanner);
                                }

                                break;

                            case 2:
                                objGestionCurso.listarTodosLosCursos();
                                System.out.println("Ingrese el codigo del curso del que desea ver los estudiantes");
                                codigoCurso = objScanner.next();

                                objCurso = objGestionCurso.buscarCursoPorCodigo(codigoCurso);

                                if (objCurso == null) {
                                    System.out.println("El código ingresado no es válido");
                                } else {
                                    objCurso.listarEstudiantes();
                                }
                                break;


                            case 3: //Eliminar estudiantes a un curso en especifico

                                //1. Listar los cursos
                                objGestionCurso.listarTodosLosCursos();
                                //2. Preguntar el codigo del curso
                                System.out.println("Ingresa el código del curso donde deseas eliminar el estudiante: ");
                                codigoCurso = objScanner.next();
                                //3 . Buscar el Curso que tenga ese código
                                Curso objcurso = objGestionCurso.buscarCursoPorCodigo(codigoCurso);
                                //Curso en especifico
                                if (objcurso == null) {
                                    System.out.println("El código ingresado no coincide con ningún curso");
                                } else {
                                    //4. Eliminar el estudiante de ese curso encontrado
                                    objcurso.eliminarEstudiante(objScanner);
                                }
                                break;
                        }


                    } while (option2 != 4);
                    break;
                //Caso: Administrar cursos
                case 2:
                   int option3 = 0;
                    do {
                        System.out.println("""
                                MENU DE CURSOS
                                1. Agregar curso.
                                2. Listar cursos.
                                3. Buscar por código.
                                4. Salir
                                                                
                                Ingrese una opción:
                                """);
                        option3 = objScanner.nextInt();

                        switch (option3) {
                            case 1:
                                objGestionCurso.agregarCurso(objScanner);
                                break;
                            case 2:
                                objGestionCurso.listarTodosLosCursos();
                                break;
                            case 3:
                                System.out.println("Ingrese el curso que desea buscar \n");
                                String codigo = objScanner.next();

                                Curso objCurso = objGestionCurso.buscarCursoPorCodigo(codigo);

                                if (objCurso == null){
                                    System.out.println("No se pudo encontrar el curso");
                                }else{
                                    //En este usamos el toString para poder ver el objeto en forma de string
                                    System.out.println(objCurso.toString());
                                }
                                break;
                        }
                    } while (option3 != 4);

                    break;
            }
        } while (option != 3);
    }
}