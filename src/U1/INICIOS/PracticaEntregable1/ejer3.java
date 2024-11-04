package PracticaEntregable1;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args) {
        System.out.println("Introduzca sus 3 números favoritos");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("Introduzca su número de la lotería");
        int num=sc.nextInt();

        int cont=0;
        int ultnum;


        while(num>0){
            ultnum=num%10;
            if(ultnum == num1 || ultnum == num2 || ultnum == num3){
                cont++;
            }
            num/=10;
        }
        if(cont>=3) {
            System.out.println("El número le va a dar suerte");
        }else{
            System.out.println("El número no le va a dar suerte");
        }
    }
}
