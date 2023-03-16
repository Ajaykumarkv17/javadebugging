public class decodinglength {
    public static void main(String[] args) {
        String s="a3b2c7";
        int n=s.length();
        char ch=s.charAt(0);
        int count=0;
        for (int i = 1; i < n; i++) {
            if(s.charAt(i)>=48&&s.charAt(i)<=57){
                count=s.charAt(i)-48;
            }
            while(count>0){
                System.out.print(ch);
                count--;
            }
             ch=s.charAt(i);

        }
    }
}
