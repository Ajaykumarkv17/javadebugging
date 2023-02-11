public class kadanealgo {
    public static void main(String[] args) {
        int arr[]={6,4,10,-3,-4,9};
        int  n=arr.length;


        int a=kadane(arr,n);
        System.out.print(a);
    }
    static int kadane(int arr[],int n){
        int curr=arr[0];
        int max=arr[0];
        for (int i = 1; i < n; i++) {
            
                curr=Math.max(arr[i], curr+arr[i]);
                max=Math.max(max,curr);

            }
            return max;
        
    }
}
