import java.util.Scanner;

public class IncreasingTripletSequence {

    public void increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (num <= first) {
                // update smallest
                first = num;
                firstIndex = i;
            }
            else if (num <= second) {
                // update second smallest
                second = num;
                secondIndex = i;
            }
            else {
                // found third number
                System.out.println("Increasing Triplet Found:");
                System.out.println(nums[firstIndex] + " " + nums[secondIndex] + " " + num);
                return;
            }
        }

        System.out.println("No increasing triplet subsequence found.");
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

        IncreasingTripletSequence obj = new IncreasingTripletSequence();
        obj.increasingTriplet(nums);

        sc.close();
    }
}