//{ Driver Code Starts
import java.util.*;
import java.util.Stack;
import java.util.LinkedList;



public class queueusingstack
{
	public static void main(String args[])
	{
	    //Taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//Taking input the number of testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //Creating a new object of class StackQueue
			StackQueue g = new StackQueue();
			
			//Taking input the total number of Queries
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryTyoe = sc.nextInt();
				
				//If QueryTyoe is 1 then
				//we call the Push method
				//of class StackQueue
				//else we call the Pop method
				if(QueryTyoe == 1)
				{
					int a = sc.nextInt();
					g.Push(a);
				}else
				if(QueryTyoe == 2)
				System.out.print(g.Pop()+" ");
			q--;
				
			}
			System.out.println();
		t--;
		}
	}
}


// } Driver Code Ends


class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   if(s2.isEmpty()){
	       if(s1.isEmpty()){
	           return -1;
	       }
	       while(!s1.isEmpty()){
	           int rem=s1.peek();
	           s1.pop();
	           s2.push(rem);
	       }
	       int k=s2.peek();
	       s2.pop();
	       while(!s2.isEmpty()){
	           int l=s2.peek();
	           s2.pop();
	           s1.push(l);
	       }
	       return k;
	   }
	   return -1;
    }
}
