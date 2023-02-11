public class editdistance {
    public static void main(String[] args) {
        String a="ABCDJU";
        String b="BCDKIL";
        int ans=editDistance(a,b);
        System.out.print(ans);


    }
        static public int editDistance(String s, String t) {
            int n=s.length();
            int m=t.length();
            int[][] dp=new int[n+1][m+1];
            for(int i=0;i<=n;i++)
            dp[i][0]=i;
            for(int j=0;j<=m;j++)
            dp[0][j]=j;
            for(int i=1;i<n+1;i++){
                for(int j=1;j<m+1;j++){
                    if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=0+dp[i-1][j-1];
                    else
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
            return dp[n][m];
            
    }
}
