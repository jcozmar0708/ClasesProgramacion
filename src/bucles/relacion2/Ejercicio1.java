package bucles.relacion2;

public class Ejercicio1 {
    public static void main(String[] args) {
        int contador = 0;
        int num = 3;

        while (contador < 10) {
            if (num % 3 == 0) {
                System.out.println(num);
                contador++;
            }

            num++;
        }
    }
}
