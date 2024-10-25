package boletin5;

public class ejercicio18b {
    public static void main(String[] args) {
        int suma = 0;
        int mult = 1;

        for (int i = 0; i <= 20; i++) {
           if((i % 2) == 0) {
            suma = suma + i;
        }else {
               mult = mult * i;
           }
    }
        System.out.println(mult);
        System.out.println(suma);
}
}
