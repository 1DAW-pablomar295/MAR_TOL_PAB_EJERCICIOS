package U2.Clase_String;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase= sc.nextLine();
        int contEspacios = 0;
        for(int i=0; i<frase.length(); i++){

            if(frase.charAt(i) == ' '){
                contEspacios++;
            }
        }
        System.out.println("Hay " +contEspacios+ " espacios");
    }
}
