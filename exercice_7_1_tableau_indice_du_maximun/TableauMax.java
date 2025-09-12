
import java.util.Scanner;

public class TableauMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indiceMax;
        System.out.println("Ce programme determine l'indice de l'entier maximal dans un tableau");
        System.out.print("Entrez la taille du tableau :\n-->");
        int taille = scanner.nextInt();
        int[] tableau = new int[taille];
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("-->");
            tableau[i] = scanner.nextInt();
        }
        indiceMax = indexOfMax(tableau);
       if(indiceMax==-1){
            System.out.println("Le tableau est vide.");
       }
       else{
         System.out.println("L'indice de l'entier maximum est : " + indiceMax);
       }
        scanner.close();
    }


    public static int indexOfMax(int[] tableau) {
        if (tableau.length == 0) {
            return -1; 
        }

        int indiceMax = 0;
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > tableau[indiceMax]) {
                indiceMax = i;
            }
        }
        return indiceMax;
    }
}
