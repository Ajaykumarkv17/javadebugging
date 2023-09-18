import java.util.*;
public class smallestdistinctwindow {
   static public int findSubString( String str) {
        // Your code goes here
        
        HashSet<Character> set=new HashSet<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        System.out.println(set.size());
        int i=0;
        int j=0;
        int ans=Integer.MAX_VALUE;
        
        while(i<str.length()){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
            i++;
            
           while(map.size()==set.size()){
                ans = Math.min(ans,i-j);
                System.out.println(ans);
                char ch1 = str.charAt(j);
                map.put(ch1, map.getOrDefault(ch1, 0)-1);
                if(map.get(ch1)==0) map.remove(ch1);
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String a="geekgeeksfor";
        int ans=findSubString(a);
        System.out.println(ans);
    }
}
