public class App {
    public static void main(String[] args) throws Exception {
        
        int num = 0;
        String resultado = (num == 0) ? "El numero es igual a cero" 
                        : (num % 2 == 0) ? "El numero es par"
                        : "El numero es impar";

        System.out.println(resultado);

    }
}
