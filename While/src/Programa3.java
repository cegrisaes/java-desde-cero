public class Programa3 {
    public static void main(String[] args) {
        int contador = 1;
        int suma = 0;
        while(contador <= 3){
            System.out.println(contador);
            suma = suma + contador;
            contador = contador + 1;
        }
        System.out.println("La suma es " + suma);
        System.out.println("Adios");

    }
}
