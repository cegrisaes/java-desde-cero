public class Programa1 {
    public static void main(String[] args) {
        String nombre1 = "Jose";
        imprimirSaludo(nombre1);
        imprimirPerfil(nombre1, 33, "Mexico");

        String nombre2 = "Luis";
        imprimirSaludo(nombre2);
        imprimirPerfil(nombre2, 28, "Peru");

        String nombre3 = "Laura";
        imprimirSaludo(nombre3);
        imprimirPerfil(nombre3, 25, "Chile");

        String nombre4 = "Ana";
        imprimirSaludo(nombre4);
        imprimirPerfil(nombre4, 31, "Colombia");

        imprimirDespedida();
    }

    public static void imprimirSaludo(String nombre){
        System.out.println("Buenas tardes, " + nombre);
    }

    public static void imprimirPerfil(String nombre, int edad, String pais){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Pais: " + pais);
        System.out.println();
    }

    public static void imprimirDespedida(){
        System.out.println("Nos vemos pronto");
    }
}
