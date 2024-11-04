package Bucles_anidados;

public class ejer1 {
    public static void main(String[] args) {
        int n = 5;
       // int m = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print("X ");
                }else {
                    System.out.print("- ");
                }
                }
            System.out.println();
            //m++;
            }
        }
    }
