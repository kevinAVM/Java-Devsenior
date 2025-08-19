import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);

        int opcion;
        do {
            opcion = mostrarMenu(input);

            switch (opcion) {
                case 1:
                    System.out.println("Registrando datos...");
                    break;
                case 2:
                    System.out.println("Mostrando datos del estudiante...");
                    break;
                case 3:
                    System.out.println("Calculando promedio...");
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 0);

        input.close();
    }

    private static int mostrarMenu(Scanner sc) {
        System.out.println("\n--- Sistema de Registro de Estudiantes ---");
        System.out.println("1. Registrar datos de un estudiante");
        System.out.println("2. Mostrar datos del estudiante actual");
        System.out.println("3. Calcular promedio de notas del estudiante");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");

        return sc.nextInt(); // Aquí leemos la opción
    }
}
