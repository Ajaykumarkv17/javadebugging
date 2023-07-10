import java.util.List;
import java.util.*;
public class generpar {
     public static List<String> genpar(int n){
                List<String> ans=new ArrayList<String>();
                String s="";
                backtrack(s,0,0,ans,n);
                return ans;
    }
    public  static void backtrack(String s,int openb,int closeb,List<String>ans,int n){
        if(openb==n&&closeb==n){
            ans.add(s);
        }
        if(openb<n){
            backtrack(s+"(",openb+1,closeb,ans,n);
        }
        if(closeb<openb){
            backtrack(s+")",openb,closeb+1,ans,n);
        }
    }
    public static void main(String[] args){
            int n=3;
            List<String> ans=genpar(n);
            for(String i:ans){
                System.out.print(i+" ");
            }
    }
   
}
