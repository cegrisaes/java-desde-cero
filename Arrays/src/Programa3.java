public class Programa3 {
    public static void main(String[] args) {
        int[] notas = {60, 56, 98, 100, 79, 66, 90, 52, 78, 59};
        String[] estudiantes = {"Luis", "Maria", "Jose", "Carlos", "Laura", "Roberto",
                                "Sandra", "Alejandra", "Julio", "Paco"};

        double suma = 0;
        for (int i = 0; i < notas.length ; i++){
            suma = suma + notas[i];
            System.out.println(estudiantes[i] + " obtuvo " + notas[i] + " puntos.");
        }

        System.out.println("El promedio de las notas es " + suma / notas.length);


    }
}
