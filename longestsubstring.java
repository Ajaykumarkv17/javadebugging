import java.util.*;
public class longestsubstring {
    public static void main(String[] args) {
        String S="ajaykumar";
        int ans=longestUniqueSubsttr(S);
        System.out.print(ans);
    }
    static int longestUniqueSubsttr(String S){
        HashMap<Character,Integer>hm=new HashMap<>();
        int n=S.length();
        int left=0, right=0;
        int len=0;
        while(right<n){
            //if repating character again comes in the window 
            if(hm.containsKey(S.charAt(right))){
                left=Math.max(hm.get(S.charAt(right))+1,left);
            }
            hm.put(S.charAt(right),right);
            len=Math.max(len,right-left+1);
            right++;
            
        }
        return len;
        
        
    }
}
