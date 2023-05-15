package org.keycode.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double number = input.nextDouble();

        switch (Double.compare(number, 0.0)) {
            case 1 -> System.out.println("El número ingresado es positivo.");
            case -1 -> System.out.println("El número ingresado es negativo.");
            default -> System.out.println("El número ingresado es cero.");
        }
    }

}
