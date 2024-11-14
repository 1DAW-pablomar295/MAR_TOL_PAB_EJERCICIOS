package U2.Boletin1.EstructuraSelectivas;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota examen escrito");
        int examen = sc.nextInt();
        System.out.println("Nota lecciones");
        int lecciones = sc.nextInt();
        System.out.println("Nota tareas");
        int tareas = sc.nextInt();
        System.out.println("Nota prácticas laboratorio");
        int laboratorio = sc.nextInt();

        System.out.println("La nota final es " + nota_final(examen,lecciones,tareas,laboratorio));

    }
    public static double nota_final(int examen, int lecciones, int tareas, int laboratorio){
        double notafinal = (examen / 10) * 0.6 + lecciones * 0.2 + tareas * 0.15 + laboratorio * 0.05;
        return notafinal;
    }
}
