package antiguos;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int num1;
        System.out.println("Di un número");
        Scanner number = new Scanner(System.in);
        num1 = number.nextInt();
        boolean numeroPAr = num1%2==0;

        System.out.println("¿El número es Par? " + numeroPAr);
        }
    }
