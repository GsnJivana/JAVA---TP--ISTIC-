import java.util.Scanner;

public class Ieme {
    public static int digitIterative(int n, int i) {
        for (int j = 0; j < i; j++) {
            n = n / 10; 
        }
        if (n == 0) {
            return 0; 
        }
        return n % 10;  
    }

    public static int digitRecursive(int n, int i) {
        if (i == 0) {
            return n % 10;     
        } else if (n == 0) {
            return 0;           
        } else {
            return digitRecursive(n / 10, i - 1);  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre n (>=0) : ");
        int n = scanner.nextInt();
        System.out.print("Entrez l'indice i du chiffre (0 pour le chiffre des unités) : ");
        int i = scanner.nextInt();
        int chiffreIter = digitIterative(n, i);
        int chiffreRec = digitRecursive(n, i);
        System.out.println("Version itérative : le " + i + "ième chiffre de " + n + " est " + chiffreIter);
        System.out.println("Version récursive : le " + i + "ième chiffre de " + n + " est " + chiffreRec);
        scanner.close();
    }
}
