import java.util.Scanner;

public class ReverseVowelsOfString {

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (isVowel(arr[left]) && isVowel(arr[right])) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            else if (!isVowel(arr[left])) {
                left++;
            }
            else {
                right--;
            }
        }

        return new String(arr);
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create object
        ReverseVowelsOfString obj = new ReverseVowelsOfString();

        // Call method
        String result = obj.reverseVowels(input);

        // Output result
        System.out.println("Result: " + result);

        sc.close();
    }
}