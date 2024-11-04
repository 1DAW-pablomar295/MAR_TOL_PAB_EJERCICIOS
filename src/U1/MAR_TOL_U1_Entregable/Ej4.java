package U1.MAR_TOL_U1_Entregable;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué cargo eres?");
        System.out.println("1.Programador junior");
        System.out.println("2.Programador senior");
        System.out.println("3.Jefe de proyecto");
        int cargo= sc.nextInt();

        System.out.println("¿Días de viaje este mes?");
        int viajes=sc.nextInt();

        System.out.println("¿Estado civil?");
        System.out.println("1.Soltero");
        System.out.println("2.Casado");
        int estado=sc.nextInt();

        int sueldo_bruto = 0;
        int sueldo_base = 0;
        int dietas = 0;
        double IRPF = 0;
        double sueldo_neto = 0;

        if(cargo == 1){
            sueldo_base=950;
            dietas=viajes*30;
            sueldo_bruto=sueldo_base+dietas;
            if(estado == 1){
                IRPF = sueldo_bruto * 0.25;
            }else{
                IRPF = sueldo_bruto * 0.2;
            }
            sueldo_neto=sueldo_bruto-IRPF;

            System.out.println("Sueldo base: " +sueldo_base);
            System.out.println("Dietas: " +dietas);
            System.out.println("Sueldo bruto: " +sueldo_bruto);
            System.out.println("Retención IRPF: " +IRPF);
            System.out.println("Sueldo neto: " +sueldo_neto);

        }

        if(cargo == 2){
            sueldo_base=1200;
            dietas=viajes*30;
            sueldo_bruto=sueldo_base+dietas;
            if(estado == 1){
                IRPF = sueldo_bruto * 0.25;
            }else{
                IRPF = sueldo_bruto * 0.2;
            }
            sueldo_neto=sueldo_bruto-IRPF;

            System.out.println("Sueldo base: " +sueldo_base);
            System.out.println("Dietas: " +dietas);
            System.out.println("Sueldo bruto: " +sueldo_bruto);
            System.out.println("Retención IRPF: " +IRPF);
            System.out.println("Sueldo neto: " +sueldo_neto);

        }
        if(cargo == 3){
            sueldo_base=1600;
            dietas=viajes*30;
            sueldo_bruto=sueldo_base+dietas;
            if(estado == 1){
                IRPF = sueldo_bruto * 0.25;
            }else{
                IRPF = sueldo_bruto * 0.2;
            }
            sueldo_neto=sueldo_bruto-IRPF;

            System.out.println("Sueldo base: " +sueldo_base);
            System.out.println("Dietas: " +dietas);
            System.out.println("Sueldo bruto: " +sueldo_bruto);
            System.out.println("Retención IRPF: " +IRPF);
            System.out.println("Sueldo neto: " +sueldo_neto);

        }
    }
}
