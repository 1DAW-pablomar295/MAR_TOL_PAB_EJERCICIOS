package U2.Boletin1;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la altura");
        int h= sc.nextInt();
        System.out.println("Introduce el radio");
        int rad= sc.nextInt();


        System.out.println("¿Qué quieres calcular?");
        System.out.println("1.Área");
        System.out.println("2.Volumen");
        int opc= sc.nextInt();
        switch(opc) {
            case 1:
                area( h,  rad);
                break;

            case 2:
                volumen(h, rad);
                break;
        }

    }
    public static void area(int h,int rad){
        double area= 2*Math.PI*rad*(h+rad);
        System.out.println("El área es " +area);


    }
public static void volumen(int h, int rad){
        double volumen= Math.PI*rad*rad*h;
    System.out.println("El volumen es "+volumen);

}

}
