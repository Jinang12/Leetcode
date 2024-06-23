import java.util.*;
public class Solution{
    public static int[] binarySearch(int nums[][],int target){
        int i=0;
        int j=nums[0].length-1;
        while(i < nums.length && j>=0 ){
            if(nums[i][j] == target){
                return new int[]{i,j};
            }
            if(nums[i][j] > target){
                j--;
            }
            if(nums[i][j] < target){
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int nums[][]={  {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}   };
        int target=15;
        System.out.println(Arrays.toString(binarySearch(nums,target)));
    }
}
