public class specialarray{
    public static void main(String[] args){
        int arr[]={1,2,4,8,16};
        int n=arr.length;
        int ans=special(arr,n);
        System.out.println(ans);
 
    }
    public static int special(int arr[], int n) {
        int flag=0;
         for(int i=0;i<n;i++){
            int sum=arr[0];
            int j=i;
            while(j>0){
                sum=sum+arr[j];
                j--;
            }
            if(i+1==n){
                break;
            }
            if(sum<=arr[i+1]){
                 flag=1;
                 
            }
            else{
                flag=0;
                break;

            }
         }
         return flag ;
     }
}