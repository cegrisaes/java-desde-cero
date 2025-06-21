public class Programa2_despues {
    public static void main(String[] args) {
        int[] primerArray = {1,2,3};
        int[] segundoArray = primerArray;

        primerArray[1] = 20;

        System.out.println("Elementos de primerArray");
        for (int i = 0; i < primerArray.length; i++ ){
            System.out.println(primerArray[i]);
        }

        System.out.println();

        System.out.println("Elementos de segundoArray");
        for (int i = 0; i < segundoArray.length; i++ ){
            System.out.println(segundoArray[i]);
        }
    }
}
