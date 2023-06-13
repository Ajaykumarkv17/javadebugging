public class potd25 {
    public static void main(String[] args){
        int X=2;
        String S="000011101";
        int N=S.length();
        Boolean b=convert(N,S,X);
        System.out.println(b);
    }
    static boolean convert(int N, String S, int X) 
    { 
        boolean ans=false;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='1'){
                ans=true;
                continue;
            }
            if(S.charAt(i)=='0'){
                int left=i-X;
                int right=0;
                if(i<N-3){
                     right=i+X;
                }
                if(S.charAt(left)=='1'||S.charAt(right)=='1'){
                    ans=true;
                    continue;
                }
                else{
                    ans=false;
                    break;
                }
            }
        }
        return ans;
    }
}
