public class quicksort {
    public static void main(String[] args) {
        int arr[]={4,6,7,8,12,15,17,11,5,2};
        int low=0;
        int high=arr.length-1;
        quickSort(arr,low,high);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void quickSort(int arr[], int low, int high)
    {
        

   if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
            
        }
        
        
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
        while(arr[i]<=pivot&&i<=high-1){
            i++;
        }
        while(arr[j]>pivot&&j>=low){
            j--;
        }
        if(i<j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;}
        }
        int t = arr[j]  ; 
         arr[j] = arr[low]  ; 
         arr[low] = t ; 
         return j;
    } 
}
