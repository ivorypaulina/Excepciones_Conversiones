public class Actividad2 {
    public static void main(String[] args) {

        try {

            Estudiante e1 = new Estudiante("Marco", 20, 9.5);
            Estudiante e2 = new Estudiante("Cassandra", 22, 8.7);
            Estudiante e3 = new Estudiante("Carlos", -5, 7.0);

            e1.mostrarDatos();
            e2.mostrarDatos();
            e3.mostrarDatos();

        } catch (EdadInvalidaException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
