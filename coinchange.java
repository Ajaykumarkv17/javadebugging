public class coinchange {
    public static void main(String[] args) {
        int sum=4;
        int coins[]={1,2,3};
        int dp[]=new int[sum+1];
        dp[0]=1;
        for(int i=0; i<coins.length; i++){
            for(int j=coins[i];j<=sum;j++){
                dp[j]=dp[j]+dp[j-coins[i]];
            }
        }
        System.out.print(dp[sum]);
    }
}
