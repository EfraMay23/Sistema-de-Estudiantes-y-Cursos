public class Principal {
    public static void main(String[] args) {

        // Creación de mis cursos con sus respectivos creditos
        Curso Español = new Curso("Español", 5);
        Curso Ingles = new Curso("Ingles", 4);

        // Declaración e inicialización del arreglo de estudiantes
        Estudiante[] EstudiantesFmat = {
            new Estudiante("Efrain"),
            new Estudiante("Cesar", Español),
            new Estudiante("Sherly", Ingles),
            new Estudiante("Claudia")
        };

        // Recorrer e imprimir el arreglo
        for (Estudiante e : EstudiantesFmat) {
            System.out.println(e.getInfoEstudiante());
        }
    }
}
