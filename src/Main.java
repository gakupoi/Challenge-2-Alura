// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Conversor.Distance;
import Conversor.Money;
import Interfaces.interfaz.Display;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {
        double valor= 0;
        double total = 0;
        String origen = "";
        String destino = "";
        boolean repetir = true;


        Display display = new Display();
        while (repetir) {
            Object opcionConversion = display.convertidor();
            boolean valid = false;
            while (!valid) {
                try {
                    display.setInterfaceAmount();
                    valid = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingresa solo valores numéricos", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }


            if (opcionConversion == "Conversor de Moneda") {
//            System.out.println("Moneda");
                valor = display.getInterfaceAmount();
                origen = display.moneyConvert();
                destino = display.moneyConvert();
                Money money = new Money(origen, destino, valor);
//            System.out.println(money.getTotal());
                total = money.getTotal();


            } else if (opcionConversion == "Conversor de Distancia") {
//            System.out.println("distancia");
                valor = display.getInterfaceAmount();
                origen = display.distance();
                destino = display.distance();
                Distance distance = new Distance(origen, destino, valor);
//            System.out.println(distance.getTotal());
                total = distance.getTotal();

            }

            display.displayTotal(valor, total, origen, destino);
            repetir = display.repeat();
        }
        display.displayFirma();



    }


}