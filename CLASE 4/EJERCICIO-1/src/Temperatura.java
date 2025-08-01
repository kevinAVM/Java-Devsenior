import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args ) {
        var scanner = new Scanner (System.in);

        System.out.print("Por favor ingresa la temperatur en grados celcius: ");
        var celcius = scanner.nextDouble();

        var fahrenheit = celcius * 9 / 5 + 32;
        var kelvin = celcius + 273.15 ;

        System.out.printf("%.2f grados Celcius son %.2f grados Fahrenheit%n", 
        celcius, fahrenheit);
        System.out.printf("%.2f grados Celcius son %.2f grados kelvin%n",
         celcius, kelvin);

         scanner.close();
    }

}