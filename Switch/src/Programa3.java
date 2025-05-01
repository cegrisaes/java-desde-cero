public class Programa3 {
    public static void main(String[] args) {
        char nota = 'B';

        switch (nota) {
            case 'A':
                System.out.println("Excelente! Sacaste una A.");
                break;
            case 'B':
                System.out.println("Muy bien! Buen trabajo.");
                break;
            case 'C':
                System.out.println("Bien, pero puedes mejorar.");
                break;
            case 'D':
                System.out.println("Casi no pasas. Estudia un poco mas.");
                break;
            case 'F':
                System.out.println("Reprobaste. Toca esforzarse mas.");
                break;
            default:
                System.out.println("Nota no valida.");
        }
    }
}
