public class Estudiante {

    private String nombre;
    private Curso curso;

    // Constructor que inicializa el nombre y el curso
    public Estudiante(String nombre, Curso curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    // Constructor que inicializa solo el nombre sin el curso asignado
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.curso = null;
    }

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de curso
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    // Método que devuelve la información del estudiante y el curso
    public String getInfoEstudiante() {
        if (curso == null) {
            return "Estudiante: " + nombre + ", Curso: No asignado";
        } else {
            return "Estudiante: " + nombre + ", Curso: " + curso.toString();
        }
    }

    @Override
    public String toString() {
        return getInfoEstudiante();
    }
}
