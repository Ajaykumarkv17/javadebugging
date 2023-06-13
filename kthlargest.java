import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthlargest {
    static int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n-k;i++){
            pq.add(arr[i]);
        }
        if(pq.isEmpty()){
            ArrayList<Integer> A=new ArrayList<>();
            int ans[]=new int[k];
            for(int i:arr){
                A.add(i);
            }
            Collections.sort(A,Collections.reverseOrder());
            int in=0;
            for(int i:A){
                ans[in++]=i;
            }
            return ans;
        }
        for(int i=n-k;i<n;i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer> A=new ArrayList<>();
        int ans[]=new int[k];
        int in=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=pq.peek())
            A.add(arr[i]);
        }
        Collections.sort(A,Collections.reverseOrder());
        for(int i:A){
            if(in<k)
            ans[in++]=i;
            else break;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={12,5,7,187,23};
        int n=arr.length;
        int k=2;
        int ans[]=kLargest(arr, n, k);
        System.out.println(ans[0]+"  "+ans[1]);
    }
}
