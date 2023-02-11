public class selectionsort {
    public static void main(String[] args) {
        int arr[]={56,78,9,94,17};
        int n=arr.length;
        selections(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int[] selections(int arr[],int n){
         for(int i=0;i<n;i++){
            int minindex=i;
            int min=arr[i];
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    minindex=j;
                    min=arr[j];
                }}
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;}

            
         
       return arr;
    }
}
