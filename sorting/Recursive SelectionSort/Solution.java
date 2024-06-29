import java.util.*;
public class Solution
{
  public static int[] RecursiveSelectionSort(int nums[],int end){
        int i=1;
        int maxIndex=0;
        if(end < 0){
            return nums;
        }
        while( i <= end){
            if(nums[i] > nums[maxIndex]){
                maxIndex=i;
            }
            else{
                i++;
            }
        }
        int temp=nums[end];
        nums[end]=nums[maxIndex];
        nums[maxIndex]=temp;
        return RecursiveSelectionSort(nums,end-1);
    }
	public static void main(String[] args) {
		int nums[]={4,3,2,1,0};
		System.out.println(Arrays.toString(RecursiveSelectionSort(nums,nums.length-1)));
	}
}
