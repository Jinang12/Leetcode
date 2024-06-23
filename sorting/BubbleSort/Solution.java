import java.util.*;
public class Solution{
    public static int[] sort(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]> nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String args[]){
        int [] nums={3,1,4,5,2,0,0,0,0,0};
        System.out.println(Arrays.toString(sort(nums)));
    }
}
