import java.util.*;;
public class lengthoflongestconsecutivesubsequence {
    public static void main(String[] args) {
        String s="abcabccabde";
        int n=s.length();
        int ans=find(s,n);
        System.out.println(ans);
    }
    static int find(String s,int n){
        HashMap<Character,Integer>hm=new HashMap<>();
        int left=0,right=0;
        int len=0;
        //int n=s.length();
        while(right<n){
            if(hm.containsKey(s.charAt(right))){
                left=Math.max(hm.get(s.charAt(right))+1,left);
            }
                hm.put(s.charAt(right),right);
                len=Math.max(len,right-left+1);
                right++;
            }
            return len;
        }
    }

