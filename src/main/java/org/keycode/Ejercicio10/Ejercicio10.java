package org.keycode.Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el patron a dibujar: ");
        System.out.println("1. Figura A");
        System.out.println("2. Figura B");
        System.out.println("3. Figura C");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                figuraA();
                break;
            case 2:
                figuraB();
                break;
            case 3:
                figuraC();
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        sc.close();
    }

    public static void figuraA() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void figuraB() {
        int altura = 5;
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= altura; i++) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void figuraC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int altura = sc.nextInt();
        sc.close();
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}