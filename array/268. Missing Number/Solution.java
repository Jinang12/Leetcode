import java.util.*;
class Solution {
    public static int missingNumber(int[] nums) {
        int i=0,j=0;
        while( i < nums.length){
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]){
                int correctIndex=nums[i];
                int temp=nums[correctIndex];
                nums[correctIndex]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        while(j < nums.length){
            if(nums[j]!=j){
                return j;
            }
            else{
                j++;
            }
        }
        return nums.length;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int answer=missingNumber(nums);
    }
}
