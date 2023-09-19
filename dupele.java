public class dupele {
    public static void main(String[] args) {
        int arr[]={3,5,6,7,8,8,8,7,2,1,2,3,3,3,4,5,6,4,5,7};
        int n=arr.length;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            //vis[i]=true;
            int count=1;
            if(vis[i]==true){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    vis[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" occurs "+count+" times ");
        }
    }
}
