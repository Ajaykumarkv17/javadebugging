public class excel{
    public static void main(String[] args) {
        String s="AA";
        int ans=calc(s);
        System.out.println(ans);

    }
    static  public int calc(String s) {
        int ans=0;
        int n=s.length();
        int abc[]=new int[27];
        int start=1;
        for(int i=0;i<abc.length;i++){
            
            abc[i]=start++;
        }
        int j=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            ans=ans+(abc[ch-65])*(int)Math.pow(26,j);
            j++;
            
            
        }
        return ans;
}
}