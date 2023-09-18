
import java.util.*;

public class mergeoverlappingsubintervals {


    static int[][] mergeinterval(int arr[][]){
        List<int[]>li=new ArrayList<>();
       // int ans[][]=new int[0][];
        int n=arr.length;
     //   if(n==0){
      //      return ans(new int[0]);
      //  }
            int start=arr[0][0];
            int end=arr[0][1];
        for(int[] i:arr){
            if(i[0]<=end){
                end=Math.max(end,i[1]);
            }
            else{
                li.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
        li.add(new int[]{start,end});
      return  li.toArray(new int[0][]);
        


    }
    public static void main(String[] args) {
        int [][] arr={{1,4},{2,6},{3,8},{9,12},{13,17}};
        int ans[][]=mergeinterval(arr);
        for(int[] i:ans){
            System.out.print(i[0]+" "+i[1]);
        }
    }
}
