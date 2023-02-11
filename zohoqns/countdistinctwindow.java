//{ Driver Code Starts
    import java.util.*;
    import java.io.*;
    import java.util.HashMap;
    
    public class countdistinctwindow
    {
        public static void main(String args[])
        {
            //Scanner sc = new Scanner(System.in);
            //int t = sc.nextInt();
            
            
                //int n = sc.nextInt();
               // int k = sc.nextInt();
               // int a[] = new int[n];
               // for (int i = 0; i < n; i++) 
                 //   a[i] = sc.nextInt();
                //Solution g = new Solution();
                int a[]={1 ,2 ,1, 3 ,4 ,2, 3};
                int n=a.length;
                int k=4;

                
                ArrayList<Integer> ans = new ArrayList<Integer>(countDistinct(a, n, k));
    
                for (Integer val: ans) 
                    System.out.print(val+" "); 
                System.out.println();
        }   
            
        
    
    // } Drier Code Ends
    
    
    
        static ArrayList<Integer> countDistinct(int A[], int n, int k)
        {
            ArrayList<Integer>a=new ArrayList<Integer>();
            HashMap<Integer,Integer>hm=new HashMap<>();
            for(int i=0;i<k;i++){
                if(!hm.containsKey(A[i])){
                    hm.put(A[i],1);
                }
                else{
                    hm.put(A[i],hm.get(A[i])+1);
                }
            }
            a.add(hm.size());
            for(int i=k;i<n;i++){
                if(hm.get(A[i-k])>1){
                    hm.put(A[i-k],hm.get(A[i-k])-1);
                   if(!hm.containsKey(A[i])){
                    hm.put(A[i],1);
                }
                else{
                    hm.put(A[i],hm.get(A[i])+1);
                } 
                }
                else{
                    hm.remove(A[i-k]);
                    if(!hm.containsKey(A[i])){
                    hm.put(A[i],1);
                }
                else{
                    hm.put(A[i],hm.get(A[i])+1);
                }
                }
                a.add(hm.size());
            }
            return a;
        }
    }
    
    
