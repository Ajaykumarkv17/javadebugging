public class ArrayPali {


    static int mini(int arr[]){
        int ans=0;
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i]==arr[j]){
                i++;j--;
            }
            else if(arr[i]>arr[j]){
                j--;
                arr[j]=arr[j]+arr[j+1];
                ans++;
               
            }
            else{
                i++;
                arr[j]=arr[i]+arr[i-1];
                ans++;
                
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,9,5,4,1};
        int ans=mini(arr);
        System.out.println(ans);
    }
}
