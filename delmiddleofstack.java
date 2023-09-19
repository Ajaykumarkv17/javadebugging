import java.util.*;


public class delmiddleofstack{
   static void modifiedstack(Stack<Integer> s,int n){
        int size=s.size();
        int middle=size/2;
        Stack<Integer>stc=new Stack<Integer>();
        //stack value is 5,6,7,8
        for(int i=0;i<middle;i++)
        {
            stc.push(s.pop());  //STC VALUE:8,7 //stack value is 5,6 
        }
        s.pop();//the desired elemnt got deleted
        while(!stc.isEmpty())
        {
            s.push(stc.pop());//stack value is 5,7,8
        }
        
    }
    public static void main(String[] args) {
      Stack<Integer>st=new Stack<Integer>();
     int n=st.size();
      
      st.push(5);
      st.push(6);
      st.push(7);
      st.push(8);
      
      modifiedstack(st,n);//5 6 7 8
      for(int i=0;i<st.size();i++){
        System.out.print(st.get(i)+" ");
      }



      
    }
}
