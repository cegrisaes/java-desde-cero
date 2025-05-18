public class Programa8 {
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " multiplos de 3 entre 1 y 100");
    }
}
