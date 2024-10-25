package antiguos;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int num;
     System.out.println("Escribe un número");

     Scanner sn=new Scanner(System.in);
     num=sn.nextInt();
        System.out.println("El número es " + num);
    }
}