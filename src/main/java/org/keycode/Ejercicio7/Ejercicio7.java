package org.keycode.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número menor a 1000: ");
        int numero = sc.nextInt();


        if (numero < 1 || numero > 1000) {
            System.out.println("El numero ingresado es un número inválido.");
            return;
        }

        sc.close();


        String numeroRomano = "";
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < simbolos.length; i++) {
            while (numero >= valores[i]) {
                numeroRomano += simbolos[i];
                numero -= valores[i];
            }
        }

        System.out.println("El número romano corresponde a: " + numeroRomano);
    }

}
