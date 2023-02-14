public class wavearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        wavearray(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void wavearray(int[] arr, int n){
            for(int i=0;i<n-1;i=i+2){
                    if(arr[i]<arr[i+1]){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
            }
    }
   
      
    
}
