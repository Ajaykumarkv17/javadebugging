

import java.util.*;
public class minimizesum {
    public static void main(String[] args) {
       
       int arr[]={1,3,7,5,6};
       int n=arr.length;
       int ans=convert(arr,n);
       System.out.println(ans);

    }
    static int convert(int[] arr,int n) {
        int sum=0;
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        while(queue.size()>1){
            int min=queue.poll();
            int smin=queue.poll();
            sum=sum+min+smin;
            queue.add(min+smin);

        }
        return sum;
    }
}
