public class minimumnoofjumps {
    public static void main(String[] args) {
        int arr[]={1,4,6,3,2,1,4,3,2,1,3,2,7};
        int n=arr.length;
        int ans=minjumps(arr,n);
        System.out.print(ans);
    }
    static  int minjumps(int arr[], int n) {
        if(n<=1){
            return 0;
        }
        int max=arr[0];
        int step=arr[0];
        int jump=1;
        for(int i=1;i<n;i++){
            if(i==n-1){
                return jump;
            }
            max=Math.max(max, i+arr[i]);
            step--;
            if(step==0){
                jump++;
                if(i>=max){
                   return -1; 
                }
                step=max-i;
            }
        }
        return -1;
    }

}
