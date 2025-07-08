public class Ejercicio2 {
    public static void main(String[] args) {
        int[] primerArray = {1,2, 3};
        imprimirElementos(primerArray);
        modificarArray(primerArray);
        imprimirElementos(primerArray);
        int[] segundoArray = obtenerArrayConElementosDuplicados(primerArray);
        imprimirElementos(primerArray);
        imprimirElementos(segundoArray);
    }

    public static void imprimirElementos(int[] numeros){
        for(int i = 0;i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println();
    }

    public static void modificarArray(int[] numeros){
        if(numeros.length >= 1){
            numeros[0] = 100;
        }
    }

    public static int[] obtenerArrayConElementosDuplicados(int[] numeros){
        int[] copia = new int[numeros.length];
        for (int i = 0; i < copia.length; i++){
            copia[i] = numeros[i] * 2;
        }
        return copia;
    }
}
