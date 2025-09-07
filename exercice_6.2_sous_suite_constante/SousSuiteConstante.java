import java.util.Scanner;

public class SousSuiteConstante {
    public static void main(String[] args) {
        System.out.println("<-- Ce programme permet de lire une suite non vide de nombres entiers positifs , calucule la longeur de la plus grande sous suite constante -->\n");
        System.out.println("Veuillez entrer -1 pour interrompre la lecture\n\n");
        suiteConstante();
    }


   public static int lecture() {
      Scanner var0 = new Scanner(System.in);
      boolean var2 = false;

      int var1;
      do {
         System.out.print("-->");
         var1 = var0.nextInt();
         if (var1 < 0 && var1 != -1) {
            System.out.println("\nMAuvaise saisie !!\nVeuillez entrer uniquement des entiers positifs\n");
            var2 = true;
         }

         var2 = false;
      } while(var2);

      return var1;
   }

    public static void suiteConstante(){
        int precedent=-2, n=0,tmp,max=1;
        do{
            tmp=lecture();
            if(precedent==-2 && tmp!=-1){
                precedent=tmp;
            }
            if(tmp!=-1){
                if(tmp!=precedent ){
                    precedent=tmp;
                    n=1;
                }
                else
                n++;
                if(n>max){
                    max=n;
                }
            }
            if(precedent==-2 && tmp==-1){
                System.out.println("Entrer au moins un entier positif");
            }
            if(precedent!=-2 && tmp==-1){
                System.out.println("Vous avez entrer -1. On interrompt alors la lecture\n");
            }
        }while(tmp!=-1 || precedent==-2);
        System.out.println("La longueur de la plus longue sous-suite est "+ max);

    }
}