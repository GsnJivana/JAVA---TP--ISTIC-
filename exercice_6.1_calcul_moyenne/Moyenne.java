import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        
        System.out.println("<-- Ce programme permet de lire une suite non vide de nombres entiers positifs , calucule puis affiche la moyene de ces nombres -->\n");
        System.out.println("Veuillez entrer -1 pour interrompre la lecture\n\n");
        calculMoyenne();
        
    }

    public static int lecture(){
        Scanner sc = new Scanner(System.in);
        int a,i=0;
        do{
            System.out.print("-->");
            a = sc.nextInt();
            if(a<0 && a!=-1){
                System.out.println("\nMAuvaise saisie !!\nVeuillez entrer des entiers positifs\n");
                i=1;
            }
            i=0;
        }while(i==1);
        return a;
    }

    public static void calculMoyenne(){
        int somme=0, n=0,tmp;
        do{
            tmp=lecture();
            if(tmp!=-1){
                somme+=tmp;
                n++;
            }
            if(n==0 && tmp==-1){
                System.out.println("Entrer au moins un entier positif");
            }
            if(n!=0 && tmp==-1){
                System.out.println("Vous avez entrer -1. On interrompt alors la lecture\n");
            }
        }while(tmp!=-1 || n==0);
        System.out.println("La moyenne de ces nombre est "+((double)somme/n));

    }
}