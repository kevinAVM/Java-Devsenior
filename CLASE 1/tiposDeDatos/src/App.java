import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        // entrada de datos por ventana emergente
        String nombre = JOptionPane.showInputDialog("digite el nombre: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("digite la edad"));
        float estatura = Float.parseFloat(JOptionPane.showInputDialog("digite la estatura"));


        // salida de datos por ventana emergente 
        JOptionPane.showMessageDialog( null, "el nombre es: " + nombre);
        JOptionPane.showMessageDialog( null, "el nombre es: " + edad);
        JOptionPane.showMessageDialog( null, "el nombre es: " + estatura);
 }
}
