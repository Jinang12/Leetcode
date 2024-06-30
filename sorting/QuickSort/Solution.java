import java.util.*;
public class Solution
{
    public static void QuickSort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int middle=(start+end)/2;
        int pivot=nums[middle];
        while(start<=end){
            while(nums[start] < nums[pivot]){
                start++;
            }
            while(nums[end] > nums[pivot]){
                end--;
            }
            if(start<=end){
                int temp =nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        QuickSort(nums,low,end);
        QuickSort(nums,start,high);
    }
	public static void main(String[] args) {
		int nums[]={5,4,3,2,1};
		QuickSort(nums,0,nums.length-1);
		for(int element: nums){
		    System.out.print(element);
		}
	}
}
