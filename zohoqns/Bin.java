public class Bin{
    public static void main(String[] args){
        String s="0010";
        int n=s.length();
        int index=n-1;
        int ans=solve(s,index,0);
        System.out.print(ans);
    }
    static int solve(String s,int index,int sum){
        if(index<0){
            return sum;
        }
        int ch=s.charAt(index)-48;
        sum=sum+(ch*(int)Math.pow(2,(s.length()-index)-1));
        return solve(s,index-1,sum);
    }
}