package antiguos;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        double rad;
        double longitud;
        double area;

        System.out.println("¿Cúal es el radio de la circunferencia?");
        Scanner sn = new Scanner(System.in);
        rad = sn.nextInt();
        longitud = 2*(Math.PI)*rad;
        area = (Math.PI)*rad*rad;
        System.out.println("La longitud es " + longitud);
        System.out.println("El area es " + area);
    }
}
