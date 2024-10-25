package antiguos;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int edad1;
        System.out.println("Edad");
        Scanner scanedad = new Scanner(System.in);
        edad1 = scanedad.nextInt();

        if (edad1>17) {
            System.out.println("ES MAYOR DE EDAD");
        }else{
            System.out.println("ES MENOR DE EDAD");
        }

    }

}
