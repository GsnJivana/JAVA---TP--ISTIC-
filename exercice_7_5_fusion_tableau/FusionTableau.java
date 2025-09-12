
import java.util.Arrays;
import java.util.Scanner;

public class FusionTableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ce programme permet de fusionner deux tableaux tries par ordre croissant entre au clavier\n");
        System.out.print("\nEntrez la taille du premier tableau :\n-->");
        int tailleT1 = scanner.nextInt();
        int[] t1 = new int[tailleT1];
        System.out.println("Entrez les éléments du premier tableau triés par ordre croissant:");
        for (int i = 0; i < tailleT1; i++) {
            System.out.print("-->");
            t1[i] = scanner.nextInt();
        }

        
        System.out.print("\nEntrez la taille du deuxième tableau :\n-->");
        int tailleT2 = scanner.nextInt();
        int[] t2 = new int[tailleT2];
        System.out.println("Entrez les éléments deuxième tableau  triés par ordre croissant :");
        for (int i = 0; i < tailleT2; i++) {
            System.out.print("-->");
            t2[i] = scanner.nextInt();
        }

        
        if (!estTrie(t1) || !estTrie(t2)) {
            System.err.println("\nErreur : Les tableaux doivent être triés par ordre croissant.");
            return;
        }

        
        int[] resultat = fusion(t1, t2);

       
        System.out.println("\nLe tableau fusionné est : " + Arrays.toString(resultat));
    }

    
    public static boolean estTrie(int[] tableau) {
        for (int i = 0; i < tableau.length - 1; i++) {
            if (tableau[i] > tableau[i + 1]) {
                return false;
            }
        }
        return true;
    }

    
    public static int[] fusion(int[] t1, int[] t2) {
        int[] resultat = new int[t1.length + t2.length];
        int i = 0, j = 0, k = 0;

        while (i < t1.length && j < t2.length) {
            if (t1[i] < t2[j]) {
                resultat[k++] = t1[i++];
            } else {
                resultat[k++] = t2[j++];
            }
        }

       
        while (i < t1.length) {
            resultat[k++] = t1[i++];
        }

        
        while (j < t2.length) {
            resultat[k++] = t2[j++];
        }

        return resultat;
    }
}
