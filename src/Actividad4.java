import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Moneda origen: ");
            String origen = sc.nextLine();

            System.out.print("Moneda destino: ");
            String destino = sc.nextLine();

            System.out.print("Cantidad: ");
            String cantidadTexto = sc.nextLine();

            double cantidad = Double.parseDouble(cantidadTexto);

            double resultado = ConversorMonedas.convertir(origen, destino, cantidad);

            System.out.println("Resultado: " + String.format("%.2f", resultado)
            );

        } catch (NumberFormatException e) {
            System.out.println("Cantidad inválida");

        } catch (MonedaNoSoportadaException e) {
            System.out.println(e.getMessage());

        }

        sc.close();
    }
}
