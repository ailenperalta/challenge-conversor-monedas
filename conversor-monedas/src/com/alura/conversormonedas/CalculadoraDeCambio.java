package com.alura.conversormonedas;

import java.util.Scanner;

public class CalculadoraDeCambio {
    public static void convertir(String monedaBase, String monedaTarget, Consulta consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Moneda moneda = consulta.buscarMoneda(monedaBase, monedaTarget);

        System.out.println("La tasa de conversión para hoy es: " + monedaBase + " = " + moneda.conversion_rate() + " " + monedaTarget);

        System.out.println("Ingrese la cantidad de " + monedaBase + ":");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * moneda.conversion_rate();

        System.out.println("El valor " + cantidad + " (" + monedaBase + ") corresponde a "
                + cantidadConvertida + " (" + moneda.target_code() + ")");
    }
}
