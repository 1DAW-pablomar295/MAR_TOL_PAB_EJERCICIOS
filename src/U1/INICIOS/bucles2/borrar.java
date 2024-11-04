package bucles2;

public class borrar {
    public static void main(String[] args) {

        int n=7;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <(n*2)+1; j++) {
                if(j<n){
                    //Esta es la la parte que pinta la M
                    if(i<=(n/2)){
                        //Aquí corresponde a la parte superior de la M
                        if(i==0){
                            //Primera Fila de la parte superior de la M
                            if(j==0 || j==n-1) {
                                System.out.print("M");
                            }else{
                                System.out.print(" ");
                            }
                        }else{
                            if(i==(n-1)/2){
                                //última fila de la parte superior de la M
                                if(j==0 || j==(n-1)/2 || j==n-1){
                                    System.out.print("M");
                                }else{
                                    System.out.print(" ");
                                }
                            }else{
                                //Filas intermedias de la parte superior de la M
                                if(j==i || j==((n-1)-i)|| j==0 || j==(n-1) ){
                                    System.out.print("M");
                                }else{
                                    System.out.print(" ");
                                }
                            }
                        }
                    }else{
                        //Aquí corresponde a la parte inferior de la M
                        if( j==0 || j==n-1){
                            System.out.print("m");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }else {
                    if (j > n) {
                        //Esta es la la parte que pinta la Y
                        if(i<=(n/2)){
                            //Aquí corresponde a la parte superior de la Y
                            if(i==0){
                                //Primera fila de la parte superior de la Y
                                if(j==(n+1) || j==(n*2)){
                                    System.out.print("Y");
                                }else{
                                    System.out.print(" ");
                                }
                            }else{
                                if(i==(n-1)/2){
                                    //última fila de la parte superior de la Y
                                    if(j==(((n+1)+(2*n))/2)){
                                        System.out.print("Y");
                                    }else{
                                        System.out.print(" ");
                                    }
                                }else{
                                    //Filas intermedias de la parte superior de la Y
                                    if(j==(n+i+1) || j==((n*2)-i) ){
                                        System.out.print("Y");
                                    }else{
                                        System.out.print(" ");
                                    }
                                }
                            }
                        }else{
                            //Aquí corresponde a la parte inferior de la Y
                            if(j==(((n+1)+(2*n))/2)){
                                System.out.print("y");
                            }else{
                                System.out.print(" ");
                            }
                        }

                    } else {
                        //Esta es la la parte que pinta la línea vertical del medio
                        System.out.print("    ");
                    }
                }
            }
            System.out.println("");
        }
    }

}
