public class oddeven{
    
    public static void main(String[] args) {
        
        
        int arr[]={4,6,89,11,22,33};
        int odd[]=new int[arr.length];
        int even[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[i]=arr[i];
            }
            else{
                odd[i]=arr[i];
            }
        }
        for(int i=0;i<even.length;i++){
            if(even[i]==0){
                continue;
            }
            System.out.print(even[i]+" ");
        }
       
    }
}