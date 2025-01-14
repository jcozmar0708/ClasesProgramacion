package bucles.relacion1;

import java.util.Scanner;

public class PedirNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("Escribe un número: ");
            num = sc.nextInt();
            sc.nextLine();

            if (num > 0) {
                for (int i = 0; i < num; i++) {
                    System.out.print('1');
                }
                System.out.println();
            }
        } while (num > 0);
    }
}
