package U2.Clase_String;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la contraseña: ");
        String contra= sc.nextLine();
        System.out.println("Introduce la cadena: ");
        String cad2= sc.nextLine();

        int cont=contra.length();

        while(!cad2.equalsIgnoreCase(contra)){
            System.out.println("Has fallado");
            int cd2=cad2.length();
            if(cont>cd2){
                System.out.println("Tu cadena es más corta que la contraseña");
            }else if(cont<cd2){
                System.out.println("Tu cadena es más larga que la contraseña");
            }else{
                System.out.println("Ambas cadenas tienen el mismo tamaño");
            }
            System.out.println("Introduce la cadena: ");
            cad2= sc.nextLine();
        }
            System.out.println("Has acertado");

    }
}
