package bucles;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int conNega = 0;
        int conPos = 0;
        int conCer = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe un número:");
            int num = sc.nextInt();

            if (num < 0) {
                conNega++;
            } else if (num > 0) {
                conPos++;
            } else {
                conCer++;
            }
        }

        System.out.println("Numeros negativos: " + conNega);
        System.out.println("Numeros igual que 0: " + conCer);
        System.out.println("Numeros positivos: " + conPos);
    }
}
