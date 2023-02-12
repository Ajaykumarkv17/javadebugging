import java.util.*;
import java.io.*;
public class notowords {
    public static String converttoword(int n){
        String s=" ";
        HashMap<Integer,String>ones=new HashMap<>();
        ones.put(0, "Zero");
        ones.put(1, "One");
        ones.put(2, "Two");
        ones.put(3, "Three");
        ones.put(4, "Four");
        ones.put(5, "Five");
        ones.put(6, "Six");
        ones.put(7, "Seven");
        ones.put(8, "Eight");
        ones.put(9, "Nine");


         HashMap<Integer,String>tens=new HashMap<>();
         tens.put(10,"Ten");
         tens.put(11,"Eleven");
         tens.put(12,"Twelve");
         tens.put(13,"Thirteen");
         tens.put(14,"Fouteen");
         tens.put(15,"Fifteen");
         tens.put(16,"Sixteen");
         tens.put(17,"Seventeen");
         tens.put(18,"Eighteen");
         tens.put(19,"Nineteen");
         tens.put(20,"Twenty");
         tens.put(30,"Thirty");
         tens.put(40,"Fourty");
         tens.put(50,"Fifty");
         tens.put(60,"Sixty");
         tens.put(70,"Sevenety");
         tens.put(80,"Eighty");
         tens.put(90,"Ninty");

         if(n<10){
            s= ones.get(n);}
         else if(n<100){
            if(n>10 &&n<20){
                s=tens.get(n);
            }
            else{
                s=tens.get((n/10)*10)+" "+ones.get(n%10);
            }
         }
         else if(n<1000){
            s=ones.get(n/100)+" "+"Hundred"+" "+"and"+" "+converttoword(n%100);
         }
         else if(n<10000){
            s=ones.get(n/1000)+" "+"Thousand"+" "+"and"+" "+converttoword(n%1000);
         }
        else if(n<100000){
           s=ones.get(n/10000)+" "+"Thousand "+" "+"and"+" "+converttoword(n%1000);
         }



       
        return s;       
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=sc.nextInt();
       String ans=converttoword(n);
       System.out.print(ans);







    }
}
