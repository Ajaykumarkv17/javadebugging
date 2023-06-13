

//Divide by Incremental Groups.


public class potd2 {
    public static void main(String[] args) {
    int N = 8;
    int K = 4;
 
    System.out.println(countWaystoDivide(N, K));
    }
    static int countWaystoDivide(int n, int k)
    {
      if (n < k)
        return 0; // When n is less than k, No way to divide
      // into groups
   
      int [][]dp = new int[n+1][k+1];
      for (int i = 1; i <= n; i++)
        dp[i][1]
        = 1; // exact one way to divide n to 1 group
      dp[0][0] = 1;
   
      for (int i = 1; i <= n; i++) {
        for (int j = 2; j <= k; j++) {
          if (i >= j)
            dp[i][j] = dp[i - j][j] + dp[i - 1][j - 1];
          else
            dp[i][j]
            = dp[i - 1][j - 1]; // i<j so dp[i-j][j]
          // becomes zero
        }
      }
      return dp[n][k]; // returning number of ways to divide N
      // in k groups
    }
}
