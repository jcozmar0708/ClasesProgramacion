package bucles;

import java.util.Scanner;

public class Ejercicio4 {
    /*Diseña un algoritmo que pida 3 datos por teclado: una cadena (de hasta 80
            caracteres), un entero positivo "n" y un carácter (I o D).
    Con esos datos, debe dibujarse la cadena rellenando con puntos a la izquierda (I) o a
    la derecha (D) hasta tener "n" caracteres.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();
        int num = sc.nextInt();
        sc.nextLine();
        char lado = sc.nextLine().charAt(0);

        if (cadena.length() <= 80 || cadena.length() >= num) {
            int numPuntos = num - cadena.length();

            if (lado == 'D') {
                for (int i = 0; i < numPuntos; i++) {
                    System.out.print(".");
                }
                System.out.print(cadena);

            } else if (lado == 'I') {
                System.out.print(cadena);
                for (int i = 0; i < numPuntos; i++) {
                    System.out.print(".");
                }
            } else {
                System.out.println("La dirección debe ser I o D");
            }
        } else {
            System.out.println("La cadena no cabe");
        }
    }
}
