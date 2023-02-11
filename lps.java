//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class lps {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            //String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps("ajaykumar"));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        int n=s.length();
        int[] lps=new int[n];
        int i=0,j=1;
        lps[0]=0;
        while(j<n){
            if(s.charAt(i)==s.charAt(j)){
                lps[j]=i+1;
                i++;
                j++;
            }
            else{
                if(i==0){
                    lps[j]=0;
                    j++;
                }else{
                    i=lps[i-1];
                }
            }
        }
        return lps[n-1];
    }
}