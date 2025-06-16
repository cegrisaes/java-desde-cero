public class Ejercicio4 {
    public static void main(String[] args) {
        imprimirRango(5,10);
        imprimirRango(5,4);
        imprimirRango(5,5);
    }

    public static void imprimirRango(int inicio, int fin){
        if(inicio <= fin){
            for(int i = inicio; i <= fin; i++){
                System.out.println(i);
            }
        }else{
            System.out.println("Inicio debe ser menor o igual a fin");
        }
        System.out.println();
    }
}
