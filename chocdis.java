//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class chocdis {
    public static void main(String[] args) {

        int n = 5;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(7);
        arr.add(12);

        arr.add(10);

        arr.add(6);

        int m = 3;
        long ans = findMinDiff(arr, n, m);
        System.out.println(ans);

    }

    // } Driver Code Ends

    // User function Template for Java

    static public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        long ans=Integer.MAX_VALUE;
        int start=0;
        int end=m-1;
        while(end<n){
            int diff=a.get(end)-a.get(start);
            ans=Math.min(diff,ans);
            start++;
            end++;
        }
        
        


        return ans;

    }
}