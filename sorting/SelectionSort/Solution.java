import java.util.*;
public class Solution{
    public static int[] selectionSort(int nums[]){
        for(int i=0;i<nums.length;i++){
                int maxIndex=0;
                for(int j=1;j<nums.length-i;j++){
                    if(nums[j]> nums[maxIndex]){
                        maxIndex=j;
                    }
                }
                int temp=nums[nums.length-1-i];
                nums[nums.length-1-i]=nums[maxIndex];
                nums[maxIndex]=temp;
        }
        return nums;
    }
    public static void main(String args[]){
        int nums[]={4,1,3,9,2,0};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }
}
