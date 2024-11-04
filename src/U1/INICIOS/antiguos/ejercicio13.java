package antiguos;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;

        System.out.println("Dime tres números");
        Scanner sn = new Scanner(System.in);
        num1 = sn.nextFloat();
        Scanner sp = new Scanner(System.in);
        num2 = sp.nextFloat();
        Scanner sj = new Scanner(System.in);
        num3 = sj.nextFloat();
           if (num1 >= num2 && num1 >= num3) {
               if (num2 >= num3) {
                   System.out.println("Mayor a menor: " + num1 + " " + num2 + " " + num3);
               } else {
                   System.out.println("Mayor a menor: " + num1 + " " + num3 + " " + num2);
               }
           } else if (num2 >= num1 && num2 >= num3) {
               if (num1 >= num3) {
                   System.out.println("Mayor a menor: " + num2 + " " + num1 + " " + num3);
               } else {
                   System.out.println("Mayor a menor: " + num2 + " " + num3 + " " + num1);
               }
           } else {
               if (num1 >= num2) {
                   System.out.println("Mayor a menor: " + num3 + " " + num1 + " " + num2);
               } else {
                   System.out.println("Mayor a menor: " + num3 + " " + num2 + " " + num1);
               }
           }




    }
}
