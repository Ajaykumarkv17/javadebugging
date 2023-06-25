public class selectionsortex {
    public static void main(String[] args) {
        int arr[]={34,1,4,12,10};
        int n=arr.length;
        selectionsorte(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void selectionsorte(int[] arr, int n){
            for(int i=0;i<n;i++){
                int a=arr[i];
                int min=arr[i];
                int minin=i;
                for(int j=i;j<n;j++){
                        if(min>arr[j]){
                            min=arr[j];
                            minin=j;
                            
                        }
                }
                int temp=arr[i];
                arr[i]=arr[minin];
                arr[minin]=temp;



            }
    }
}
