public class OperadorTernario {
    public static void main(String[] args) {
        int edad = 30;
        String mensaje = edad >= 18 ? "puede votar" : "NO puede votar";

//        if(edad >= 18){
//            mensaje = "puede votar";
//        } else {
//            mensaje = "NO puede votar";
//        }

        System.out.println(mensaje);
    }
}
