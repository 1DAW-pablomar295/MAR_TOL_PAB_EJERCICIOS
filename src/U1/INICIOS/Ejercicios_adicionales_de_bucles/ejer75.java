package Ejercicios_adicionales_de_bucles;

import java.util.Scanner;

public class ejer75 {
    public static void main (String[]args){
        int n;
        boolean suspenso=false;
        System.out.println("Dime la nota del alumno");
        Scanner sc=new Scanner(System.in);
        for (int i=1; i<6;i++){
            n=sc.nextInt();
            if (n<5){
                suspenso=true;
            }
        }
        if (suspenso){
            System.out.println("Has suspendido");
        }else {
            System.out.println("Has aprobado");
        }
    }
}

