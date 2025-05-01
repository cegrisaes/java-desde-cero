public class Programa2 {
    public static void main(String[] args) {
        String pais = "Colombia";

        switch (pais) {
            case "Mexico":
                System.out.println("Que onda!");
                break;
            case "Peru":
                System.out.println("Hola causa!");
                break;
            case "Argentina":
                System.out.println("Che, como andas?");
                break;
            case "Colombia":
                System.out.println("Quiubo parce!");
                break;
            default:
                System.out.println("Hola! No reconoci tu pais, pero me alegra que estes aqui.");
        }
    }
}
