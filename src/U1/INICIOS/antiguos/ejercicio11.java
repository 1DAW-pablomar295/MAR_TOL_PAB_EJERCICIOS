package antiguos;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;
        float notafinal;
        float notafinal2;
        System.out.println("Nota primer trimestre");
        Scanner sn = new Scanner(System.in);
        nota1 = sn.nextFloat();

        System.out.println("Nota segundo trimestre");
        Scanner sp = new Scanner(System.in);
        nota2 = sp.nextFloat();

        System.out.println("Nota tercer trimestre");
        Scanner sj = new Scanner(System.in);
        nota3 = sj.nextFloat();

        notafinal = (nota1 + nota2 + nota3)/3 ;
        notafinal2 =    Math.round(notafinal);
        System.out.println("La nota del boletin de calificaciones es " + notafinal2 + " y en el expediente académico es " + notafinal);

    }
}
