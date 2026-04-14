import java.util.Scanner;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++; // move pointer in s when match found
            }

            
            j++; // always move pointer in t
        }

        return i == s.length(); // if all chars matched
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        IsSubsequence obj = new IsSubsequence();

        boolean result = obj.isSubsequence(s, t);

        System.out.println("Is '" + s + "' a subsequence of '" + t + "'? " + result);

        sc.close(); 
    }
}