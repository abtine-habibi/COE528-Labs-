package coe528.lab2;

public class Palindrome {

    // Requires: a string that is converted to a character array
    // Modifies: Nothing
    // Effects: Returns whether a string reversed is the same as forward
    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false; // null cannot be a palindrome
        }
        StringBuilder reversed = new StringBuilder();
        char[] w = word.toCharArray();
        for (int i = w.length - 1; i >= 0; i--) {
            reversed.append(w[i]);
        }

        String reversedString = reversed.toString();

        return reversedString.equals(new String(w));
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            if (args[0].equals("1")) {
                System.out.println(isPalindrome(null));
            } else if (args[0].equals("2")) {
                System.out.println(isPalindrome(""));
            } else if (args[0].equals("3")) {
                System.out.println(isPalindrome("deed"));
            } else if (args[0].equals("4")) {
                System.out.println(isPalindrome("abcd"));
            }
        } else {
            System.out.println("Please provide a single argument (1, 2, 3, or 4).");
        }
    }

}
