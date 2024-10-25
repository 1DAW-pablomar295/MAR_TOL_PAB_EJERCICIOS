package bucles2;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        int dia;
        int meses;
        int total;
        System.out.println("Que día del mes es");
        Scanner sn = new Scanner(System.in);
        dia = sn.nextInt();
        System.out.println("Que mes es en número");
        Scanner sp = new Scanner(System.in);
        meses = sp.nextInt();

total= dia + meses * 30;

        System.out.println("Son " +total+ " días." );
    }
}



