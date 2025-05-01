public class Programa4 {
    public static void main(String[] args) {
        char letra = 'e';

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal.");
                break;
            default:
                System.out.println("Es una consonante.");
        }
    }
}
