import java.util.*;
public class mergesort {
    public static void main(String[] args) {
        int arr[]={4,33,5,11,2,37,10,55,7,2,3};
        int n=arr.length;
        int l=0;
        int h=n-1;
        merge(arr,n,l,h);
        for (int index = 0; index < arr.length; index++) {
            
            System.out.print(arr[index]+" ");
        }

    }
    static void merge(int arr[],int n,int l,int h){
                if(l>=h){
                    return;
                }
                int mid=(l+h)/2;
                merge(arr, n, l, mid);
                merge(arr, n, mid+1, h);
                m(arr,n,l,h,mid);
    }
    private static void m(int[] arr,int n, int low, int high, int mid) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
