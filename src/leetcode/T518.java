package leetcode;

public class T518 {

    public static void main(String[] args){
        int[] coins = new int[]{1,2,5};
        System.out.println(new T518().change(5,coins));
    }

    public int change(int amount, int[] coins) {
        if(coins == null ||coins.length == 0){
            return 0;
        }

        int[][] dp = new int[coins.length][amount+1];
        for(int i = 1; i < amount+1; i++){
            if(i%coins[0] == 0){
                dp[0][i] = 1;
            }
        }
        for(int i = 0; i < coins.length; i++){
            dp[i][0] = 1;
        }

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------");

        for(int i =1; i < coins.length; i++){
            for(int j = 1; j < amount+1; j++){
                int key = 0;
                while (j-key>=0){
                    dp[i][j] += dp[i-1][j-key];
                    key+=coins[i];
                }
            }
        }

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------");

        return dp[coins.length-1][amount];
    }
}
