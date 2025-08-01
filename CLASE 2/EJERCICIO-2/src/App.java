
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // melisa tiene n pesos  
        // xiomara tiene la mitad de lo que tiene melisa 
        // maria tiene la mitad de lo que posee melisa y xiomara juntas 
        // hacer un programa que calcule e imprima la cantidad de dinero que tiene entre los tres.


        double melisa = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de pesos que tiene melissa: "));
        double xiomara = melisa / 2;
        double maria = (melisa + xiomara) /2;

        double total = melisa + xiomara + maria;

        System.out.println("TOTAL DE DINERO ENTRE LAS TRES: " + total);
    }
}
