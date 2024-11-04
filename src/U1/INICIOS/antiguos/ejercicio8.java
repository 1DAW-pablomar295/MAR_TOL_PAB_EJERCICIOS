package antiguos;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Está lloviendo?");
        String scanlluvia = sc.nextLine();
        boolean lluvia = scanlluvia.equalsIgnoreCase("Si");

        System.out.println("¿Has terminado tus tareas?");
        String scantareas = sc.nextLine();
        boolean tareas = scanlluvia.equalsIgnoreCase("Si");

        System.out.println("¿Tienes que ir a la biblioteca?");
        String scanbiblioteca = sc.nextLine();
        boolean biblioteca = scanlluvia.equalsIgnoreCase("Si");

        boolean condicion = (tareas && !lluvia) || biblioteca;
        String resultado = (condicion ?"Puedes salir a la calle " : "No puedes salir a la calle");
        System.out.println(resultado);
    }

}
