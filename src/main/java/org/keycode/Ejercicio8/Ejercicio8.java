package org.keycode.Ejercicio8;

import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir las categorías del juego
        String[] categorias = {"Animales", "Colores", "Frutas", "Países"};

        // Inicializar los puntos del jugador y la máquina
        int jugadorPuntos = 0;
        int maquinaPuntos = 0;
        long inicioTiempo = System.currentTimeMillis(); // tiempo en milisegundos al inicio del juego


        // Definir el límite de tiempo por ronda (en milisegundos)
        long tiempoLimiteRonda = 60000;

        // Comenzar el juego
        System.out.println("¡Bienvenido al juego de Stop!");

        // Pedir al jugador que introduzca su nombre
        System.out.print("Introduce tu nombre: ");
        String jugadorNombre = scanner.nextLine();
        System.out.println("Hola, " + jugadorNombre + ". ¡Comencemos!");

        // Definir un conjunto de letras aleatorias
        Random random = new Random();
        char letra = (char) (random.nextInt(26) + 'A');
        System.out.println("La letra de esta ronda es: " + letra);

        // Pedir al jugador que seleccione una categoría
        System.out.println("Por favor, selecciona una categoría:");
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ". " + categorias[i]);
        }
        int categoriaSeleccionada = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        String categoria = categorias[categoriaSeleccionada - 1];
        System.out.println("Has seleccionado la categoría: " + categoria);

        // Obtener una lista de palabras para la categoría seleccionada
        List<String> palabrasCategoria = obtenerPalabrasCategoria(categoria);

        // Iniciar la primera ronda
        while (true) {
            System.out.println("Tu turno, escribe una palabra que empiece por la letra " + letra + " y pertenezca a la categoría " + categoria + ":");
            String jugadorPalabra = scanner.nextLine().toUpperCase();

            // Verificar si la palabra es válida
            if (palabraEsValida(jugadorPalabra, letra, palabrasCategoria)) {
                jugadorPuntos++;
                System.out.println("Has ganado un punto.");
            } else {
                System.out.println("Lo siento, esa palabra no es válida. No has ganado puntos.");
            }

            // Turno de la máquina
            String maquinaPalabra = null;
            for (String palabra : palabrasCategoria) {
                if (palabra.startsWith(String.valueOf(letra))) {
                    maquinaPalabra = palabra;
                    break;
                }
            }
            if (maquinaPalabra != null) {
                maquinaPuntos++;
                System.out.println("La máquina ha escrito la palabra " + maquinaPalabra + ". La máquina ha ganado un punto.");
            } else {
                System.out.println("La máquina no ha podido escribir ninguna palabra. No ha ganado puntos.");
            }

            // Verificar si se ha agotado el tiempo de la ronda
            long tiempoRestante = tiempoLimiteRonda - (System.currentTimeMillis() - inicioTiempo);
            if (tiempoRestante <= 0) {
                break;
            }
            System.out.println("Tiempo restante en la ronda: " + (tiempoRestante / 1000) + " segundos.");

            // Definir la letra para la siguiente ronda
            letra = obtenerSiguienteLetra(letra, palabrasCategoria);

            // Verificar si el juego ha terminado
            if (letra == '-') {
                break;
            }

            // Pedir al jugador que seleccione una nueva categoría
            System.out.println("Por favor, selecciona una nueva categoría:");
            for (int i = 0; i < categorias.length; i++) {
                System.out.println((i + 1) + ". " + categorias[i]);
            }
            categoriaSeleccionada = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            categoria = categorias[categoriaSeleccionada - 1];
            System.out.println("Has seleccionado la categoría: " + categoria);
        }

        // Mostrar los resultados finales
        System.out.println("El juego ha terminado.");
        System.out.println("Puntos de " + jugadorNombre + ": " + jugadorPuntos);
        System.out.println("Puntos de la máquina: " + maquinaPuntos);
        if (jugadorPuntos > maquinaPuntos) {
            System.out.println("¡Felicidades, has ganado!");
        } else if (jugadorPuntos < maquinaPuntos) {
            System.out.println("Lo siento, has perdido.");
        } else {
            System.out.println("¡Es un empate!");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para obtener una lista de palabras para una categoría
    public static List<String> obtenerPalabrasCategoria(String categoria) {
        List<String> palabras = new ArrayList<String>();
        switch (categoria) {
            case "Animales":
                palabras.add("Águila");
                palabras.add("Ballena");
                palabras.add("Conejo");
                palabras.add("Delfín");
                palabras.add("Elefante");
                palabras.add("Flamenco");
                palabras.add("Gato");
                palabras.add("Halcón");
                palabras.add("Iguana");
                palabras.add("Jirafa");
                palabras.add("Koala");
                palabras.add("León");
                palabras.add("Murciélago");
                palabras.add("Ñandú");
                palabras.add("Ornitorrinco");
                palabras.add("Perro");
                palabras.add("Quetzal");
                palabras.add("Rana");
                palabras.add("Serpiente");
                palabras.add("Tigre");
                palabras.add("Urraca");
                palabras.add("Vaca");
                palabras.add("Wombat");
                palabras.add("Xoloitzcuintle");
                palabras.add("Yak");
                palabras.add("Zorro");
                break;
            case "Colores":
                palabras.add("Amarillo");
                palabras.add("Blanco");
                palabras.add("Celeste");
                palabras.add("Dorado");
                palabras.add("Esmeralda");
                palabras.add("Fucsia");
                palabras.add("Gris");
                palabras.add("Hueso");
                palabras.add("Índigo");
                palabras.add("Jade");
                palabras.add("Kaki");
                palabras.add("Lila");
                palabras.add("Marrón");
            case "Frutas":
                palabras.add("Aguacate");
                palabras.add("Banana");
                palabras.add("Ciruela");
                palabras.add("Durazno");
                palabras.add("Fresa");
                palabras.add("Granada");
                palabras.add("Higo");
                palabras.add("Kiwi");
                palabras.add("Lima");
                palabras.add("Mango");
                palabras.add("Naranja");
                palabras.add("Piña");
                palabras.add("Plátano");
                palabras.add("Quinoto");
                palabras.add("Rambután");
                palabras.add("Sandía");
                palabras.add("Tuna");
                palabras.add("Uva");
                palabras.add("Zapote");
                break;
            case "Países":
                palabras.add("Argentina");
                palabras.add("Brasil");
                palabras.add("Canadá");
                palabras.add("Dinamarca");
                palabras.add("Egipto");
                palabras.add("Francia");
                palabras.add("Grecia");
                palabras.add("Honduras");
                palabras.add("Italia");
                palabras.add("Japón");
                palabras.add("Kenia");
                palabras.add("Líbano");
                palabras.add("México");
                palabras.add("Noruega");
                palabras.add("Omán");
                palabras.add("Polonia");
                palabras.add("Qatar");
                palabras.add("Rusia");
                palabras.add("Sudáfrica");
                palabras.add("Túnez");
                palabras.add("Uruguay");
                palabras.add("Venezuela");
                palabras.add("Yemen");
                palabras.add("Zambia");
                break;
            default:
                System.out.println("Categoría no válida.");
                break;
        }
        return palabras;
    }

    // Método para obtener una letra aleatoria o la siguiente letra en orden alfabético
    public static char obtenerSiguienteLetra(char letraAnterior, List<String> palabrasCategoria) {
        // Si la lista de palabras de la categoría está vacía, no hay letra siguiente
        if (palabrasCategoria.isEmpty()) {
            return '-';
        }

        char letraSiguiente = letraAnterior;
        // Encontrar la siguiente letra en orden alfabético
        do {
            letraSiguiente++;
            if (letraSiguiente > 'Z') {
                letraSiguiente = 'A';
            }
        } while (!empiezaConLetra(palabrasCategoria.get(0), letraSiguiente));

        return letraSiguiente;
    }

    // Método para verificar si una palabra empieza con una letra dada
    public static boolean empiezaConLetra(String palabra, char letra) {
        String primeraLetra = String.valueOf(letra).toUpperCase();
        return palabra.toUpperCase().startsWith(primeraLetra);
    }

    // Método para verificar si una palabra es válida según las reglas del juego
    public static boolean palabraEsValida(String palabra, char letraAnterior, List<String> palabrasCategoria) {
        // La palabra debe empezar con la letra anterior o la letra siguiente en orden alfabético
        char primeraLetra = palabra.toUpperCase().charAt(0);
        if (primeraLetra != letraAnterior && primeraLetra != obtenerSiguienteLetra(letraAnterior, palabrasCategoria)) {
            return false;
        }



        // La palabra debe pertenecer a la categoría correspondiente
        if (!palabrasCategoria.contains(palabra.toUpperCase())) {
            return false;
        }

        return true;
    }

}






