package bucles;

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

        switch (num) {
            case 1:
                numCarta = "AS";
                break;
            case 10:
                numCarta = "SOTA";
                break;
            case 11:
                numCarta = "CABALLO";
                break;
            case 12:
                numCarta = "REY";
                break;
            default:
                numCarta = String.valueOf(num);
        }

        switch (palo) {
            case 'C':
                paloCarta = "COPAS";
                break;
            case 'E':
                paloCarta = "ESPADAS";
                break;
            case 'O':
                paloCarta = "OROS";
                break;
            case 'B':
                paloCarta = "BASTOS";
                break;
            default:
                paloCarta = "";
        }

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
