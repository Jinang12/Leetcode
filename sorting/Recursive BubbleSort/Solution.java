import java.util.*;
public class Solution
{
    public static int[] RecursiveBubbleSort(int nums[],int end){
        if(end < 0){
            return nums;
        }
        for(int i=0;i<end-1;i++){
            if(nums[i]<nums[i]){
                int temp=nums[i+1];
                nums[i+1]=nums[i];
                nums[i]=temp;
            }
        }
        return RecursiveBubbleSort(nums,end-1);
    }
  public static void main(String[] args) {
		int nums[]={4,3,2,1,0};
		System.out.println(Arrays.toString(RecursiveSelectionSort(nums,nums.length-1)));
	}
}
