package bucles.relacion2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumaDinero = 0;

        while (sumaDinero < 100) {
            int metido = sc.nextInt();
            sumaDinero += metido;
        }

        int devolver = sumaDinero - 100;

        System.out.println("Se le tiene que devolver " + devolver + " euros");
    }
}
