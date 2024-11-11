package U2.Boletin1;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos números");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        if (n < n2) {
            medias(n, n2);
        } else {
            medias2(n, n2);
        }
    }

    public static void medias(int n, int n2) {
        for (int i = (n+1); i < n2; i++) {
            n++;
            System.out.println(n);


        }
    }

    public static void medias2(int n, int n2) {
        for (int i = (n2+1); i < n; i++) {
            n2++;
            System.out.println(n2);


        }
    }
}
