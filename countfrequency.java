import java.util.*;
public class countfrequency {
    public static int[] countfrequency1(int arr[],int N)
    {
        HashMap <Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<N;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
            
        }
        int j=0;
        for(int i=1;i<=N;i++){
            if(hm.containsKey(i)){
                arr[j++]=hm.get(i);
            }
            else{
                arr[j++]=0;
            }
        }
        return arr;
 }
    public static void main(String[] args) {
        int arr[]={7,5,6,2,1,8,7,8};
        int n=arr.length;
        System.out.println(countfrequency1(arr,n));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

