import java.util.Scanner;

public class ProductExceptSelf {

    // Function to calculate product of array except self
    public int[] productExceptSelf(int[] nums){

        int n = nums.length; // get size of array

        int[] result = new int[n]; // result array to store answer

        result[0] = 1; 
        // first element has no left elements → so initialize as 1

        // Step 1: Calculate left (prefix) products
        for(int i = 1; i < n; i++){
            // result[i] = product of all elements to the left of i
            result[i] = result[i-1] * nums[i-1];
        }

        int right = 1; 
        // variable to store product of elements on right side

        // Step 2: Traverse from right and multiply right product
        for(int i = n-1; i >= 0; i--){

            result[i] *= right; 
            // multiply left product (already stored) with right product

            right *= nums[i]; 
            // update right product for next iteration
        }

        return result; // return final result array
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create scanner object

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt(); // input size

        int[] nums = new int[n]; // create array

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt(); // input elements
        }

        // create object of class
        ProductExceptSelf obj = new ProductExceptSelf();

        // call function
        int[] result = obj.productExceptSelf(nums);

        System.out.println("Product of array except self: ");

        // print result
        for(int num : result){
            System.out.print(num + " ");
        }

        sc.close(); // close scanner
    }
}