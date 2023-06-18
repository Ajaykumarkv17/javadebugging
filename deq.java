import java.util.*;
public class deq {
    public static void main(String[] args) {
        int n=9;
        int k=3;
        int ans=find(n,k);
        System.out.println(ans);
        
    }
    static int find(int n,int K){
        Deque<Integer> d=new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            d.add(i);
        }
        int turn=0;
        int ans=0;
        while(d.size()>1){
            if(turn==0){
                int in=0;
            while(d.size()>1&&in<K){
               ans= d.pollFirst();
                in++;}
            }
            else{
                 int in=0;
            while(d.size()>1&&in<K){
               ans= d.pollLast();
                in++;}
            }
            turn^=1;
        }
        return d.peekFirst();
    }
}
