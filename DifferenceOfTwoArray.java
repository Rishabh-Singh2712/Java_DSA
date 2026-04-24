import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArray {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);

        return result;
    }
    public static void main(String[] args) {
        DifferenceOfTwoArray obj = new DifferenceOfTwoArray();
        int[] nums1 = {1, 2, 3}; // Example input
        int[] nums2 = {2, 4, 6}; // Example input
        List<List<Integer>> difference = obj.findDifference(nums1, nums2);
        System.out.println("Difference of two arrays: " + difference);
    }
}

