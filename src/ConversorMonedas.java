public class ConversorMonedas {

    public static double convertir(String origen, String destino, double cantidad)
            throws MonedaNoSoportadaException { //Este metodo puede lanzar una excepción

        if (!origen.equals("USD") && !origen.equals("EUR")) {
            throw new MonedaNoSoportadaException("Moneda origen no soportada");
        }

        if (!destino.equals("USD") && !destino.equals("EUR")) {
            throw new MonedaNoSoportadaException("Moneda destino no soportada");
        }

        if (origen.equals("USD") && destino.equals("EUR")) {
            return cantidad * 0.92;
        }

        if (origen.equals("EUR") && destino.equals("USD")) {
            return cantidad * 1.08;
        }

        return cantidad;
    }
}
