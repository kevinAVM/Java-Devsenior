public class pasoPorValorEjemplo {

    public static void modificarNumero(int num) {
        System.out.println("Dentro del metodo - Antes de modificar: " + num);
        num = num * 2;
        System.out.println("Dentro del metodo - Despues de modificar: " + num);
    }

    public static void main(String[] args) {
        int miNumero = 10;
        System.out.println("Antes de llamar al metodo: " + miNumero);

        modificarNumero(miNumero);

        System.out.println("Despues de llamar al metodo: " + miNumero);
    }
}