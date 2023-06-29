import java.util.*;
import java.lang.*;
public class sorting {
    public static ArrayList<Integer> customsort(Integer[] arr,int n){
                   ArrayList<Integer>res=new ArrayList<>();
                   int low=0;
                   int high=n-1;
                   for (int i = 0; i < arr.length; i++) {
                         res.add(arr[i]);
                         if(i==arr.length/2){break;}
                         res.add(arr[n-i-1]);
                }
                  
                   
                   

                   

        return res;
    }
    public static void main(String[] args) {
        Integer arr[]={1,8,6,3,4,9};
        Arrays.sort(arr, Collections.reverseOrder());
        int n=arr.length;
        ArrayList<Integer>a=new ArrayList<Integer>(customsort(arr, n));
        for (Integer i : a) {
            System.out.print(i+" ");
        }
    }
}
