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
        double moneda1 = 0;
        switch (origen) {
            case "USD":
                moneda1 = USD;
                break;
            case "EUR":
                moneda1 = EUR;
                break;
            case "GBP":
                moneda1 = GBP;
                break;
            case "JPY":
                moneda1 = JPY;
                break;
            case "KRW":
                moneda1 = KRW;
                break;
            case "MXN":
                moneda1 = MXN;
                break;
        }
        double moneda2 = 0;
        switch (destino) {
            case "USD":
                moneda2 = USD;
                break;
            case "EUR":
                moneda2 = EUR;
                break;
            case "GBP":
                moneda2 = GBP;
                break;
            case "JPY":
                moneda2 = JPY;
                break;
            case "KRW":
                moneda2 = KRW;
                break;
            case "MXN":
                moneda2 = MXN;
                break;
        }
        System.out.println(moneda1);
        System.out.println(moneda2);
        total = (valor*moneda2)/moneda1;
        }

    public double getTotal() {
        return total;
    }
}




