package org.keycode.Ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) {
        boolean existeMultiplo = false;
        for (int i = 1; i <= 500; i++) {
            if (i % 8 == 0) {
                System.out.println(i);
                existeMultiplo = true;
            }
        }
        if (!existeMultiplo) {
            System.out.println("Lo sentimos, no existe un número en 500 que sea múltiplo de 8");
        }
    }
}
