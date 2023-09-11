package Interfaces.interfaz;

import javax.swing.*;
public class Display {
    protected double interfaceAmount;

    String[] arrayOptions = {"Conversor de Moneda", "Conversor de Temperatura"};
    String[] divisas = {"USD", "EUR", "GBP", "JPY", "KRW", "MXN"};

    public Object convertir(){
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

    public String toConvert(){
        var opcion2 = JOptionPane.showInputDialog(
                null,
                "Seleccione la moneda local a convertir",
                "MENU",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                divisas,
                divisas[0]);
        System.out.println(opcion2);
        return (String) opcion2;
    }

    public String Convert(){
        var opcion = JOptionPane.showInputDialog(
                null,
                "Seleccione la moneda local a convertir",
                "MENU",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                divisas,
                divisas[0]);
        System.out.println(opcion);
        return (String) opcion;
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



}
