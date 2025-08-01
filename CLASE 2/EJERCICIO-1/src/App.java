
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args)  {
        double precioOriginal = Double
                .parseDouble(JOptionPane.showInputDialog("Digite el precio original del producto: "));
        double porcentajeDescuento = Double
                .parseDouble(JOptionPane.showInputDialog("Digite el porcentaje de descuento: "));

        double totalPagar = (precioOriginal * porcentajeDescuento) /100;

        System.out.println("El precio original del producto es: " + precioOriginal);
        System.out.println("Porcentaje de descuento: " + porcentajeDescuento);
        System.out.println("El valor con descuento es: " + totalPagar);
    }
}
