public class OperadoresLogicos {
    public static void main(String[] args) {
        int edad = 25;
        boolean tieneLicencia = false;

        if(edad >= 18 && tieneLicencia){
            System.out.println("puedes conducir");
        }

        boolean esFeriado = false;
        boolean esFinDeSemana = false;

        if(esFeriado || esFinDeSemana){
            System.out.println("hoy no trabajo");
        }

        int numero = 5;

        if(numero != 5){
            System.out.println("el numero NO es 5");
        }

        boolean estaLloviendo = true;

        if(!estaLloviendo){
            System.out.println("puedo salir sin paraguas");
        }
    }
}
