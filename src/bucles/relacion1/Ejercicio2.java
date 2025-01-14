package bucles.relacion1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numPer;
        int suma = 0;

        do {
            System.out.print("Personas del grupo (0==FIN): ");
            numPer = sc.nextInt();

            suma += numPer;

            if (numPer != 0) System.out.println("Apuntados. Van " + suma);

        } while (numPer != 0);

        int cantAut = suma / 55;

        if (suma % 55 != 0) cantAut++;

        System.out.println("Son necesarios " + cantAut + " autobuses");
    }
}
