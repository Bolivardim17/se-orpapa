package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //entradas
        Scanner leerdato= new Scanner(System.in);
        String nombreCliente;
        String correoCliente;
        String tipoDeCombo;
        int cedulaCliente;
        int cantidadCombo;
        int precioCombo1;
        int precioCombo2;
        double valorIva;
        double valorDescuento;

        //Pedimos los datos

        System.out.println("ingrese su nombre");
        nombreCliente=leerdato.nextLine();

        System.out.println("cual es tu correo electronico");
        correoCliente=leerdato.nextLine();

        System.out.println("Cual combo deseas");
        tipoDeCombo=leerdato.nextLine();

        System.out.println("numero de tu cedula");
        cedulaCliente=leerdato.nextInt();

        System.out.println("cuantos combos deseas");
        cantidadCombo=leerdato.nextInt();

        System.out.println("precio combo 1");
        precioCombo1=25000;

        System.out.println("precio combo 2");
        precioCombo2=32000;

        System.out.println("iva 19%");
        valorIva=0.19;

        System.out.println("descuento 10%");
        valorDescuento=0.10;

        //PRECESANDO ENTRADAS

        //CALCULAR COSTO TOTAL DEL PEDIDO

        if (tipoDeCombo)






    }
}