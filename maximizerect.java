public class maximizerect {
    public static void main(String[] args) {
        int arr[][]={{-1,2},{2,4}};
        int n=arr.length;
        int m=arr[0].length;
        int sum=maxi(arr,n,m);
        System.out.println(sum);
    }
    public static int maxi(int[][] arr, int n, int m)
    {
    
       int maxSum = Integer.MIN_VALUE;

       int temp[]=new int[n];
       for(int left=0;left<m;left++){
           for(int i=0;i<n;i++){
               temp[i]=0;
           }
           for(int right=left;right<m;right++){
                 for (int i = 0; i < n; i++)
                {
                    temp[i] += arr[i][right];
                }
                int sum=kadane(temp,n);
                if(maxSum<sum){
                        maxSum=sum;
                }
           }
       }
        return maxSum;
    }
    public static int kadane(int[] arr, int n)
    {
        int sum = 0;

        int maxSum = Integer.MIN_VALUE;

        // Traverse the array.
        for (int currIndex = 0; currIndex < n; currIndex++)
        {
            sum += arr[currIndex];

            if (maxSum < sum)
            {
                maxSum = sum;
            }

            if (sum < 0)
            {
                sum = 0;
            }
        }

        return maxSum;
    }
}
