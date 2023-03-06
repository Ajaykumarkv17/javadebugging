import java.util.*;


public class delmiddleofstack{
   static void modifiedstack(Stack<Integer> s,int n){
        int size=s.size();
        int middle=size/2;
        Stack<Integer>stc=new Stack<Integer>();
        for(int i=0;i<middle;i++)
        {
            stc.push(s.pop());
        }
        s.pop();
        while(!stc.isEmpty())
        {
            s.push(stc.pop());
        }
        
    }
    public static void main(String[] args) {
      Stack<Integer>st=new Stack<Integer>();
     int n=st.size();
      
      st.push(5);
      st.push(6);
      st.push(7);
      st.push(8);
      
      modifiedstack(st,n);
      for(int i=0;i<st.size();i++){
        System.out.print(st.get(i)+" ");
      }



      
    }
}
