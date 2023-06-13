public class secondsmallest {
    public static void main(String[] args) {
        int arr[]={3,7,1,4,5,89};
        int n=arr.length;
        int ans=findsec(arr,n);
        System.out.println(ans);
    }
    static int findsec(int arr[],int n){
        int res=Integer.MAX_VALUE;
        int firstmini=arr[0];
        for(int i=0;i<n;i++){
            if(firstmini>=arr[i]){
                firstmini=arr[i];
            }
        }   
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=firstmini&&arr[i]<=res){
                res=arr[i];
            }
        }




        return res;
    }
}
