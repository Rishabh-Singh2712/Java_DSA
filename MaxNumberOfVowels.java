
import java.util.Scanner;

public class MaxNumberOfVowels {
    
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxCount = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        maxCount = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {
            // Add new character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            // Remove old character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' 
            || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxNumberOfVowels obj = new MaxNumberOfVowels();
        // Input string
        System.out.print("Enter a string: ");   
        String s = sc.nextLine();
        // Input k means how many characters in substring
        System.out.print("Enter k: ");
        int k = sc.nextInt();   
        // Call function
        int result = obj.maxVowels(s, k);
        // Output
        System.out.println("Maximum number of vowels in any substring of length " + k + ": " + result);
        sc.close();
    }
}

