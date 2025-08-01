import java.util.Scanner;

public class CalculadoraIMC{

    public static void main(String[] args){
        var input = new Scanner(System.in);

        System.out.print("Por favor. ingrese el peso en kilogramos: ");
        var peso = input.nextDouble();

        System.out.print("Porfavor, ingrese la altura en centimetros: ");
        var altura = input.nextInt();

        altura/=  100.0;

        var imc = peso / (altura * altura);

        System.err.printf("El indice de masa corporal es de: %.1f%n", imc );

        
        input.close();
    }
}