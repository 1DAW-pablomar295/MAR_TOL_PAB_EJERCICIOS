package antiguos;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int nota1;
        int nota2;
        int nota3;
        System.out.println("Primera nota");
        Scanner sn = new Scanner(System.in);
       nota1 = sn.nextInt();

        System.out.println("Segunda nota");
        Scanner sp = new Scanner(System.in);
        nota2 = sp.nextInt();

        nota3 = (nota1 + nota2) / 2;
        System.out.println("La nota media es " + nota3);

    }
}
