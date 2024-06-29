import java.util.*;

public class Solution {

    public static void MergeSort(int nums[]) {
        if (nums.length <= 1) {
            return;
        }
        
        int mid = nums.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];
        
        System.arraycopy(nums, 0, left, 0, mid);
        System.arraycopy(nums, mid, right, 0, nums.length - mid);
        
        MergeSort(left);
        MergeSort(right);
        
        merge(nums, left, right);
    }

    public static void merge(int merged[], int left[], int right[]) {
        int i = 0, j = 0, k = 0;
        
        while (j < left.length && k < right.length) {
            if (left[j] <= right[k]) {
                merged[i++] = left[j++];
            } else {
                merged[i++] = right[k++];
            }
        }
        
        while (j < left.length) {
            merged[i++] = left[j++];
        }
        
        while (k < right.length) {
            merged[i++] = right[k++];
        }
    }

    public static void main(String[] args) {
        int nums[] = {3, 1, 7, 5, 11, 9, 432, 564, 12, 1123, 153};
        
        MergeSort(nums);
        
        System.out.print("Sorted Array: ");
        for (int element : nums) {
            System.out.print(element + " ");
        }
    }
}
