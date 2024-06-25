import java.util.*;
class Solution {
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length){
            if(nums[i] != i+1 ){
                if(nums[i] != nums[nums[i]-1]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
                }
                else{
               return nums[i];
            }
            }
            else{
                i++;
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
        int answer=findDuplicate(nums);
    }
}
