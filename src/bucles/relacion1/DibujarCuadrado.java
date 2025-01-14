package bucles.relacion1;

import java.util.Scanner;

public class DibujarCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número:");
        int num = sc.nextInt();

        sc.nextLine();

        System.out.println("Escribe un caracter:");
        char caracter = sc.nextLine().charAt(0);

        for (int filas = 0; filas < num; filas++) {
            if (filas == 0 || filas == num - 1) {
                for (int columnas = 0; columnas < num; columnas++) {
                    System.out.print(caracter);
                }
            } else {
                System.out.print(caracter);
                for (int columnas = 0; columnas < num - 2; columnas++) {
                    System.out.print(' ');
                }
                System.out.print(caracter);
            }
            System.out.println();
        }

        /*for (int columnas = 0; columnas < num; columnas++) {
            System.out.print(caracter);
        }
        System.out.println();

        for (int filas = 0; filas < num - 2; filas++) {
            System.out.print(caracter);
            for (int columnas = 0; columnas < num - 2; columnas++) {
                System.out.print(' ');
            }
            System.out.print(caracter);

            System.out.println();
        }

        for (int columnas = 0; columnas < num; columnas++) {
            System.out.print(caracter);
        }*/
    }
}
