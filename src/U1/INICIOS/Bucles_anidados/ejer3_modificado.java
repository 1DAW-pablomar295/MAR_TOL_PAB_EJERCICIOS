package Bucles_anidados;

import java.util.Scanner;

public class ejer3_modificado {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int num1, num2;
        System.out.println("Dime un número inicial");
        num1 = sn.nextInt();
        System.out.println("Dime un número final");
        num2 = sn.nextInt();

        for(int i=num1; i < (num2+1); i++){
            System.out.print("La tabla del " +i+ ": ");
            for(int j=0; j<11; j++){
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }

    }
}
