public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println(esPar(100));
        System.out.println(esPar(77));
    }

    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
}
