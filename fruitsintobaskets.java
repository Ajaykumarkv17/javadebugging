import java.util.*;
public class fruitsintobaskets {
    public static int totalFruits(int N, int[] fruits) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans=0,i=0;
        
        for(int j=0;j<N;j++){
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
            if(hm.size()>2){
                hm.put(fruits[i],hm.get(fruits[i])-1);
                if(hm.get(fruits[i])==0){
                    hm.remove(fruits[i]);
                }
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,2};
        int N=arr.length;
        int ans=totalFruits(N, arr);
        System.out.println(ans);
    }
}
