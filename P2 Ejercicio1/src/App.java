
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int opcion=0, correcto=0, incorrecto=0, select = 1;
        double n1, n2;
        double res = 0;
        double posibleRes;

        while(select !=0){

            System.out.println("Elija la operación que va a realizar \n 1.Suma 2. Resta 3.Multiplicación 4. División 5.Finalizar");
            opcion = leer.nextInt();
        
            switch (opcion){
                case 1:

                    System.out.println("Ingresar el primer numero: "); 
                    n1 = leer.nextDouble();
                    System.out.println("Ingresar el segundo numero: ");
                    n2 = leer.nextDouble();
                    System.out.println("Ingresar el posible resultado: ");
                    posibleRes = leer.nextDouble();

                    res = n1 + n2;
                    if(res == posibleRes){
                    System.out.println("La respuestas coinciden" + "\n Respuesta de usuario: " + posibleRes + "\n Respuesta del pc: " + res);
                    correcto++;
                    }else{
                        System.out.println("La respuestas no coinciden" + "\n Respuesta de usuario: " + posibleRes + "\n Respuesta del pc: " + res);
                        incorrecto++;
                    }
                    select = 1;
                    break;

                    case 2:
                    
                    System.out.println("Ingresar el primer numero: "); 
                    n1 = leer.nextDouble();
                    System.out.println("Ingresar el segundo numero: ");
                    n2 = leer.nextDouble();
                    System.out.println("Ingresar el posible resultado: ");
                    posibleRes = leer.nextDouble();

                    res = n1 - n2;
                    
                    if(res == posibleRes){
                        System.out.println("La respuestas coinciden" + "\n Respuesta de usuario: " + posibleRes + "\n Respuesta del pc: " + res);
                        correcto++;
                    }else{
                        System.out.println("La respuestas no coinciden" + "\n Respuesta de usuario: " + posibleRes + "\n Respuesta del pc: " + res);
                        incorrecto++;
                    }
                    select = 1;
                    break;

                    case 3:

                    System.out.println("Ingresar el primer numero: "); 
                    n1 = leer.nextDouble();
                    System.out.println("Ingresar el segundo numero: ");
                    n2 = leer.nextDouble();
                    System.out.println("Ingresar el posible resultado: ");
                    posibleRes = leer.nextDouble();

                    res = n1 * n2;
                    if(res == posibleRes){
                        System.out.println("La respuestas coinciden" + "\n Respuesta de usuario: " + posibleRes + "\n Respuesta del pc: " + res);
                        correcto++;
                    }else{
                        System.out.println("La respuestas no coinciden" + "\n Respuesta de usuario: " + posibleRes + "\n Respuesta del pc: " + res);
                        incorrecto++;
                    }
                    select = 1;
                    break;

                    case 4:

                    System.out.println("Ingresar el primer numero: "); 
                    n1 = leer.nextDouble();
                    System.out.println("Ingresar el segundo numero: ");
                    n2 = leer.nextDouble();
                    System.out.println("Ingresar el posible resultado: ");
                    posibleRes = leer.nextDouble();

                    res = n1 / n2;
                    if(res == posibleRes){
                        System.out.println("La respuestas coinciden" + "\n Respuesta de usuario: " + posibleRes + "\n Respuesta del pc: " + res);
                        correcto++;
                    }else{
                        System.out.println("La respuestas no coinciden" + "\n Respuesta de usuario: " + posibleRes + "\n Respuesta del pc: " + res);
                        incorrecto++;
                    }

                    select = 1;
                    break;

                    case 5:
                        System.out.println("El total de respuestas correctas fueron: "+ correcto + "\n El total de respuestas incorrectas fueron: "+incorrecto);
                        select = 0;
                    break;
        }
        }

    }
}

