
public class Estudiantes {
    private int id;
    private  String nombre;
    private String email;


    public Estudiantes(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "id=" + Curso.index +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

//Lo unico que hacemos en Estudiantes es atributos que piden, getId, toString.