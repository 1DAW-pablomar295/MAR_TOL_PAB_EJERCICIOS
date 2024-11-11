package U2.Boletin1;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Dime un número y te digo si es primo o no");
            int num = scanner.nextInt();

            while(num<2){
                System.out.println("El número debe ser mayor o igual que 2");
                num = scanner.nextInt();
            }

            primo(num);

        }

        public static void primo(int num){
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
                    System.out.println("Tu número es primo");
                } else {
                    System.out.println("Tu número no es primo");
                }

            }
        }
    }
