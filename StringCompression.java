import java.util.Scanner;

public class StringCompression {

    public int compress(char[] chars) {

        int n = chars.length;
        int index = 0; // write pointer
        int i = 0;     // read pointer

        while (i < n) {

            char currentChar = chars[i];
            int count = 0;

            // count repeating characters
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // write character
            chars[index++] = currentChar;

            // write count if more than 1
            if (count > 1) {
                String countStr = String.valueOf(count);

                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        char[] chars = new char[n];

        System.out.println("Enter characters one by one (space separated):");
        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        StringCompression obj = new StringCompression();
        int newLength = obj.compress(chars);

        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }

        System.out.println("\nNew Length: " + newLength);

        sc.close(); 
    }
}
/*ALTENATE
class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int index = 0;
        int i = 0;

        while (i < n) {

            char currentChar = chars[i];
            int count = 0;

            // count occurrences
            while (i < n && chars[i] == currentChar) {
                i++;
                count++;
            }

            // write character
            chars[index++] = currentChar;

            // write count manually
            if (count > 1) {

                int start = index;

                // write digits in reverse order
                while (count > 0) {
                    chars[index++] = (char) ('0' + (count % 10));
                    count /= 10;
                }

                // reverse digits to correct order
                reverse(chars, start, index - 1);
            }
        }

        return index;
    }

    // helper function to reverse part of array
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

*/