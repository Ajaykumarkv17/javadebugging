//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

public class subset {
	public static void main(String[] args) throws IOException
	{
            long a1[]={3231 ,53858, 19, 5, 59, 498, 520, 7, 9, 10, 11, 12};
            long a2[]={7 ,498 ,59, 10, 520 ,12};
            int n=a1.length;
            int m=a2.length;
            
            
            
            
            
            
            
            
            
            System.out.println(isSubset( a1, a2, n, m));
            
        }
	


// } Driver Code Ends


//User function Template for Java



    static String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Long>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(a1[i])){
                hm.put(a1[i],(long)1);
                
            }
            else{
                hm.put(a1[i],hm.get(a1[i])+1);
            }
        }
        for(int j=0;j<m;j++){
            if(!hm.containsKey(a2[j]) ){
                return "No";
            }
            else if(hm.containsKey(a2[j])){
                  hm.put(a2[j], hm.get(a2[j])-1);
                  
              }
              if(hm.get(a2[j])==0){
                  hm.remove(a2[j]);
              }
  }
             return "Yes";
}
}