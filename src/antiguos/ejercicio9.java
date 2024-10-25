package antiguos;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        float kgperas;
        float kgmanzanas;
        float precioperas;
        float preciomanzanas;
        float total;
        System.out.println("¿Cúantos kg de peras has vendido?");
        Scanner sn = new Scanner(System.in);
        kgperas = sn.nextInt();

        System.out.println("¿Cúantos kg de manzanas has vendido?");
        Scanner sp = new Scanner(System.in);
        kgmanzanas = sp.nextInt();

        precioperas = (float) 1.95;
        preciomanzanas = (float) 2.25;
        total = kgperas * precioperas + kgmanzanas * preciomanzanas;
        System.out.println("El precio total es " + total);

    }
}
