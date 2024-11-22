package U2.Boletin1;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        System.out.println("Actividad 6: Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.");
        if (esVocal(preguntarChar())) {
            System.out.println("el caracter es vocal.");
        } else {
            System.out.println("el caracter no es vocal.");
        }

    }

    public static char preguntarChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba un caracter");
        return sc.next().charAt(0);
    }


    public static boolean esVocal(char c1) {
        c1 = Character.toLowerCase(c1);
        return (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u');
    }
}

