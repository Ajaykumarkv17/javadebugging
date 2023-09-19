public class countandsay {
    public static void main(String[] args) {
        int n = 10;  
        convert(n);
        //System.out.println();
    }

    static void convert(int n) {
        
           System.out.println(1);
           String s="1";
           int i=1;
           while(i<n){
            String nw="";
            int count=1;
            char ch=s.charAt(0);
            for(int j=1; j<s.length(); j++){
                if(s.charAt(j)!=s.charAt(j-1)){
                    System.out.print(count+" "+ch+" ");
                    nw+=count+""+ch;
                    ch=s.charAt(j);
                    count=1;

                }
                else{
                    count++;
                }
            }
            System.out.println(count+" "+ch);
            nw+=count+""+ch;
            s=nw;
            i++;





           }
        
    }
}
