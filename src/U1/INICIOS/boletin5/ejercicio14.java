package boletin5;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        int num1;
        int num=-1;
        System.out.println("di un número");
        Scanner sn = new Scanner(System.in);
        num1 = sn.nextInt();
        while (num<num1) {
            num++;
            System.out.println(num);

        }

    }
}