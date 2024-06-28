import java.util.*;
class Solution {
    public static int helper(int num,int helper){
        if(num == 0){
            return helper;
        }
        if(num%2 == 0){
            return helper(num/2,helper+1);
        }
        if(num%2 != 0){
            return helper(num-1,helper+1);
        }
        return 0;
    }
    public static int numberOfSteps(int num) {
        int answer=helper(num,0);
        return answer;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int answer=numberOfSteps(num);
    }
}
