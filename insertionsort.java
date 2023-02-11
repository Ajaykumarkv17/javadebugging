public class insertionsort {
    static void sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
                else{
                    break;
                }
        }
    }
    }
    public static void main(String[] args){
        int[] arr={6,77,54,31,90,66,78};
        sort(arr);
        System.out.println("after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
