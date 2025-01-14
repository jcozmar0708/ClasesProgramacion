package bucles.relacion2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int contPares = 0;

        do {
            num = sc.nextInt();
            if (num >= 0) {
                if (num % 2 == 0) contPares++;
            }
        } while (num >= 0);

        System.out.println("Se han introducido " + contPares + " número pares");
    }
}
