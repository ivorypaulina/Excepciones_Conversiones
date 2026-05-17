public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio)
            throws EdadInvalidaException {
            //throws se usa para avisar que un metodo puede lanzar una excepcion
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException(edad);
            //throw lanza el error manualmente
        }

        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }
}