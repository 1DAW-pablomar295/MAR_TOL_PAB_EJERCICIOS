package U2.Boletin1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont=0;
        System.out.println("Dime un número y te digo el número de divisores primos que tiene");
        int num = scanner.nextInt();

        while(num<2){
            System.out.println("El número debe ser mayor o igual que 2");
            num = scanner.nextInt();
        }
        divisor(num,cont);

    }

    public static void divisor(int num, int cont){

        for(int i=1; i<=num; i++){
            if(num%i == 0){
                primo(num, cont);
            }


        }
        System.out.println("El número tiene " +cont+ " divisores primos");
    }
    public static void primo(int num,int cont){
        boolean primo = false;
        int i = 2;
        if (num >= 2) {
            while (i < num) {
                if (num % i == 0) {
                    primo = true;
                }
                i++;
            }
            if (!primo) {
                cont++;

            }

        }
    }


}

