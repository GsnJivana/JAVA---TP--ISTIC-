import java.util.Scanner;

public class sousSuite{
    public static void main(String[] args) {
        System.out.println("<-- Ce programme permet de lire une suite non vide de nombres entiers positifs , calucule la longeur de la plus grande sous suite constante -->\n");
        System.out.println("Veuillez entrer -1 pour interrompre la lecture\n\n");
        suiteConstante();
    }

    public static int lecture() {
        Scanner var0 = new Scanner(System.in);
        boolean var2 = false;

        int var1 = -1;
        while (true) {
            System.out.print("-->");
            var1 = var0.nextInt();
            if (var1 < 0 && var1 != -1) {
                System.out.println("\nMauvaise saisie !!\nVeuillez entrer uniquement des entiers positifs\n");
                var2 = true;
            }

            if (!var2) break;
        }

        return var1;
    }

    public static void suiteConstante(){
        int precedent = -2, n = 0, tmp, max = 1;

        tmp = lecture();
        while (tmp != -1 || precedent == -2) {
            if (precedent == -2 && tmp != -1) {
                precedent = tmp;
            }
            if (tmp != -1) {
                if (tmp != precedent) {
                    precedent = tmp;
                    n = 1;
                } else {
                    n++;
                }
                if (n > max) {
                    max = n;
                }
            }
            if (precedent == -2 && tmp == -1) {
                System.out.println("Entrer au moins un entier positif");
            }
            if (precedent != -2 && tmp == -1) {
                System.out.println("Vous avez entré -1. On interrompt alors la lecture\n");
            }
            tmp = lecture();
        }
        System.out.println("La longueur de la plus longue sous-suite est " + max);
    }
}
