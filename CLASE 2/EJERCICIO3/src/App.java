
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        //eL gobierno lanza un proyecto de ayudas economicas para su poblacion dependiendo de su estrato
        //estrato 0 5.000.000
        //estrato 1: 3.500.000
        //estrato 2: 2.500.000
        //estrato 3: 1.000.000
        //estrato 4: 0
        //estrato 5: Impuesto de 2,500,000
        //estrato 6: Impuesto de 5,000,000
        // > estrato 6: error!
        // < a 0 = error!

        //Este dinero sera destinado para compra de vivienda.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite su estrato: ");  
        int estrato = entrada.nextInt();

        System.out.print("Digite el valor de la vivienda: ");
        double valorVivienda = entrada.nextDouble();

        if (estrato == 0){
            System.out.println("El valor sin descuento es: " + valorVivienda);
            double descuento = 5000000;
            System.out.println("el descuento es: " + descuento);

            double total = valorVivienda - descuento;
            System.out.println("El valor con descuento es: " + valorVivienda);
        }else if (estrato == 1){
            System.out.println("El valor sin descuento es: " + valorVivienda);
            double descuento = 3500000;
            System.out.println("el descuento es: " + descuento);

            double total = valorVivienda - descuento;
            System.out.println("El valor con descuento es: " + valorVivienda);
        }else if (estrato == 2){
            System.out.println("El valor sin descuento es: " + valorVivienda);
            double descuento = 2500000;
            System.out.println("el descuento es: " + descuento);

            double total = valorVivienda - descuento;
            System.out.println("El valor con descuento es: " + valorVivienda);
        }else if (estrato == 3){
            System.out.println("El valor sin descuento es: " + valorVivienda);
            double descuento = 1000000;
            System.out.println("el descuento es: " + descuento);

            double total = valorVivienda - descuento;
            System.out.println("El valor con descuento es: " + valorVivienda);
        }else if (estrato == 4){
            System.out.println("El valor sin descuento es: " + valorVivienda + " No tiene descuento");
        
        }else if (estrato == 5){
            System.out.println("El valor es: " + valorVivienda);
            double impuesto = 2500000;
            System.out.println("el impuesto es: " + impuesto);

            double total = valorVivienda + impuesto;
            System.out.println("El valor con impuesto es: " + valorVivienda);

        }else if (estrato == 6){
            System.out.println("El valor es: " + valorVivienda);
            double impuesto = 5000000;
            System.out.println("el impuesto es: " + impuesto);

            double total = valorVivienda + impuesto;
            System.out.println("El valor con impuesto es: " + valorVivienda);
    }else{
        System.out.println("error");
    }
 }
}
