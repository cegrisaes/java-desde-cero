public class Ejercicio5 {
    public static void main(String[] args) {
        imprimirCuadrado(5);
    }

    public static void imprimirCuadrado(int numero){
        System.out.println("El cuadrado de " + numero + " es " + obtenerCuadrado(numero));
    }

    public static int obtenerCuadrado(int numero){
        return numero * numero;
    }
}
