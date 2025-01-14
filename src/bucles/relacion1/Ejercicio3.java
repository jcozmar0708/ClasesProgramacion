package bucles.relacion1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int anterior = 0;
        int contador = 0;

        boolean flagCreciente = false;
        boolean flagDecreciente = false;

        do {
            num = sc.nextInt();

            if (num >= 0) {
                if (contador == 0) {
                    anterior = num;
                } else {
                    if (anterior > num) flagDecreciente = true;
                    if (anterior < num) flagCreciente = true;
                    if (anterior == num) {
                        flagDecreciente = true;
                        flagCreciente = true;
                    }
                }
                contador++;
            }

        } while(num >= 0);

        if (contador == 0) {
            System.out.println("No se han introducido números");
        } else {
            if (flagDecreciente && !flagCreciente) System.out.println("Es decreciente");
            if (flagCreciente && !flagDecreciente) System.out.println("Es creciente");
            if (flagCreciente && flagDecreciente) System.out.println("No es creciente ni decreciente");
        }
    }
}
