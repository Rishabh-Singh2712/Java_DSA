import java.util.Scanner;
public class ReverseOfString {
    
    public String reverseWords(String s) {

        // Step 1: remove extra spaces
        s = s.trim();

        // Step 2: split words (handles multiple spaces)
        String[] words = s.split("\\s+");

        // Step 3: reverse words
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Input string
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        ReverseOfString obj=new ReverseOfString();
        String result=obj.reverseWords(s);
        System.out.println("Reversed string: " + result);
        sc.close();
    }
}
/*Another method
  class Solution {
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') i--;

            if (i < 0) break;

            int j = i;

            while (j >= 0 && s.charAt(j) != ' ') j--;

            result.append(s.substring(j + 1, i + 1));

            result.append(" ");

            i = j - 1;
        }

        return result.toString().trim();
    }
}
 */