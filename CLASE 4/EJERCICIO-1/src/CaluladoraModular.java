
import java.util.Scanner;

public class CaluladoraModular {
    
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        mostrarMenu(input);

        input.close();
    }

    private static void mostrarMenu(Scanner sc) {
        System.out.println(". : Bienvenidos a la calculadora modular : .");
        System.out.println("===============================================");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Modulo 
                0. Salir
                 """);
        var opcion = leerEntero(sc, "Ingrese su opcion: ");
        switch (opcion) {
            case 1 -> suma(sc);
            case 2 -> Resta();
            case 3 -> Multiplicacion();
            case 4 -> Division();
            case 5 -> Modulo();
            case 0 -> System.out.println("Saliendo de la aplicacion.");
            default -> System.out.println("Opcion invalida");
        } 
    }

    private static int  leerEntero(Scanner input, String mensaje) {
        System.out.println(mensaje);
        var entrada = input.nextInt();
        input.nextLine();

        return entrada;
    }

    private static void suma(Scanner input) {
        System.out.println("\n. .: Suma :. ");
 
        var num1 = leerEntero(input, "Ingrese el operador 1: " );    
        var num2 = leerEntero(input, "Ingrese el operador 2: ");

        var resultado = num1 + num2;
        System.out.printf("La suma es: %,d%n", resultado);
        System.out.println("Presione ENTER para continuar");
        input.nextLine();
 
    }
     private static void Resta() {
        
    }
     private static void Multiplicacion() {
        
    }
     private static void Division() {
        
    }
     private static void Modulo() {
        
    }
}
