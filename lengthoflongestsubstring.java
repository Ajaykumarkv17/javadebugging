import java.util.*;
public class lengthoflongestsubstring {

   static int solve(String s){
    int ans=0;
        //so basically here what we doing is we have two pointer approach left and right we put the characters into map with the index then we processing until a duplicate is found then we move the left pointer upto index+1 and update the index in Map
    HashMap<Character,Integer>hm=new HashMap<>();
    int left=0;
    int right=0;
    int n=s.length();
    while(right<n){
        if(hm.containsKey(s.charAt(right))){
            left=Math.max(hm.get(s.charAt(right))+1,left);
        }
        hm.put(s.charAt(right),right);
        ans=Math.max(ans,right-left+1);
        right++;

    }



    return ans;
   }


    public static void main(String[] args){
    String str = "takeUforward";
    System.out.println("The length of the longest substring without repeating characters is " + solve(str));}
}
