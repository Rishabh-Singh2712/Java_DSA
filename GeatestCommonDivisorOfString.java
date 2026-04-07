import java.util.Scanner;

public class GeatestCommonDivisorOfString {

    // Method to find GCD of two strings
    public String gcdOfStrings(String str1, String str2) {

        // Step 1: Check if both strings follow the same repeating pattern
        // If concatenating in different orders gives different results,
        // then no common base string exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";  // No common divisor string
        }

        // Step 2: Find GCD of lengths of both strings
        // This gives the maximum possible length of repeating base string
        int GCDLength = gcd(str1.length(), str2.length());

        // Step 3: Extract the base string of length GCDLength
        // This substring will be the answer
        return str1.substring(0, GCDLength);
    }

    // Helper method to calculate GCD using Euclidean Algorithm
    private int gcd(int a, int b) {

        // Continue until remainder becomes 0
        while (b != 0) {

            // Store current value of b
            int temp = b;

            // Update b as remainder of a divided by b
            b = a % b;

            // Update a to previous b
            a = temp;
        }

        // When b becomes 0, 'a' contains the GCD
        return a;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take first string input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        // Take second string input
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Create object of the class to call non-static method
        GeatestCommonDivisorOfString obj = new GeatestCommonDivisorOfString();

        // Call method and store result
        String result = obj.gcdOfStrings(str1, str2);

        // Print final result
        System.out.println("GCD of Strings: " + result);

        // Close scanner to free resources
        sc.close();
    }
}