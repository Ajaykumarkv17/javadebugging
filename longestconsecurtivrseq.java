
import java.util.*;

public class longestconsecurtivrseq {
    




    static int longestSuccessiveElements(int a[]){
        int ans=0;
        HashSet<Integer>hs=new HashSet<>();

        for(int i :a){
            hs.add(i);
        }

        for(int i: a){
            if(!hs.contains(i-1)){
                int cnt=1;
                int it=i;

                while(hs.contains(it+1)){
                    cnt++;
                    it++;
                }
              ans=Math.max(ans,cnt);
            }
            
        }
        
        
        
        return ans;

    }


    public static void main(String[] args) {
        int[] a = {100, 200,5, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
