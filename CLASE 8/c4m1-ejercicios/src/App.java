
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);
        var salir = false;

        do {
            System.out.println("""
                    .: Ejercicios del modulo 1 :.
                    =============================
                    1. Verificar numero negativo 
                    0. Salir

                    Elija una opcion: """);

            var opcion = input.nextInt();
            input.nextLine(); //limpiar el Buffer
            switch (opcion) {
                case 1:
                    verificarNumero01(input);   
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

            System.out.println("\n Presione ENTER para continuar");
            input.nextLine();
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }

        } while (!salir);
        System.out.println("Hasta pronto!");
        input.close();
    }

    private static void verificarNumero01(Scanner input) {
        /*
         * Escriba un programa que permita ingresar un nùmero real e identifique si el 
         * nùmero es negativo, positivo o cero
         */

        System.out.println("Ingrese el numero real a calcular: ");
        var real = input.nextDouble();
        input.nextLine(); //limpiar el Buffer

      //   if(real == 0 ){
      //      System.out.println("El numero es cero");
      //  }else if(real < 0){
      //      System.out.println("El numero es negativo");
      //  }else{
      //      System.out.println("El numero es positivo");
      //  }


      // codicion ? valor true : valor false 
      System.out.println( real == 0 ?  "El numero es cero. " : // Operador ternario 
      real < 0 ? "El numero es negativo. " : "El numero es positivo. " ); // Operador ternario 

    }
}
