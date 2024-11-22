package U2.Clase_String;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la cadena: ");
        String cad1= sc.nextLine();
        System.out.println("Introduce la cadena: ");
        String cad2= sc.nextLine();
int cd1=cad1.length();
int cd2=cad2.length();
        if(cd1>cd2){
            System.out.println("La cadena 1 es más larga que la cadena 2");
        }else if(cd1<cd2){
            System.out.println("La cadena 2 es más larga que la cadena 1");
        }else{
            System.out.println("Las cadenas son iguales");
        }
    }
}
