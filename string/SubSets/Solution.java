import java.util.*;
public class Solution
{
    public static List <String> SubSets(String str,String ans,List <String> list,int count){
        if(count == str.length()){
            list.add(ans);
            return list;
        }
        SubSets(str,ans+str.charAt(count),list,count+1);
        SubSets(str,ans,list,count+1);
        return list;
    }
	public static void main(String[] args) {
		List <String> list1=new ArrayList<String>();
		list1=SubSets("abc","",list1,0);
		System.out.println(list1.toString());
	}
}
