package Conversor;


import javax.swing.*;

public class Money {
    private final double USD = 1;
    private final double EUR = 0.91;
    private final double GBP = 0.79;
    private final double JPY = 144.70;
    private final double KRW = 1193.97;
    private final double MXN = 17.52;

    private double total = 0;

    public Money(String origen, String destino, double valor) {
        double moneda1 = switch (origen) {
            case "USD" -> USD;
            case "EUR" -> EUR;
            case "GBP" -> GBP;
            case "JPY" -> JPY;
            case "KRW" -> KRW;
            case "MXN" -> MXN;
            default -> 0;
        };
        double moneda2 = switch (destino) {
            case "USD" -> USD;
            case "EUR" -> EUR;
            case "GBP" -> GBP;
            case "JPY" -> JPY;
            case "KRW" -> KRW;
            case "MXN" -> MXN;
            default -> 0;
        };
        System.out.println(moneda1);
        System.out.println(moneda2);
        total = (valor*moneda2)/moneda1;
        }

    public double getTotal() {
        return total;
    }
}




