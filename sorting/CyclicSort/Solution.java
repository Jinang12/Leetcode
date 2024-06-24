import java.util.*;
public class Main {
    public static int[] cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(cyclicSort(nums)));
    }
}
