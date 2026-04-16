import java.util.*;

class MaxNumber {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
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
        System.out.print("Enter target sum k: ");
        int k = sc.nextInt();

        // Call function
        Solution obj = new Solution();
        int result = obj.maxOperations(nums, k);

        // Output
        System.out.println("Maximum number of operations: " + result);

        sc.close(); // good practice
    }
}