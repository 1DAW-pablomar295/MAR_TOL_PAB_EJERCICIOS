package U2.Clase_String;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la cadena: ");
        String cad1= sc.nextLine();
        System.out.println("Introduce la cadena: ");
        String cad2= sc.nextLine();

        if(cad1.equalsIgnoreCase(cad2)){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas no son iguales");
        }
    }

}
