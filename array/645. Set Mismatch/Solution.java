import java.util.*;
class Solution {
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        int answer[]={-1,-1};
        while(i < nums.length){
            if(nums[i] != nums[nums[i]-1]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                answer[0]=nums[i];
                answer[1]=i+1;
            }
        }
        return answer;
    }
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
