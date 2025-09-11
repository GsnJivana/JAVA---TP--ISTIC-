import java.util.Scanner;
public class nbOcc {
    public static int nbOccurence(String s, char c) {
        int nbreoccur = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                nbreoccur++;
            }
        }
        return nbreoccur;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String s = scanner.nextLine();
        System.out.print("Entrez le caractère à rechercher : ");
        char c = scanner.next().charAt(0);
        int resultat = nbOccurence(s, c);
        System.out.println("Le nombre d'occurrences de '" + c + "' est : " + resultat);
        scanner.close();
    }
}
