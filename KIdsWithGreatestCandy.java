import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;

public class KIdsWithGreatestCandy {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max = 0;

        // Step 1: Find the maximum number of candies
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        // Step 2: Check each kid
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of kids
        System.out.print("Enter number of kids: ");
        int n = sc.nextInt();

        int[] candies = new int[n];

        // Input candies array
        System.out.println("Enter candies for each kid:");
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }

        // Input extra candies
        System.out.print("Enter extra candies: ");
        int extraCandies = sc.nextInt();

        // Create object
        KIdsWithGreatestCandy obj = new KIdsWithGreatestCandy();

        // Call method
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);

        // Print result
        System.out.println("Result: " + result);

        sc.close();
    }
}