import java.util.Scanner;

public class Main {

    public static String KeepLettersOnly(String Xspaces) {
        String newXspaces;
        newXspaces = Xspaces.toLowerCase();
        newXspaces = Xspaces.replaceAll("", "");
        return newXspaces;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\nInput possible palindromes to find out if it is one:");
//        "Palindrome"
//        "Civic"
//        "Radar"
//        "Level"
//        "Eva, can I stab bats in a cave?"
//        "A man, a plan, a canal, Panama"
//        "Mr. Owl ate my metal worm"
//        "Never odd or even"
//        "Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod."
        String original = in.nextLine();
        String phrase1 = original.toLowerCase();
        String phrase2 = KeepLettersOnly(phrase1);
        String reverse = "";

        for (int x = phrase2.length() - 1; x >= 0; x--) {
            String letter = phrase2.substring(x, x + 1);
            reverse = reverse + letter;
        }

        if (phrase2.equalsIgnoreCase(reverse)) {
            System.out.println(original + " is a palindrome");
        }
        else {
            System.out.println(original + " is not a palindrome");
        }

    }
}
