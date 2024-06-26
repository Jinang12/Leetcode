public class Solution{
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7,8};
        int target=90;
        System.out.println(BinarySearchRecursive(nums,target,0,nums.length-1));
    }
    public static int BinarySearchRecursive(int nums[],int target,int start,int end){
        int middle=(start+end)/2;
        if(start>end){
            return -1;
        }
        if(target == nums[middle]){
            return middle;
        }
        if(target > nums[middle]){
            return BinarySearchRecursive(nums,target,middle+1,end);
        }
        else{
            return BinarySearchRecursive(nums,target,start,middle-1);
        }
    }
}
