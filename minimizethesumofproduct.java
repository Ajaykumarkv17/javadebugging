public class minimizethesumofproduct {
    public static void main(String[] args) {
        int arr1[]={3,1,1};
        int arr2[]={6,5,4};
        int sum=0;
        int j=arr2.length-1;
        for (int i = 0; i < arr1.length; i++) {
            sum=sum+(arr1[i]*arr2[j--]);
        }
        System.out.print(sum);
    }
}
