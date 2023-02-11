public class findmissandrepeat {
    public static void main(String[] args) {
        int arr[]={2,6,6,4,5,1};
        int n=arr.length;
        int []a=findTwoElement(arr,n);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
   static int[] findTwoElement(int arr[], int n) {
        int temp[]=new int[n+1];
        for(int i=0;i<n;i++){
            temp[arr[i]]++;
        }
        int ans[]=new int[2];
        for(int i=1;i<=n;i++){
            if(temp[i]==2){
                ans[0]=i;
            }
            if(temp[i]==0){
                ans[1]=i;
            }
        }
        return ans;
        
    }
}
