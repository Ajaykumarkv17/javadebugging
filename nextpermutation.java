import java.util.*;
public class nextpermutation {
    static List<Integer> nextPermutation(int N, int A[]){
        ArrayList<Integer>al=new ArrayList<>();
       
        int i =N-2;
        while(i >= 0 && A[i] >= A[i + 1]) i--; 
        if(i >= 0) {                           
            int j = A.length - 1;              
            while(A[j] <= A[i]) j--;      
            swap(A, i, j);                     
        }
        reverse(A, i + 1, A.length - 1);      
        for(int j=0;j<A.length;j++){
            al.add(A[j]);
        }
        return al;
}

static public void swap(int[] A, int i, int j) {
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
}

static public void reverse(int[] A, int i, int j) {
    while(i < j) swap(A, i++, j--);
}
        public static void main(String[] args) {
            int arr[]={1,3,4,5,2};
            int n=arr.length;
            ArrayList<Integer>a=new ArrayList<>(nextPermutation(n, arr));
            for (Integer integer : a) {
                System.out.print(integer+"  ");
            }
        }
}
