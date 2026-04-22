import java.util.Scanner;
public class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;  // start at 0
        int maxAltitude = 0;      // track maximum

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];        // update altitude
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LargestAltitude obj = new LargestAltitude();
        // Input
        System.out.print("Enter the size of the gain array: ");
        int n = sc.nextInt();
        int[] gain = new int[n];
        System.out.println("Enter the gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }
        // Output
        int result = obj.largestAltitude(gain);
        System.out.println("The largest altitude reached is: " + result);
        
    }
}