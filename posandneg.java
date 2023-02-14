import java.util.*;
public class posandneg {
   static  void rearrange(int arr[], int n) {
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }
        int i=0,j=0,k=0;
        while(i<pos.size() && j<neg.size()){
            arr[k++]=pos.get(i++);
            arr[k++]=neg.get(j++);
        }
        while(i<pos.size()){
            arr[k++]=pos.get(i++);
        }
         while(j<neg.size()){
            arr[k++]=neg.get(j++);
        }
        
        
        
    }
    public static void main(String[] args) {
        int arr[]={4,6,-7,-8,19,45,-57,1};
        int n=arr.length;
        rearrange(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        

    }
}
