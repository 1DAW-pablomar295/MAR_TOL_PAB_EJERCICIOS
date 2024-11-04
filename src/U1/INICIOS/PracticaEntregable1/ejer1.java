package PracticaEntregable1;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la altura(mayor o igual que 4)");
        int num = sc.nextInt();
        if(num>=4) {
            for (int i = num; i > 0; i--) {
                if (i > 2) {
                    System.out.println("***   ***");
                }
                if (i == 1 || i == 2) {
                    System.out.println("****** *****");
                }

            }
        }else{
            System.out.println("La altura debe ser mayor que 4");
        }
    }
}