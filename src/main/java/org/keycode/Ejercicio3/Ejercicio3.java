package org.keycode.Ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) throws InterruptedException {
        int segundos = 0;

        while(segundos < 60) {
            System.out.printf("%02d:%02d:%02d\n", segundos / 3600, (segundos % 3600) / 60, segundos % 60);
            Thread.sleep(1000);
            segundos++;
        }

        System.out.println("El cronómetro ha finalizado.");
    }
}


