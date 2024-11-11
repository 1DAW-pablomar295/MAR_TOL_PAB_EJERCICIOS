package U2.Boletin1;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime 3 números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        comp(num1, num2, num3);
    }
    public static void comp(int num1, int num2, int num3){
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("El número mayor es " +num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El número mayor es " +num2);
        } else {
            System.out.println("El número mayor es " +num3);
        }

    }
}
