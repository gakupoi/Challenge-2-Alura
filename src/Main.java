// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Conversor.Distance;
import Conversor.Money;
import Interfaces.interfaz.Display;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        Display display = new Display();
        Object opcionConversion = display.convertir();

        try {
            display.setInterfaceAmount();
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingresa solo valores numéricos", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }


        if (opcionConversion == "Conversor de Moneda"){
//            System.out.println("Moneda");

            double valor = display.getInterfaceAmount();

            Money money = new Money(display.toConvert() , display.Convert(), valor);

            System.out.println(money.getTotal());


        } else if (opcionConversion == "Conversor de Temperatura"){
//            System.out.println("distancia");

        }


    }


}