import java.util.*;
public class kthlarg {
    static int klarge(ArrayList<Integer>arr,int k){
            PriorityQueue<Integer>pq=new PriorityQueue<>();
            int n=arr.size();
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=i;j<n;j++){
                    sum=sum+arr.get(j);
                    if(pq.size()<k){
                        pq.add(sum);
                    }
                    else{
                        if(pq.peek()<sum){
                            pq.poll();
                            pq.add(sum);
                        }
                    }
                }
            }
            return pq.peek();
        }
    public static void main(String[] args){
        
            ArrayList<Integer>arr=new ArrayList<>();
            arr.add(3);
            arr.add(1);
            arr.add(5);
            int k=2;
            int kthlar=klarge(arr,k);
            System.out.println(kthlar);
    }
}
