package U1.Entregable3;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un numero entero positivo");
        int num1 = sc.nextInt();
        System.out.println("Di un número entre el 0 y el 9");
        int num2 = sc.nextInt();
        int cont = 0;
        while(num1>0){
            int num3=num1%10;
            if (num3== num2){
                cont++;
            }
            num1/=10;
        }
        System.out.println("El número " +num2+ " aparece " +cont+ " veces");
    }
}
