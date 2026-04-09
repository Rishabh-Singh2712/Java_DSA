import java.util.Scanner;

public class canPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (left && right) {
                    flowerbed[i] = 1;
                    count++;

                    if (count >= n) return true; // early exit
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of plots: ");
        int nPlots = sc.nextInt();

        int[] flowerbed = new int[nPlots];

        // Input array
        System.out.println("Enter flowerbed (0 for empty, 1 for planted):");
        for (int i = 0; i < nPlots; i++) {
            flowerbed[i] = sc.nextInt();
        }

        // Input n (number of flowers to plant)
        System.out.print("Enter number of flowers to plant: ");
        int n = sc.nextInt();

        // Create object
        canPlaceFlowers obj = new canPlaceFlowers();

        // Call method
        boolean result = obj.canPlaceFlowers(flowerbed, n);

        // Output result
        System.out.println("Can place flowers: " + result);

        sc.close();
    }
}