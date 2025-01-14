package bucles.relacion2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println(pedirDinero());
    }

    private static String pedirDinero() {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            num = sc.nextInt();

        } while (!comprobarValor(String.valueOf(num)));

        return "El valor introducido es: " + num;
    }

    private static boolean comprobarValor(String num) {
        boolean esValido;

        switch (num) {
            case "500", "200", "100", "50", "20", "10", "5", "2", "1", "0.5", "0.2", "0.1", "0.05":
                esValido = true;
                break;
            default:
                esValido = false;
        }

        return esValido;
    }
}
