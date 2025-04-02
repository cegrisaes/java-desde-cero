public class IfElse {
    public static void main(String[] args) {
       boolean esPerro = false;

       if(esPerro){
           System.out.println("puede ladrar");
           System.out.println("puede mover la cola");
           }

       int edad = 12;

       if(edad >= 18){
           System.out.println("eres mayor de edad");
       }else {
           System.out.println("eres menor de edad");
       }

       int puntuacion = 15;

       if(puntuacion >= 90){
           System.out.println("excelente");
       }else if(puntuacion >= 70){
           System.out.println("buen trabajo");
       }else if(puntuacion >= 50){
           System.out.println("puedes mejorar");
       }else {
           System.out.println("reprobado");
       }
    }
}
