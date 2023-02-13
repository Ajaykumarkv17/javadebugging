public class rowwithmax1 {
    public static void main(String[] args) {
        int arr[][]={{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
        int n=arr.length;
        int m=arr[0].length;
        int ans=rowWithMax1s(arr, n, m);
        System.out.println(ans);
    }
    static int rowWithMax1s(int a[][], int n, int m) {
        int maxSoFar= 0;
        int index=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=m-1;j>=0;j--){
                if(a[i][j]==0){
                    break;
                }else{
                    count++;
                }
            }
            if(count> maxSoFar){
                maxSoFar= count;
                index=i;
            }
            if(maxSoFar==m) break;
        }
        return index;
    }
}
