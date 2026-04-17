
import java.util.Scanner;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Step 1: first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Step 2: sliding window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];      // add next
            sum -= nums[i - k];  // remove previous

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
    public static void main(String[] args) {
        MaximumAverageSubarray obj = new MaximumAverageSubarray();
        Scanner sc = new Scanner(System.in);
        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Input k
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        // Call function
        double result = obj.findMaxAverage(nums, k);
        // Output
        System.out.println("Maximum average: " + result);
        sc.close();

    }
}

