
import java.util.Scanner;

public class MaxConsecutivesOnes {
        public int longestOnes(int[] nums, int k) {
        int left = 0;         
        int zeroCount = 0;     
        int maxLength = 0;     

        for (int right = 0; right < nums.length; right++) {

            
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++; 
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MaxConsecutivesOnes obj = new MaxConsecutivesOnes();    
        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        // Input array elements
        System.out.println("Enter the elements of the array (0s and 1s): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Input k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        // Call the method and print the result
        System.out.println("Maximum consecutive ones with at most " + k + " zeros: " + obj.longestOnes(nums, k));
        sc.close();
    }
}