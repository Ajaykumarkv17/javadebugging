import java.util.*;


public class countpairs{
    static int countpair(int arr[],int n,int x){
             int count=0; 
             HashMap<Integer,Integer> hm=new HashMap<>();
             for(int i=0;i<n;i++){
                int diff=x-arr[i];
                if(hm.containsKey(diff)){
                    count=count+hm.get(diff);
                }
                hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);

             }           




        return count;
    }
    public static void main(String[] args) {
        int arr[]={7,5,6,2,1,7,8};
        int n=arr.length;
        int x=10;
        System.out.println(countpair(arr,n,x));
    }
}

