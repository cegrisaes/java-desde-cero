public class Ejercicio1 {
    public static void main(String[] args) {
        int[] miArray = obtenerArray();

        for(int i = 0; i < miArray.length; i++){
            System.out.println(miArray[i]);
        }
    }

    public static int[] obtenerArray(){
        int[] numeros = {1,2,3};
        return numeros;
    }
}
