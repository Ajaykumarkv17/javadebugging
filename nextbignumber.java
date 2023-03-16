import java.util.Arrays;

public class nextbignumber {
    public static void main(String[] args) {
        int arr[]={6,4,8,1,2};
        int n=arr.length;
        int dup[]=new int[n];
        for (int i = 0; i < dup.length; i++) {
            dup[i]=arr[i];
        }
        Arrays.sort(dup);    //{1,2,4,6,8}
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+"->");
            int max=-1;
            for(int k=0;k<dup.length;k++){
                if(arr[j]==dup[k]&&k!=n-1){
                    max=k+1;
                    break;
                }
            }
            System.out.print(max==-1?" ":dup[max]);
            if(j<n-1){
                System.out.print(",");
            }

        }

    }
}
