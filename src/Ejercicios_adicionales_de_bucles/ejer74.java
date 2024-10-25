package Ejercicios_adicionales_de_bucles;

import java.util.Scanner;

public class ejer74 {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un número");
        int num = sc.nextInt();
        int result = 1;
        for(int cont=1;  cont<=num; cont++){
            result= result * cont ;

        }
        System.out.println("El factorial de " +num+ " es " +result);





    }

}
