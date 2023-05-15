package org.keycode.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Seleccione la figura geométrica:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            double area = 0.0;
            switch(opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = sc.nextDouble();
                    area = lado * lado;
                    break;
                case 2:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double altura = sc.nextDouble();
                    area = base * altura;
                    break;
                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    base = sc.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    altura = sc.nextDouble();
                    area = (base * altura) / 2;
                    break;
                case 4:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = sc.nextDouble();
                    area = Math.PI * Math.pow(radio, 2);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            if (opcion > 0 && opcion < 5) {
                System.out.println("El área de la figura seleccionada es: " + area);
            }
        } while(opcion != 0);

        sc.close();
    }
}
