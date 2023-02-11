//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class maximumwithoutadjacents {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
           int dp[]=new int[n];
           dp[0]=arr[0];
           int neg=0;
           for(int i=1;i<n;i++){
               int take=arr[i];
               if(i>1){
                   take=take+dp[i-2];
               }
               int nottake=0+dp[i-1];
               dp[i]=Math.max(take,nottake);
           }
           return dp[n-1];
    }
}