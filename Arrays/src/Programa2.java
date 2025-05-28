public class Programa2 {
    public static void main(String[] args) {
        int[] notas = new int[1000];

        for(int i = 0; i < notas.length ; i++ ){
            notas[i] = i + 1;
        }

        for(int i = 0; i < notas.length ; i++ ){
            System.out.println(notas[i]);
        }
    }
}
