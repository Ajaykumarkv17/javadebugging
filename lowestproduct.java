import java.util.*;

public class lowestproduct {
   
    public static void main(String[] args) {
        int prod=0;
        int arr[]={1,-5,-2,10,11};
        int n=arr.length;
        int b[]=new int[3];
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(j==1){
                        prod=arr[i]*arr[j]*arr[k];
                  
                        b[0]=arr[i];
                        b[1]=arr[j];
                        b[2]=arr[k];
                        
                    }
                    if(arr[i]*arr[j]*arr[k]<prod){
                        prod=arr[i]*arr[j]*arr[k];
                       
                        b[0]=arr[i];
                        b[1]=arr[j];
                        b[2]=arr[k];
                       
                    }
                }
            }
         
        }
           for (int j = 0; j < b.length; j++) {
                System.out.print(b[j]+" ");
            }
    }
}
