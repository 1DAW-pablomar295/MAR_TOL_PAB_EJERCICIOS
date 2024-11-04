package PracticaEntregable1;

import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        System.out.println("Dime un número entero positivo");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int mult=1;
        int result=0;
        int cont=0;
        int ultnum;
        while(num>0){
            ultnum=num%10;
            if(ultnum!=0 && ultnum!=8){
                result+=ultnum*mult;
                mult*=10;

            }else{
                cont++;
            }
            num/=10;

        }
        System.out.println(result);
        System.out.println("Números eliminados " +cont);
    }
}
