public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[]={1,0,1};
        int n=arr.length;
        int k=1;
        int ans =longestOnes(n, arr, k);
        System.out.println(ans);
    }
    public static int longestOnes(int n, int[] arr, int k) {
        int left=0;
        int right=0;
        int maxcount=0;
        int zeros=0;
        while(right<n){
            if(zeros<=k){
                if(arr[right]==0)
                    zeros++;
                    right++;
                
            }
            if(zeros>k){
                if(arr[left]==0)
                    zeros--;
                    left++;
                
            }
            if(right-left>maxcount&&zeros<=k){
                maxcount=right-left;
            }
        }
        return maxcount;
}
}
