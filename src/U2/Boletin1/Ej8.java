package U2.Boletin1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int contador = 0;
        for (int i = 2; i < num; i++) {
            if (EsPrimo(i) && num % i == 0) {
                contador++;
            }
        }
        System.out.println("El número de divisores primos de " + num + " son: " + contador);
    }

    public static boolean EsPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

