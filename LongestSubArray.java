import java.util.Scanner;

public class LongestSubArray {

    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        // To track best window
        int bestStart = 0;
        int bestEnd = 0;

        for (int right = 0; right < nums.length; right++) {

            // Count zeros
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink window if more than 1 zero
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update max length (delete 1 element → right - left)
            if (right - left > maxLength) {
                maxLength = right - left;
                bestStart = left;
                bestEnd = right;
            }
        }

        // 🔥 Print the subarray of 1s (after removing one zero)
        System.out.print("Longest subarray of 1s: ");

        boolean zeroRemoved = false;

        for (int i = bestStart; i <= bestEnd; i++) {
            if (nums[i] == 0 && !zeroRemoved) {
                zeroRemoved = true; // skip one zero (simulate deletion)
                continue;
            }
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LongestSubArray obj = new LongestSubArray();

        // Input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the binary array (0s and 1s):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        int result = obj.longestSubarray(nums);

        // Output
        System.out.println("Length of longest subarray of 1s after deleting one element: " + result);

        sc.close();
    }
}