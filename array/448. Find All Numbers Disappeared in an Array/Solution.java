import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers = new ArrayList<>();
        int i = 0;
        
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
            if (nums[i] != i + 1) {
                disappearedNumbers.add(i + 1);
            }
        }
        
        return disappearedNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Solution sol = new Solution();
        List<Integer> answer = sol.findDisappearedNumbers(nums);
        System.out.println(answer);
        
        sc.close();
    }
}
