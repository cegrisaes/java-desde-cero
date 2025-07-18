public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println(sumar(3, 2));
        System.out.println(sumar(4.5, 5.0));
        System.out.println(sumar(1, 2, 3));
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static double sumar(double a, double b, double c) {
        return a + b + c;
    }

    public static double sumar(int a, double b) {
        return a + b;
    }

    public static double sumar(double a, int b) {
        return a + b;
    }
}
