import java.io.*;
public class ArraytoBST {
    static int i=0;
    public static void main(String args[]){
                 int arr[]={1,2,3,4,5,6,7};
                 int n=arr.length;
                 int a[]=convertbst(arr,n);
                 for (int index = 0; index < a.length; index++) {
                      System.out.print(a[index]+" ");    
                 }
    }
    public static int[] convertbst(int arr[],int n){
        int arr2[]=new int[n];
        solve(arr,0,n-1,arr2);
        return arr2;
        
        }
    public static void solve(int[] arr,int l,int r,int arr2[]){
        if(l>r){
            return ;
        }
        int mid=(l+r)/2;
        arr2[i++]=arr[mid];
        solve(arr, l, mid-1, arr2);
        solve(arr, mid+1, r, arr2);

    }
}
