public class maxsuminsubarrays {
    public static long pairWithMaxSum(long arr[], long n)
    {
 
       long ans=0;
       for(int i=1;i<n;i++){
           
               ans=Math.max(arr[i]+arr[i-1],ans);
           
       }
       return ans;
    }
    public static void main(String args[]){
        long arr[]={1,9,3,7};
        long n=pairWithMaxSum(arr, arr.length);
        System.out.print(n);

        
    }
}
