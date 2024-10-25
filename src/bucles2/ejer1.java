package bucles2;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        int segundos;
        int minutos;
        int horas;
        System.out.println("Di un número de segundos");
        Scanner sn = new Scanner(System.in);
        segundos = sn.nextInt();
        minutos = segundos / 60;
        horas = segundos / 3600;

        System.out.println("Son " +minutos+ " minutos." );
        System.out.println("Son " +horas+ " horas." );
    }
}
