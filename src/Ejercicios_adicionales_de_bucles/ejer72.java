package Ejercicios_adicionales_de_bucles;

public class ejer72 {
    public static void main(String[] args) {
        int num=7;
        int num2 = 0;
        int cont=1;


        while(num2<=100){
            num2=num * cont;
           if(num2<100) {
               System.out.println(num2);
               cont++;
           }
        }
    }
}
