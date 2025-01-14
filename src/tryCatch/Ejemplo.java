package tryCatch;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        try {
            prueba();
        } catch (Exception e) {
            System.out.println("Estamos en el main, y el valor no es valido");
        } finally {
            System.out.println("Hola");
        }
    }

    private static void prueba() throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            int num = sc.nextInt();

        } catch (Exception pepe) {
            throw new Exception("Valor no valido");
        } finally {
            sc.close();
        }
    }
}
