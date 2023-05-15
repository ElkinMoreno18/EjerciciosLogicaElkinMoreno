package org.keycode.Ejercicio2;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int cantPersonas = input.nextInt();

        int totalEdades = 0;

        for (int i = 1; i <= cantPersonas; i++) {
            System.out.print("Ingrese la edad de la persona " + i + ": ");
            int edad = input.nextInt();
            totalEdades += edad;
        }

        double promedioEdad = (double) totalEdades / cantPersonas;

        System.out.println("La suma total de edades es: " + totalEdades + " y el promedio de edad es: " + promedioEdad);

        String mensaje = "La suma total de edades es: " + totalEdades + "\nEl promedio de edad es: " + promedioEdad;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
