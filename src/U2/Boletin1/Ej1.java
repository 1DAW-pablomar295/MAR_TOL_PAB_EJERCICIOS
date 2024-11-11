package U2.Boletin1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número");
        int n= sc.nextInt();
        eco(n);
    }
    public static void eco(int n) {
        for(int i=0; i<n; i++){
            System.out.println("Eco");
        }
    }
}


