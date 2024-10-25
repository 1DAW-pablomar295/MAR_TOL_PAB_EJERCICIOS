package antiguos;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        float num1;
        float num2;

        System.out.println("Escribe un número");
        Scanner sn = new Scanner(System.in);
        num1 = sn.nextFloat();
        num2= Math.abs(num1);

        System.out.println("Su valor absoluto es " + num2);

    }
}
