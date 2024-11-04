package U1.MAR_TOL_U1_Entregable;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        long num = sc.nextLong();
        long ultnum1;
        long pares = 0;
        long impares = 0;
        long sumapares = 0;
        long sumaimp = 0;
        long multpares = 1;
        long multimp = 1;

        while (num > 0) {
            ultnum1 = num % 10;

            if (ultnum1 % 2 == 0) {
                pares += ultnum1 * multpares;
                multpares *= 10;
                sumapares+=ultnum1;

            } else {
                impares += ultnum1 * multimp;
                multimp *= 10;
                sumaimp+=ultnum1;

            }
            num/= 10;

        }
        System.out.println("Dígitos pares: " + pares);
        System.out.println("Dígitos impares: " + impares);
        System.out.println("Suma de los dígitos pares: " +sumapares);
        System.out.println("Suma de los dígitos impares:" +sumaimp);
    }
}