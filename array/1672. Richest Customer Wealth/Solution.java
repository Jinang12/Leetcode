import java.util.*;
class Solution {
    public static int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int cols = accounts[0].length;
        int sum=0;
        for(int i=0;i<rows;i++){
            int target=0;
            for(int j=0;j<cols;j++){
                target+=accounts[i][j];
            }
            if(target>sum){
            sum=target;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int accounts[][]=new int[m][n];
        int answer=maximumWealth(accounts);
    }
}
