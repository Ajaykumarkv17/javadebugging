public class differencepairs{
    static int calculatepair(int arr[],int diff,int n){
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]-arr[j]==diff||arr[j]-arr[i]==diff){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,4,10,7,0,3};
        int diff=3;
        int n=arr.length;
       int a= calculatepair(arr,diff,n);
       System.out.println(a);

    }
}