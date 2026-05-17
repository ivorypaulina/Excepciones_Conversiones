public class ParteA {
    public static void main(String[] args) {

        byte b = 10; //Guarda numeros enteros pequeños.
        short s = b; //Guarda números más grandes que byte.
        int i = s; //Tiene más espacio que short.
        long l = i; //Guarda numeros enteros muy grandes
        float f = l; //Pasa de entero a decimal.
        double d = f; //Tiene más precisión que float.

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}