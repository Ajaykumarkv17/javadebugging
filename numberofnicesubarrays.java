public class numberofnicesubarrays {


    static int find(int arr[],int k){
        int ans=0;
        int i=0;
        int j=0;
        int left=0;
        int oddcount=0;
        int temp=0;
        while(j<arr.length){
            if(arr[j]%2==1){
                oddcount++;
                temp=0;

            }
            while(oddcount==k){
                temp++;
                if(arr[left]%2==1){
                    oddcount--;
                }
                left++;
            }
            ans+=temp;
            j++;
        }






        return ans;
    }
    public static void main(String[] args){
            int arr[]={1,1,1,4};
            int k=3;
            int ans=find(arr,k);
            System.out.print(ans);

    }
}
