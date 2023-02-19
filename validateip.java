import java.util.*;
public class validateip {
    public static void main(String[] args) {
        String s;
        System.out.print("Enter an ip address");
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        sc.close();
        if(validateip(s)==true){
            System.out.println("valid ip address");
        }
        else{
            System.out.println("not an valid ip address");
        }


    }
    static boolean validateip(String s){
        String ans[]=s.split("[.]" );
        if(ans.length>4){
            return false;
        }
        for(String str:ans){
            if(str.length()>1&&str.charAt(0)=='0'){
                    return false;
            }
            try{
                int num=Integer.parseInt(str);
                if(num<0 || num>255)return false;
                }
                catch(Exception e){
                    return false;
                }
        }
        return true;
    }
}
