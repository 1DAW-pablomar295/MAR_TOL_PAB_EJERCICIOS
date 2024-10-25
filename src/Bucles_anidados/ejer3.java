package Bucles_anidados;

public class ejer3 {
    public static void main(String[] args) {
        for(int i=0; i < 11; i++){
            System.out.print("La tabla del " +i+ ": ");
            for(int j=0; j<11; j++){
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }

    }
}
