package PracticaEntregable1;

import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca horas");
        int horas = sc.nextInt();
        System.out.println("Introduzca minutos");
        int min = sc.nextInt();
        System.out.println("Introduzca segundos");
        int segundos = sc.nextInt();
        System.out.println("Introduzca segundos a incrementar");
        int incr = sc.nextInt();

        for (int i = 1; i <= incr; i++) {
            if (segundos <= 60) {
                if (segundos <= 9) {
                    System.out.println(horas + ":" + min + ":0" + segundos);
                    segundos++;
                } else {
                    System.out.println(horas + ":" + min + ":" + segundos);
                    segundos++;
                }
                if (segundos == 60) {
                    if (min == 60) {
                        horas++;
                        min -= 60;
                        System.out.println(horas + ":0" + min + ":0" + segundos);
                    } else {
                        segundos -= 60;
                        min += 1;
                        System.out.println(horas + ":" + min + ":0" + segundos);
                        segundos++;

                    }
                }


            }
        }
    }
}