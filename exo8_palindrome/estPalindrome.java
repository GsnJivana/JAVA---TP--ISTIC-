package exo8_palindrome;
public class estPalindrome {
    public static boolean palindrome(String mot) {
        for (int i = 0; i < mot.length() / 2; i++) {
            if (mot.charAt(i) != mot.charAt(mot.length() - 1 - i)) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        String mot = "kayak"; 
        if (palindrome(mot)) {
            System.out.println(mot + " est un palindrome");
        } else {
            System.out.println(mot + " n'est pas un palindrome");
        }
    }
}
