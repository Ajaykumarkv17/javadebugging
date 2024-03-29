public class longestpalindromicsubsquence {

   static  public int find(String A)
    {
        int n = A.length();
        
        StringBuilder st = new StringBuilder();
        st.append(A);
        st.reverse();
        
        String B = st.toString();
        
        // a palindrome reads the same from front and reverse.
        // hence, the longest palindromic subsequence is
        // basically the longest common subsequence in
        // A and reverse(A)
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; ++i)
        {
            for (int j = 0; j <= n; ++j)
            {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else
                {
                    if (A.charAt(i - 1) == B.charAt(j - 1))
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    else
                        dp[i][j] = Math.max (dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][n];
    }
 public static void main(String[] args){
    String s1="abbaaabca";
    int ans=find(s1);
    System.out.println(ans);

 }
}
