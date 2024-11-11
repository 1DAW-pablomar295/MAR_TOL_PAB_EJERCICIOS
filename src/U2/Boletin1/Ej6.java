package U2.Boletin1;

import java.util.Scanner;

public class Ej6 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce una letra y te diré si es vocal o no");
            String letra = scanner.next();

            vocal(letra);

        }
        public static void vocal(String letra){
            boolean vocal = false;


            if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
                vocal = true;
            }
            if(vocal){
                System.out.println("La letra es vocal");
            }else{
                System.out.println("La letra no es vocal");
            }

        }

    }

