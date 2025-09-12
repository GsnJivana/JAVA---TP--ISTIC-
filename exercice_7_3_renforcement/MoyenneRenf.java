import java.util.Scanner;

public class MoyenneRenf {
    public static void main(String[] args) {
        System.out.println("<-- Ce programme permet de lire une suite non vide de nombres entiers positifs, calcule puis affiche la moyenne de ces nombres -->\n");
        calculMoyenne();
    }

    public static int lecture(String message) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.print(message);
            a = sc.nextInt();
            if (a < 0) {
                System.out.println("\nMauvaise saisie !!\nVeuillez entrer des entiers positifs\n");
            }
        } while (a < 0);
        return a;
    }

    public static void calculMoyenne() {
        int n = lecture("Combien de nombres souhaitez-vous entrer ? (doit être un entier positif) : ");
        int[] nombres = new int[n];
        int somme = 0;

        for (int i = 0; i < n; i++) {
            nombres[i] = lecture("--> ");
            somme += nombres[i];
        }

        System.out.println("La moyenne de ces nombres est " + ((double) somme / n));
    }
}
