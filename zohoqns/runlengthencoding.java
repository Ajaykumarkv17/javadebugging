public class runlengthencoding {
    public static void main(String[] args) {
        String s="aaaabbbbbccccc";
        String b=encode(s);
        System.out.print(b);
    }
   static String encode(String str)
	{
	     String s="";
         for(int i=0;i<str.length();i++){
             int count=1;
             char ch=str.charAt(i);
             while(i<str.length()-1&&ch==str.charAt(i+1)){
                 count++;
                 i++;
             }
              s=s+str.charAt(i)+count;
             
             
         }
         return s;
	}
	
}
