public class maximizenoofones {
    public static void main(String[] args) {
        int arr[]={1,0,1};
        int n=arr.length;
        int m=1;
        int x=findZeroes(arr,n,m);
        System.out.print(x);
    }
    static int findZeroes(int arr[], int n, int m) {
        int left=0,right=0;
        int maxCount=0,zeros=0;
        //make a window to slide ....
        while(right<n){
            if(zeros<=m){
                if(arr[right]==0)//if you encounter zero at the forward position then zeros++ and right++
                    zeros++;
                    right++;
                    
                
            }
            if(zeros>m){
                if(arr[left]==0)//if you encounter zero at the backward position then zeros-- and left++
                   zeros--;
                    left++;
                    
                
            }
            //return the maximum count 
            if(right-left>maxCount&&zeros<=m){
                maxCount=right-left;
            }
                
        }
        return maxCount;
}
}
