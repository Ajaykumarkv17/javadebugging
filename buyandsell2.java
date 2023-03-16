import java.util.*;
public class buyandsell2 {
    public static void main(String[] args) {
        int prices[]={1,2,7,6,6,5,4,3,5,2};
        long ans=buyandsell(prices);
        System.out.print(ans);
    }
    static  long buyandsell(int Arr[]){
             //Write your code here
    int n=Arr.length;
    long dp[][]=new long[n+1][2];
    for(long row[]: dp)
    Arrays.fill(row,-1);
    
    //base condition
    dp[n][0] = dp[n][1] = 0;
    
    long profit=0;
    
    for(int ind= n-1; ind>=0; ind--){
        for(int buy=0; buy<=1; buy++){
            if(buy==0){// We can buy the stock
                profit = Math.max(0+dp[ind+1][0], -Arr[ind] + dp[ind+1][1]);
            }
    
            if(buy==1){// We can sell the stock
                profit = Math.max(0+dp[ind+1][1], Arr[ind] + dp[ind+1][0]);
            }
            
            dp[ind][buy]  = profit;
        }
    }
    return dp[0][0];

    }
}
