public class ParteB {
    public static void main(String[] args) {

        double numero = 45.89;

        float f = (float) numero;
        int i = (int) numero;
        short s = (short) numero;
        byte b = (byte) numero;

        System.out.println("double: " + numero);
        System.out.println("float: " + f);
        System.out.println("int: " + i);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
    }
}