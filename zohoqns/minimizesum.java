import java.util.*;
public class minimizesum {
   public static void main(String[] args) {
       int arr[]={1,3,7,5,6};

       int N=arr.length;
       System.out.print(minimizeSum(arr,N));
   }

   

static long minimizeSum(int arr[], int N) {
    PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
    int i,sum=0;
    for( i=0;i<N;i++){
        pq.add(arr[i]);
    }
    while(pq.size()>1){
        int min=pq.poll();
        int secondmin=pq.poll();
        sum=sum+min+secondmin;
        pq.add(min+secondmin);
    }
    return sum;
}
}
