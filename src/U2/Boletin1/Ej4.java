package U2.Boletin1;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime dos números");
        int n = sc.nextInt();
        int n2 = sc.nextInt();

        comp(n, n2);
    }
    public static void comp(int n, int n2){
        if(n<n2){
            System.out.println("El número mayor es " +n2);
        }else if(n==n2){
            System.out.println("Ambos números son iguales");

        }else{
            System.out.println("El número mayor es " +n);

        }

    }
}
