import java.util.Scanner;
public class Actividad1 {
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);

         try{ //Significa "Intenta ejecutar este codigo"
             System.out.println("Ingrese un número entero: ");
             String entrada = sc.nextLine();

             int numero = Integer.parseInt(entrada); //Convierte el texto a un # entero
             double resultado = 100/numero;
             System.oSut.println("Resultado: " + resultado);

         } catch (ArithmeticException e){ //catch "Captura errores",ArithmeticException es como un detector de errores matematicos.
             System.out.println("No se puede dividir entre 0");

         }catch (NumberFormatException e){ //Captura errores cuando el usuario escribe algo que no es número.
             System.out.println("Debe ingresar un número válido");

         }finally { //Siempre se ejecuta no importa si hay o no error
             System.out.println("Programa finalizado correctamente");
         }
         sc.close(); //Cierra el scanner
    }
}