//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class chocdis
{
    public static void main (String[] args)
    {
        
      
        int n = 5;
        
        
        
            
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(3);
             arr.add(7);
              arr.add(12);

               arr.add(10);

                arr.add(3);

      
            
            
            int m=5;
            long ans=findMinDiff(arr,n,m);
    		System.out.println(ans);
        
        
    }

// } Driver Code Ends


//User function Template for Java



    static public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int start=0,end=0;
        int mind=Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++)
		{
			int diff = a.get(i+m-1) - a.get(i);
			if(mind>diff)
			{
				mind = diff;
				start = i;
				end = i+m-1;
			}
		}
		return a.get(end)-a.get(start);
    }
}