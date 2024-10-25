package Ejercicios_adicionales_de_bucles;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejer76 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int n = sc.nextInt();
        int i;
        int j;
        for (i = n; i > 0;i--){

            for ( j = (i); j > 0;j--){
                System.out.print("*");

            }
            System.out.println();

        }


    }
}
