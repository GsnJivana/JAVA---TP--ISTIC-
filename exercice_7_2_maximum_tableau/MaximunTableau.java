
import java.util.Scanner;

public class MaximunTableau {
    public static void main(String[] args) {
        System.out.println("Ce programme permet de determiner l'element maximum d'un tableau d'entier");
        Scanner scanner = new Scanner(System.in);
        int Max;
        System.out.print("Entrez la taille du tableau :\n-->");
        int taille = scanner.nextInt();
        int[] tableau = new int[taille];
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("-->");
            tableau[i] = scanner.nextInt();
        }
        Max = maxTab(tableau);
       if(Max==-1){
            System.out.println("Le tableau est vide.");
       }
       else{
         System.out.println("L'entier maximum est : " + Max);
       }
        scanner.close();
    }
    public static int maxTab(int[] tableau) {
        if (tableau.length == 0) {
            return -1; 
        }

        int indiceMax = 0;
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > tableau[indiceMax]) {
                indiceMax = i;
            }
        }
        return tableau[indiceMax];
    }
}
