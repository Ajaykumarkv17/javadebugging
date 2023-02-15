public class searchinrotatedarray {
   static int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        int index=-1;
        while(l<=h){
            if(A[l]==key){
                index=l;
                break;
             
            }   l++;
        }return index;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};
        int l=arr[0];
        int h=arr[arr.length-1];
        int key=6;
        int ans=search(arr, 0, arr.length-1, key);
        System.out.println(ans);
    }
}
