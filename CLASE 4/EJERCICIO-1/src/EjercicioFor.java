public class EjercicioFor {
    
    public static void main (String[] args ){
        saludar();
        var i = 0;
        System.out.println(i);
        saludar();
    }

    public static void saludar() {
        for (int i = 0; i < 10; i++) {
            System.out.println("saludando desde un funcion");
        }
    }

    public static void ejercicio5() {
         for (int i = 1; i <= 3; i++){
            for (int j = 1; j <=3; j++){
                if (i == 0) break;
                System.out.println(i + " , " + j+ " ");
            }
        }
    }

    public static boolean  esPar(int num) {
        var residuo = num % 2;
        if(residuo == 1){
          return  false;
        }else{
          return   true;
        }
        
    }

}
