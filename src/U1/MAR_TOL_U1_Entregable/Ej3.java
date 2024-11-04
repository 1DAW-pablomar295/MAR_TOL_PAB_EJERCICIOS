package U1.MAR_TOL_U1_Entregable;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura del reloj de arena(debe ser impar y mayor o igual que 3)");
        int alt = sc.nextInt();
        int cont = -1;
        int con = 0;


        if (alt >= 3 && alt % 2 == 1) {

            for (int i = 0; i < (alt + 1) / 2; i++) {

                for (int j = 0; j < alt; j++) {

                    if (j <= alt) {
                        if (i == 0) {
                            System.out.print("*");
                        } else {
                            if (i == con) {
                                if (j == cont || j == (alt - con)) {
                                    System.out.print(" ");

                                } else {
                                    System.out.print("*");
                                }


                            }if(i==(alt+1)/2){
                                if(j==(alt+1)/2){
                                    System.out.println("*");
                                }else{
                                    System.out.println(" ");
                                }
                            }



                        }

                    }

                }
                System.out.println();
                cont++;
                con++;
            }



        } else {
            System.out.println("ERROR: EL NÚMERO DEBE SER IMPAR Y MAYOR O IGUAL QUE 3");
        }
    }
}
