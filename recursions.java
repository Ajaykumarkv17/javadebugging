
//6 functions

//1.PRINTING 1 TO N
//2.PRINTING N TO 1
//3.FACTORIAL OF N
//4.PALINDROMEOFNUMBER 
//5.FIBONACCI SERIES
//6.SUBSEQUENCES
import java.util.*;
public class recursions {

    static void  function_print1ton(int n){
        if(n<1){
            return ;
        }
        function_print1ton(n-1);
        System.out.println(n);
        

    }
    static void  function_printnto1(int n,int i){
        if(n<i){
            return ;
        }
       
        System.out.println(n);
        function_printnto1(n-1,i);
        

    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static Boolean palindrome(String s,int i,int l){
            if(i>=l/2)
                return true;
            
            if(s.charAt(i)!=s.charAt(l-i-1))
                return false;
            return palindrome(s, i+1, l);
            

    }
    static int fib(int n){
        if(n<=1){
            return n;
        }
        int last=fib(n-1);
        int slast=fib(n-2);
        return last+slast;
    }
    static void findsubseq(int ind,int arr[],int n,ArrayList<Integer> subseq){
                if(ind==n){
                    for (Integer it : subseq) {
                        System.out.print(it+" ");
                    }
                    System.out.println(" ");
                    return;
                }
                else{
                //pick or not pick
                subseq.add(arr[ind]);
                findsubseq(ind+1, arr, n, subseq);
                subseq.remove(subseq.size()-1);
                findsubseq(ind+1, arr, n, subseq);
                
            }



    }
    static int fib2(int n){
        int prev=1;
        int prev2=0;
        int curr;
        for(int i=2;i<=n;i++){
            curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;

    }
    public static void main(String[] args) {
     //   int n=7;
        int arr[]={3,1,2};
        //function_print1ton(n);
       //function_printnto1(n,1);
      //  int ans= fact(n);
       // System.out.println(ans);
       //String ex="madwm";
      // int l=ex.length();
      // System.out.println(palindrome(ex,0,l));
      System.out.println(fib2(7));
      //int n=arr.length;
     // ArrayList<Integer>subseq=new ArrayList<>();
     // findsubseq( 0,arr,n,subseq);





      



    }
}
