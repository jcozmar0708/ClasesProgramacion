package bucles.relacion2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /*Implementa un programa que lea números enteros entre el 1 y el 100 hasta que se
introduzca el número 0, que indica el final. No se deben aceptar números que no
sean esos. Al finalizar, se mostrará el valor más grande que haya sido introducido.*/

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int numMayor = 0;
        boolean flag = true;

        do {
            try {
                num = sc.nextInt();

                if (num != 0) {
                    if (num < 1 || num > 100) {
                        System.out.println("Por favor, introduce un número entre 1 y 100");
                    } else {
                        if (flag) {
                            numMayor = num;
                            flag = false;
                        } else {
                            if (num > numMayor) numMayor = num;
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("Por favor, introduce un valor válido");
            } finally {
                sc.nextLine();
            }
        } while (num != 0);

        System.out.println("El mayor número introducido es: " + numMayor);
    }
}
