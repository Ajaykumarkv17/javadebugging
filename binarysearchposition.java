public class binarysearchposition {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,2};
        int n=arr.length;
        int k=5;
        int ans=searchInsertK(arr,n,k);
        System.out.println(ans);
    }
    static int searchInsertK(int arr[], int N, int k)
    {
        int low=0;
        int high=N-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    
}
