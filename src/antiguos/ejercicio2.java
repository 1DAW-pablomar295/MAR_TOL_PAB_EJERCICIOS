package antiguos;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int anyo1;
        int anyo2;
        int anyo3;
        System.out.println("¿En qué año naciste?");
        Scanner sn = new Scanner(System.in);
        anyo1 = sn.nextInt();

        System.out.println("¿En qué año estamos?");
        Scanner sp = new Scanner(System.in);
        anyo2 = sp.nextInt();

        anyo3 = anyo2 - anyo1;
        System.out.println("Tu edad es " + anyo3
        );

    }
}