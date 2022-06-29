package ejercicio3;

public class SistemaEscuela implements ISistema{
    private String nombre;
    private String capacidad;
    private Estudiante[] estudiantes;
    private String requisitos;

    public SistemaEscuela(String nombre, String capacidad, Estudiante[] estudiantes , String requisitos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estudiantes = estudiantes;
        this.requisitos = requisitos;
    }

    @Override
    public void registrarse() {
        System.out.println("********** INFO ESCUELA **********");
        System.out.println("Nombre Escuela: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Estudiantes");
        for (Estudiante estudiante: estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
        }
        System.out.println("Requisitos: " + requisitos);
    }
}
