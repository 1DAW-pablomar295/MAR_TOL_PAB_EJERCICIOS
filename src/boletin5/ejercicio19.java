package boletin5;
import java.util.Scanner;
public class ejercicio19 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int cont = 0;

        while(cont >= 0) {
            System.out.println("Dime un número");
            cont = sc.nextInt();

            if (cont >= 0) {

                suma = suma + cont;
            } else {
                System.out.println("La suma de los números es " + suma);
            }
        }
    }
}
