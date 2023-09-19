public class smallestsubarraywithgreaterthank {

   static int smallestSubWithSum(int arr[],int n,int  x){
    int ans=0;
    int start=0,end=0;
    int min_len=n+1;
    int curr_sum=0;
    while(end<n){
        while(curr_sum<=x&&end<n){
            curr_sum+=arr[end++];
        }
        while(curr_sum>x&&start<n){
            if(end-start<min_len){
                min_len=end-start;
            }
            curr_sum-=arr[start++];
        }
    }



    return min_len;
   }

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 19};
        int x = 51;
        int n = arr.length;
        int res = smallestSubWithSum(arr, n, x);
        if(res==n+1){
            System.out.println("NOT POSSIBLE");
        }
        else{
            System.out.println(res);
        }
    }
}
