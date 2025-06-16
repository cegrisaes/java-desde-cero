public class Ejercicio1 {
    public static void main(String[] args) {
        imprimirCuentaRegresivaDesde(5);
        imprimirCuentaRegresivaDesde(2);
    }

    public static void imprimirCuentaRegresivaDesde(int inicio){
        for(int i = inicio; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println();
    }
}
