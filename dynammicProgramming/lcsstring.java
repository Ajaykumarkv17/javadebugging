public class lcsstring {
    public static void main(String[] args) {
        String a="ABCDJU";
        String b="BCDKIL";
        int ans=lcs(a,b);
        System.out.print(ans);
    }
    static int lcs(String s1, String s2)
    {
            int n=s1.length();
            int m=s2.length();
            int dp[][]=new int[n+1][m+1];
            for(int j=0;j<=m;j++) dp[0][j]=0;
            for(int i=0;i<=n;i++) dp[i][0]=0;
            for(int i=1;i<n+1;i++){
                for(int j=1;j<m+1;j++){
                    if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[n][m];
    }
}
