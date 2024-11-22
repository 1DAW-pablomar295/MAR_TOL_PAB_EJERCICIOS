package U2.Clase_String;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase= sc.nextLine();
        String frase2="";

        for(int i=(frase.length()-1); i>=0;i--){
            frase2+=frase.charAt(i);



        }
        System.out.println(frase2);
    }
}
