package leetcode;

public class T5 {

    public static void main(String[] args){
        System.out.println(new T5().longestPalindrome("bacaa"));
    }

    public String longestPalindrome(String s) {
        if (s.length() == 0){
            return "";
        }
        int len = s.length();
        int[][] dp = new int[len][len];

        for(int i = 0; i < len; i++){
            dp[i][i] = 1;
            if(i>0 && s.charAt(i)==s.charAt(i-1)){
                dp[i][i-1] = 1;
            }
        }
//        for(int i = 0; i < len; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("------------------------------");

        for(int i = 2; i < len; i++){
            for(int j = i-2; j>=0; j--){
                if(dp[i-1][j+1] == 1 && s.charAt(j)==s.charAt(i)){
                    dp[i][j] = 1;
                }
            }
        }


//        for(int i = 0; i < len; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("------------------------------");

        int max = 0;
        int low = 0;
        int high = 0;
        for(int i = 0; i < len; i++){
            for (int j = 0; j <= i; j++){
                if(dp[i][j] == 1 && max < i-j+1){
                    max = i-j+1;
                    low = j;
                    high = i;
                }
            }
        }
        return s.substring(low,high+1);
    }
}
