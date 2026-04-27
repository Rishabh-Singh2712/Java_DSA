import java.util.Arrays;
import java.util.Scanner;

public class CloseString {

    public boolean closeStrings(String word1, String word2) {

        // Condition 1: Length must be same
        if (word1.length() != word2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count frequency of characters in word1
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }

        // Count frequency of characters in word2
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // Condition 2: Both strings must have same set of characters
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) ||
                (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        // Condition 3: Frequency pattern must match
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String word2 = sc.nextLine();

        CloseString obj = new CloseString();
        boolean result = obj.closeStrings(word1, word2);

        if (result) {
            System.out.println("The strings are close.");
        } else {
            System.out.println("The strings are not close.");
        }

        sc.close();
    }
}