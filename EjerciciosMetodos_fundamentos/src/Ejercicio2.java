public class Ejercicio2 {
    public static void main(String[] args) {
        mostrarTipoDeNumero(200.6);
        mostrarTipoDeNumero(-15);
        mostrarTipoDeNumero(0);
    }

    public static void mostrarTipoDeNumero(double numero){
        if(numero > 0){
            System.out.println("Positivo");
        }else if(numero < 0){
            System.out.println("Negativo");
        }else {
            System.out.println("Cero");
        }
    }
}
