import java.util.*;
import java.io.*;
import java.lang.*;
public class paranthesischecker {
    
        static boolean cmp(char a,char b){
            if(a=='{' &&b=='}')
             return true;
            else if(a=='('&&b==')')
             return true;
            else if(a=='['&&b==']')
             return true;
        
             return false;}
        
         static boolean ispar(String x)
        {
            Stack<Character> s1=new Stack<>();
            for (int i=0;i<x.length();i++){
                if(x.charAt(i)=='{'||x.charAt(i)=='('||x.charAt(i)=='['){
                    s1.push(x.charAt(i));
                }
                else if(x.charAt(i)=='}'||x.charAt(i)==')'||x.charAt(i)==']'){
                    if(s1.isEmpty()==true||!cmp(s1.peek(),x.charAt(i))){
                        return false;
                    }
                    else
                        s1.pop();
                    
                }
            }
            if(s1.isEmpty()==true){
                return true;
            }
            else{
                return false;
            }
        }


   public static void main(String[] args)
{
                  System.out.println(ispar("{{[][][]}}"));
}
}
