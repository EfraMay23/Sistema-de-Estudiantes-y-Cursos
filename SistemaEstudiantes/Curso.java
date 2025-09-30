public class Curso {
    
    private String nombreCurso;
    private int creditos;

    // Constructor
    public Curso(String nombreCurso, int creditos) {
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
    }

    // Getter y Setter de nombreCurso
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    // Getter y Setter de creditos
    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return nombreCurso + " (" + creditos + " créditos)";
    }
}
