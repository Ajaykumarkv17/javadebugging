import java.util.*;
public class minstack{

    static class MinStack {

        Stack<Integer>st,min,max;
          MinStack() {
             st=new Stack<>();
             min=new Stack<>();
             max=new Stack<>();
  
          }
  
          // Function to add another element equal to num at the top of stack.
          void push(int num) {
              st.push(num);
              if(min.isEmpty()||min.peek()>=num){
                  min.push(num);
              }
              if(max.isEmpty()||max.peek()<=num){
                max.push(num);
              }
          }
  
          // Function to remove the top element of the stack.
          int pop() {
              if(!min.isEmpty()&&min.peek()==st.peek()){
                  min.pop();
                
              }
              if(!max.isEmpty()&&max.peek()==st.peek()){
                  max.pop();
                
              }

              int ret=-1;
              if(!st.isEmpty()){
                  ret=st.peek();
                  st.pop();
                  
              }
              return ret;
              
  
          }
  
          // Function to return the top element of stack if it is present. Otherwise
          // return -1.
          int top() {
              int ans=-1;
              if(!st.isEmpty()){
                  ans=st.peek();
              }
              return ans;
          }
  
          // Function to return minimum element of stack if it is present. Otherwise
          // return -1.
          int getMin() {
              int ans=-1;
              if(!min.isEmpty()){
                  ans=min.peek();
              }
              return ans;
  
          }
          int getMax(){
            int ans=-1;
                if(!max.isEmpty()){
                    ans=max.peek();
                }
            return ans;
          }
      }
     
    
    public static void main(String[] args){
            MinStack m=new MinStack();
            m.push(5);
            m.push(10);
            m.push(45);
            int ans1=m.pop();
            int ans2=m.top();
            int ans3=m.getMin();
            int ans4=m.getMax();
            System.out.print(ans1+" "+ans2+" "+ans3+" "+ans4);



    }
}