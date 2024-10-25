package Ejercicios_adicionales_de_bucles;

public class ejer73 {
    public static void main (String [] args){
        int result=1;

        for(int i=1; i<=20; i++){
            if(i%2!=0){
                result= result * i;

            }

        }
        System.out.println("El resultado es " +result);
    }
}
