import java.util.*;
public class intersectionoftwoarrays {
    public static void main(String[] args) {
        int arr[]={4,6,7,1,2};
        int arr2[]={4,10,5,1,3};
        int ans=intersect(arr,arr2);
        System.out.println(ans);
    }
    static public int intersect(int[] arr, int[] arr2){
            int count=0;
            HashSet hs=new HashSet();
            for(int i=0;i<arr.length;i++){
                hs.add(arr[i]);
            }
            for (int j = 0; j < arr2.length; j++) {
                if(hs.contains(arr2[j])){
                        count++;
                }
            }
            return count;



    }
}
