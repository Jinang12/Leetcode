import java.util.*;

class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1 ) {
                arr.add(nums[i]);
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }
}
