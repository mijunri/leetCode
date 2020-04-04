package leetcode;

public class T322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i = 0; i < coins.length; i++){
            if(coins[i] <= amount){
                dp[coins[i]] = 1;
            }
        }
        for(int i = 1; i <= amount; i++){
            if(dp[i] == 0){
                int min= Integer.MAX_VALUE;
                for(int coin:coins){
                    if(i-coin<=0 || dp[i-coin]<=0){
                        continue;
                    }
                    if(dp[i-coin]+1<min){
                        min = dp[i-coin]+1;
                    }
                }
                dp[i] = min==Integer.MAX_VALUE?-1:min;
            }
        }
        return dp[amount];
    }
}
