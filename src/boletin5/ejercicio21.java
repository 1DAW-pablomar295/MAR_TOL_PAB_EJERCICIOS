package boletin5;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int media= 0;
    int cont = 0;
    int a=0;
        while(cont >= 0) {
        System.out.println("Dime un número");
        cont = sc.nextInt();

        if (cont >= 0) {
            ++a;
            media = (media + cont) / a;
        } else {
            System.out.println("La media de los números es " + media);
        }
    }
}
}

