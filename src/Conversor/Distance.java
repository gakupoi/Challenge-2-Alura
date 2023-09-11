package Conversor;

public class Distance {
    private final double KM = 0.001;
    private final double M = 1;
    private final double CM = 100;
    private final double MM = 1000;
    private double total = 0;
    public Distance(String origen, String destino, double valor) {
        double valor1 = switch (origen) {
            case "KM" -> KM;
            case "M" -> M;
            case "CM" -> CM;
            case "MM" -> MM;
            default -> 0;
        };
        double valor2 = switch (destino) {
            case "KM" -> KM;
            case "M" -> M;
            case "CM" -> CM;
            case "MM" -> MM;
            default -> 0;
        };
        System.out.println(valor1);
        System.out.println(valor2);
        total = (valor*valor2)/valor1;

    }

    public double getTotal() { return total; }
}
