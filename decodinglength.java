public class decodinglength {
    public static void main(String[] args) {
        String s="a3b28c12";
        int n=s.length();
        char ch=s.charAt(0);
        int count=0;
        int j=1;
        int i=0;
        while(i<s.length()) {
            ch=s.charAt(i);
            i++;
            while((i<s.length())&&s.charAt(i)>=48&&s.charAt(i)<=57){
                count=(count*10)+s.charAt(i)-48;
                i++;
            }

            
            //j++;
            while(count>0){
                System.out.print(ch);
                count--;
            }
             

        }
    }
}
