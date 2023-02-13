import java.util.*;
public class majorityelement {
    public static void main(String[] args) {
        int arr[]={3,3,3,2,1};
        int size=arr.length;
        int ans=majorityElement(arr, size);
        System.out.print(ans);
    }
    static int majorityElement(int arr[], int size)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<size;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }
        }
        for(int i=0;i<size;i++){
        if(hm.get(arr[i])>size/2){
            return arr[i];
        }}
        return -1;
    }

}
