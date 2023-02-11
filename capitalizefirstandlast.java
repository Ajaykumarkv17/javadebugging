import java.io.*;
import  java.util.*;

public class capitalizefirstandlast {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String : "); 
        String s = sc.nextLine();
        String newstr = "";
   
        String[] str = s.split("\\s"); // splitting sentence into word converted to String array
   
       for (String string : str) {     
         int length = string.length();
         String firstchar = string.substring(0, 1);
         String restchar = string.substring(1, length - 1);
         String lastchar = Character.toString(string.charAt(length - 1));
         newstr = newstr+firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
       } 
       System.out.println(newstr); 
    }
}
