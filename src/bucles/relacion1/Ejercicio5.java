package bucles.relacion1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numCarta, paloCarta;

        int numFilas = 9;
        int numColumnas = 14;

        int num = sc.nextInt();
        sc.nextLine();

        char palo = sc.nextLine().toUpperCase().charAt(0);

        numCarta = switch (num) {
            case 1 -> "AS";
            case 10 -> "SOTA";
            case 11 -> "CABALLO";
            case 12 -> "REY";
            default -> String.valueOf(num);
        };

        paloCarta = switch (palo) {
            case 'C' -> "COPAS";
            case 'E' -> "ESPADAS";
            case 'O' -> "OROS";
            case 'B' -> "BASTOS";
            default -> "";
        };

        // numFilas lo he inicializado arriba, es lo mismo que poner 9
        for (int filas = 0; filas < numFilas; filas++) {
            if (filas == 0 || filas == numFilas - 1) {
                for (int columnas = 0; columnas < numColumnas; columnas++) {
                    if (columnas == 0 || columnas == numColumnas - 1) {
                        System.out.print('+');
                    } else {
                        System.out.print('-');
                    }
                }
            } else if (filas == 1) {
                System.out.print("| " + numCarta);

                for (int espacios = 0; espacios < numColumnas - 3 - numCarta.length(); espacios++) {
                    System.out.print(' ');
                }

                System.out.print('|');
            } else if (filas == 2) {
                System.out.print("| " + paloCarta);

                for (int espacios = 0; espacios < numColumnas - 3 - paloCarta.length(); espacios++) {
                    System.out.print(' ');
                }

                System.out.print('|');
            } else if (filas == numFilas - 2) {
                System.out.print('|');

                for (int espacios = 0; espacios < numColumnas - 3 - numCarta.length(); espacios++) {
                    System.out.print(' ');
                }

                System.out.print(numCarta + " |");
            } else {
                for (int columnas = 0; columnas < numColumnas; columnas++) {
                    if (columnas == 0 || columnas == numColumnas - 1) {
                        System.out.print('|');
                    } else {
                        System.out.print(' ');
                    }
                }
            }

            System.out.println();
        }
    }
}
