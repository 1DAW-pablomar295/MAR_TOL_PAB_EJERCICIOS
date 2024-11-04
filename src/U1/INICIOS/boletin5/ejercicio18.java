package boletin5;

public class ejercicio18 {
        public static void main(String[] args) {
            System.out.println("Suma de los números pares:");
            int suma = 0;
            int mult = 1;
            for (int i = 0; i <= 20; i+=2) {
                    suma = suma + i;
            }

            System.out.println(suma);


            System.out.println("Multiplicación de los números impares:");
            for (int i = 1; i <= 20; i+=2) {
                    mult = mult * i;

            }

            System.out.println(mult);
        }

        }




