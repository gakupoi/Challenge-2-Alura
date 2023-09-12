package Interfaces.interfaz;

import javax.swing.*;
public class Display {
    protected double interfaceAmount;

    String[] arrayOptions = {"Conversor de Moneda", "Conversor de Distancia"};
    String[] divisas = {"USD", "EUR", "GBP", "JPY", "KRW", "MXN"};
    String[] distancias = {"KM", "M", "CM", "MM"};

    public Object convertidor(){
        var opcion = JOptionPane.showInputDialog(
                null,
                "Seleccione una opcion de conversion",
                "MENU",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                arrayOptions,
                arrayOptions[0]);
        System.out.println(opcion);
        return opcion;
    }


    public String moneyConvert(){
        var opcion = JOptionPane.showInputDialog(
                null,
                "Seleccione la divisa ",
                "MENU",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                divisas,
                divisas[0]);
        System.out.println(opcion);
        return (String) opcion;
    }

    public String distance(){
        var opcionDistance = JOptionPane.showInputDialog(
                null,
                "Seleccione la unidad a convertir",
                "MENU",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                distancias,
                distancias[0]);
        System.out.println(opcionDistance);
        return (String) opcionDistance;
    }

    public void displayTotal(double valor,double total, String origen, String destino){
        String resultadoFormateado = String.format("%.2f", total);
        String origenFormateado = String.format("%.2f", valor);
        JOptionPane.showMessageDialog(
                null,
                origenFormateado + " "+ origen + " es igua a "+ resultadoFormateado + " " + destino,
                "Resultado",
                1);
//        System.out.println(opcionDistance);
    }

    public boolean repeat(){
        int respuesta = JOptionPane.showConfirmDialog ( null, "¿Quieres hacer otra conversión?",
                "Selecciona una opción", JOptionPane.YES_NO_OPTION);
        return respuesta != JOptionPane.NO_OPTION;

    }

    public double getInterfaceAmount() {
        return interfaceAmount;
    }

    public void setInterfaceAmount() {
        double numero;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
        System.out.println(numero);
        this.interfaceAmount = numero;
    }

    public void displayFirma(){
        JOptionPane.showMessageDialog(
          null,
          "Creado por:\nAlejandro Ramirez PInto",
          "Creador",
          1
        );
    }



}
