public class sstockbuyandsell {
    public static void main(String[] args) {
        int prices[]={7,1,2,4,6,4};
        int n=prices.length;
        int ans=convert(prices,n);
        System.out.print(ans);
    }
    static int convert(int prices[],int n){


        int mini=prices[0];
        int cost=0;
        int profit=0;
        for(int i=1;i<n;i++){
            cost=prices[i]-mini;
            profit=Math.max(profit, cost);
            mini=Math.min(mini, prices[i]);
                }
        return profit;
    }
}
