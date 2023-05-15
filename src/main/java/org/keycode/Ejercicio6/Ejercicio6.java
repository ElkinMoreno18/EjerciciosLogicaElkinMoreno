package org.keycode.Ejercicio6;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {

        int[][] ventas = new int[5][80];
        int[] totalVentasCajeros = new int[5];
        int[] totalVentasDias = new int[80];
        int totalVentas = 0;
        int cajeroMayorVenta = 0;
        int diaMayorVenta = 0;
        int cajeroMenorVentaDia60 = 0;
        int mejorCajeroDia30 = 0;
        int peorCajeroDia30 = 0;
        int ventaMayor = 0;
        int ventaMenor = Integer.MAX_VALUE;

        // Ventas aleatorias para cada cajero y día
        Random rand = new Random();
        for (int cajero = 0; cajero < 5; cajero++) {
            for (int dia = 0; dia < 80; dia++) {
                ventas[cajero][dia] = rand.nextInt(10000) + 1000;
            }
        }

        // Calculo de totales
        for (int cajero = 0; cajero < 5; cajero++) {
            for (int dia = 0; dia < 80; dia++) {
                totalVentasCajeros[cajero] += ventas[cajero][dia];
                totalVentasDias[dia] += ventas[cajero][dia];
                totalVentas += ventas[cajero][dia];
                if (ventas[cajero][dia] > ventaMayor) {
                    ventaMayor = ventas[cajero][dia];
                    cajeroMayorVenta = cajero;
                    diaMayorVenta = dia;
                }
                if (dia == 59 && ventas[cajero][dia] < ventas[cajeroMenorVentaDia60][dia]) {
                    cajeroMenorVentaDia60 = cajero;
                }
                if (dia == 29) {
                    if (ventas[cajero][dia] > ventas[mejorCajeroDia30][dia]) {
                        mejorCajeroDia30 = cajero;
                    }
                    if (ventas[cajero][dia] < ventas[peorCajeroDia30][dia]) {
                        peorCajeroDia30 = cajero;
                    }
                }
            }
        }

        System.out.println("Total de ventas de todos los cajeros: " + totalVentas);
        System.out.println("El cajero que vendió más es el número " + cajeroMayorVenta + " vendiendo un total de " + ventaMayor);
        System.out.println("El día de mayor venta fue el día " + diaMayorVenta + " y el cajero responsable fue el número " + cajeroMayorVenta);
        System.out.println("El cajero con menos ventas en el día 60 es el número " + cajeroMenorVentaDia60);
        System.out.println("El mejor cajero del día 30 es el número " + mejorCajeroDia30 + " y el peor cajero es el número " + peorCajeroDia30);
    }
}
