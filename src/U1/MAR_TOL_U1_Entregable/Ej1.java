package U1.MAR_TOL_U1_Entregable;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos números");
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        long ultnum1;
        long ultnum2;
        long pares = 0;
        long impares = 0;
        long multpares = 1;
        long multimp = 1;

        while (num1 > 0) {
            ultnum1 = num1 % 10;
            ultnum2 = num2 % 10;
            if (ultnum1 % 2 == 0) {
                pares += ultnum1 * multpares;
                multpares *= 10;

            } else {
                impares += ultnum1 * multimp;
                multimp *= 10;


            }
            if (ultnum2 % 2 == 0) {
                pares += ultnum2 * multpares;
                multpares *= 10;

            } else {
                impares += ultnum2 * multimp;
                multimp *= 10;


            }
            num1 /= 10;
            num2 /= 10;

        }
        System.out.println("El número formado por los dígitos pares es " + pares);
        System.out.println("El número formado por los dígitos impares es " + impares);
    }
}