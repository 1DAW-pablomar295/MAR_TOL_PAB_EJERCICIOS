package U2.Boletin1.EstructuraSelectivas;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Qué edad tienes?");
        System.out.println("Menores de 4 años son gratis");
        System.out.println("Entre 4 y 18 años cuesta 5 euros");
        System.out.println("Mayores de 18 años cuestan 10 euros");
        int num = sc.nextInt();
        precio_Entrada(num);
    }

    public static void precio_Entrada(int num){
        if(num<4){
            System.out.println("Es gratis");
        }else if(num>=4 && num<=18){
            System.out.println("La entrada cuesta 5 euros");
        }else{
            System.out.println("La entrada cuesta 10 euros");
        }
    }
}
