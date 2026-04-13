import java.util.Scanner;
public class MoveZero {
    
    public void moveZeroes(int[] nums) {

        int j = 0; // position for next non-zero

        // Step 1: move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        // Step 2: fill remaining with zeros
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MoveZero obj = new MoveZero();
        obj.moveZeroes(nums);

        System.out.println("Array after moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

