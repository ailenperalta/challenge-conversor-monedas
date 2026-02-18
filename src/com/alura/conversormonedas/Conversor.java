package com.alura.conversormonedas;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Consulta consulta = new Consulta();

        int opcion = 0;

        while (opcion != 7) {
            mostrarMenu();
            try {
                opcion = lectura.nextInt();
                lectura.nextLine();

                switch (opcion) {
                    case 1:
                        CalculadoraDeCambio.convertir("USD", "ARS", consulta, lectura);
                        break;
                    case 2:
                        CalculadoraDeCambio.convertir("ARS", "USD", consulta, lectura);
                        break;
                    case 3:
                        CalculadoraDeCambio.convertir("USD", "BRL", consulta, lectura);
                        break;
                    case 4:
                        CalculadoraDeCambio.convertir("BRL", "USD", consulta, lectura);
                        break;
                    case 5:
                        CalculadoraDeCambio.convertir("USD", "COP", consulta, lectura);
                        break;
                    case 6:
                        CalculadoraDeCambio.convertir("COP", "USD", consulta, lectura);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese sólo números válidos.");
                lectura.nextLine();
                opcion = 0;
            }
        }
        lectura.close();
    }

    public static void mostrarMenu() {
        System.out.println("""
                *******************************
                Bienvenido/a al Conversor de Monedas:
                
                1) Dólar => Peso argentino
                2) Peso argentino => Dólar
                3) Dólar => Real brasileño
                4) Real brasileño => Dólar
                5) Dólar => Peso colombiano
                6) Peso colombiano => Dólar
                7) Salir
                Seleccione una opción válida:
              
                ********************************
                """);
    }
}
