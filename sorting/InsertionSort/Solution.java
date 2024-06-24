import java.util.*;

public class Solution {
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j;
            for (j = i - 1; j >= 0 && nums[j] > key; j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 9, 2, 0};
        System.out.println("Original Array: " + Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}
