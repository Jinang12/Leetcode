import java.util.*;

class Solution {
    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (middle > 0 && nums[middle] < nums[middle - 1]) {
                return middle;
            }
            if (nums[middle] > nums[end]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == 0 || target < nums[0]) {
            return binarySearch(nums, target, pivot, nums.length - 1);
        } else {
            return binarySearch(nums, target, 0, pivot - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int answer = search(nums, target);
        System.out.println(answer);
    }
}
