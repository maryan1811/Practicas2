
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        int n, cont = 0;
        System.out.print("Tamaño vector: ");
        n = leer.nextInt();

        int[] arreglo;
        arreglo = new int[n];
        int sumaTotal = 0, sumaImpares = 0;
        
        while(cont < arreglo.length){

            System.out.print("Ingresar dato en la posición " + cont + ": ");
            arreglo[cont] = leer.nextInt();
            cont++;
        }

        for (int i = 0; i < arreglo.length; i++) {
            sumaTotal += arreglo[i];
        }

        for (int j = 1; j < arreglo.length; j += 2) {
            sumaImpares += arreglo[j];
        }

        double promedioTotal = sumaTotal/arreglo.length;
        double promedioImpar = sumaImpares/arreglo.length;

        System.out.println("Sumatoria: " + sumaTotal +
         "\n Promedio Total = " + promedioTotal +
         "\n Promedio de numeros en posicion impar: " + promedioImpar);
    }
}
