public class ParteC {
    public static void main(String[] args) {

        String text1 = "2026";
        String text2 = "98.6";
        String text3 = "false";

        int entero = Integer.parseInt(text1); //Convertir un texto a número entero
        //Integer = clase de java que trabaja con # enteros
        //Parse = Interpretar/convertir + Int a entero.
        double decimal = Double.parseDouble(text2);
        boolean bandera = Boolean.parseBoolean(text3);

        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(bandera);

        String s1 = String.valueOf(entero); //valueOf = obtener el valor como texto
        String s2 = Integer.toString(entero); //toString = convertir a texto
        String s3 = "" + entero;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}