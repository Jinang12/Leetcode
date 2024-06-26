import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j + 1] < nums[j]) { 
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Concatenate and sort the arrays
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1 + n2];
        System.arraycopy(nums1, 0, nums3, 0, n1);
        System.arraycopy(nums2, 0, nums3, n1, n2);
        sort(nums3);

        int n3 = nums3.length;
        if (n3 % 2 == 0) {
            return (double) (nums3[n3 / 2 - 1] + nums3[n3 / 2]) / 2;
        } else {
            return nums3[n3 / 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of the first array:");
        int[] nums1 = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Enter elements of the second array:");
        int[] nums2 = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of the sorted arrays: " + median);
    }
}
