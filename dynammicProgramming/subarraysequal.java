import java.util.*;
public class subarraysequal {
    public static int subArraySum(int[] arr, int n, int k)
    { 
        //code here.
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={4,9,20,10,3,5};
        int n=arr.length;
        int k=33;
        System.out.print(subArraySum(arr, n, k));
    }
}
