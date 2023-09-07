// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Conversor.Distance;
import Conversor.Money;

import javax.swing.*;


public class Main {
    public static double interfaceAmount (){
        double numero;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
//        System.out.println(numero);
        return numero;
    }
    public static void main(String[] args) {

        String [] arrayOptions = {"Conversor de Moneda", "Conversor de Temperatura" };
        Object opcionConversion = JOptionPane.showInputDialog(
                null,
                "Seleccione una opcion de conversion",
                "MENU",
                JOptionPane.QUESTION_MESSAGE,
                null,
                arrayOptions,
                "Conversor de Moneda");


        System.out.println(opcionConversion);

        if (opcionConversion == "Conversor de Moneda"){
            double valor = interfaceAmount();
            System.out.println(valor);
            //Money money = new Money();
        } else if (opcionConversion == "Conversor de temperatura"){
            System.out.println("distancia");
            Distance distance = new Distance();

        }


    }


}