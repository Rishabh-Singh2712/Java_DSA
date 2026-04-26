import java.util.*;

public class UniqueOccurence {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (int freq : map.values()) {
            if (!set.add(freq)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UniqueOccurence obj = new UniqueOccurence();

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function
        boolean result = obj.uniqueOccurrences(arr);

        // Output
        System.out.println("Unique occurrences: " + result);

        sc.close();
    }
}