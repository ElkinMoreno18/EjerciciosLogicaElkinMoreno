package org.keycode.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la palabra a extraer cantidad de vocales: ");
        String palabra = sc.nextLine();
        sc.close();

        int contadorVocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letraEsVocal(letra)) {
                contadorVocales++;
            }
        }

        System.out.println("La palabra " + palabra + " tiene " + contadorVocales + " vocales.");
    }

    public static boolean letraEsVocal(char letra) {
        letra = Character.toLowerCase(letra);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
