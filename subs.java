public class subs {
    public static void main(String[] args) {
        String s="abc";
        String t="ahgdc";
        System.out.println(subse(s,t));
    }
   static  public boolean subse(String s, String t) {
        int first=0;
        int second=0;
        int n=s.length();
        int m=t.length();
        for(int i=0;i<m;i++){
            if(s.charAt(first)==t.charAt(second)){
                first++;
                second++;
            }
            else{
                second++;
            }
            if(first==n){
                return true;
            }
        }
        return false;
    }
}
