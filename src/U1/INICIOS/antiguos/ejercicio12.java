package antiguos;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        float num1;
        float num2;
        System.out.println("Escribe un número decimal");
        Scanner sn = new Scanner(System.in);
        num1 = sn.nextFloat();

        num2 =    Math.round(num1);
        System.out.println("EL NÚMERO REDONDEADO ES " + num2);

    }
}
