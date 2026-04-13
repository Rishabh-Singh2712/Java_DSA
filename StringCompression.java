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