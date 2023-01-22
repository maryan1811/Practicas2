


import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        int matrizEjercicio[][];
        int sumaDiagonalPrincipal = 0;
        matrizEjercicio = new int[4][4]; 

        for(int i = 0; i<matrizEjercicio.length; i++){
            for(int j = 0; j<matrizEjercicio[i].length; j++){

                System.out.print("Introduzca el dato correspondiente a las cordenadas [" + i + "," + j + "]: ");
                matrizEjercicio[i][j] = leer.nextInt();
            }
        }

        int a=0, b=0;
        while(a < matrizEjercicio.length && b < matrizEjercicio[0].length){

            sumaDiagonalPrincipal += matrizEjercicio[b][a];
            a++;
            b++;
        }

        for (int x = 0; x < matrizEjercicio.length; x++) {
            for (int y = 0; y < matrizEjercicio[x].length; y++) {
                System.out.println ("[" + x + "," + y + "] = " + matrizEjercicio[x][y]);
            }
        }

        System.out.println("Suma de la diagonal Principal: " + sumaDiagonalPrincipal);
    }    
}
