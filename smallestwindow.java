import java.util.*;
public class smallestwindow {
    public static String smallestWindow(String s, String p)
    {
            HashMap<Character,Integer>map1=new HashMap<>();
            HashMap<Character,Integer>map2=new HashMap<>();
            for(int i=0;i<p.length();i++){
                char ch=p.charAt(i);
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
            
            int strlength=Integer.MAX_VALUE;
            int matchcount=0;
            
            int[]fans=new int[2];
            for(int i=0,j=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(map2.containsKey(ch)){
                    map1.put(ch,map1.getOrDefault(ch,0)+1);
                    if(map1.get(ch)<=map2.get(ch)){
                        matchcount++;
                    }
                }
                while(matchcount==p.length()){
                    char chj=s.charAt(j);
                    if(!map1.containsKey(chj)){
                        
                    }
                    else if(map1.get(chj)>map2.getOrDefault(chj,0)){
                        map1.put(chj,map1.get(chj)-1);
                    }
                    else{
                        if(i-j+1<strlength){
                            strlength=i-j+1;
                            fans[0]=i;
                            fans[1]=j;
                        }
                        map1.put(chj,map1.get(chj)-1);
                        if(map1.get(chj)<0){
                            map1.remove(chj);
                        }
                        matchcount--;
                    }
                    j++;
                }
            }
            if(fans[0]==fans[1]&&p.length()!=1){
                return "-1";
            }
            return (s.substring(fans[1],fans[0]+1));
            
    }
    public static void main(String[] args){
        String s="aprakadapra";
        String p="pada";
        String ans=smallestWindow(s,p);
        System.out.println(ans);
    }
}
