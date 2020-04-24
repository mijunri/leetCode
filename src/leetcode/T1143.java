package leetcode;

public class T1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] m= new int[text1.length()+1][text2.length()+1];
        for(int i = 0; i < m.length;i++){
            m[i][0] = 0;
        }
        for(int i = 0; i < m[0].length;i++){
            m[0][i] = 0;
        }

        for(int i = 1; i < m.length; i++){
            for(int j = 1; j < m[0].length; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    m[i][j] = m[i-1][j-1]+1;
                }else {
                    m[i][j] = Math.max(m[i-1][j],m[i][j-1]);
                }
            }
        }
        return m[m.length-1][m[0].length-1];
    }



    public static void main(String[] args){
        String a = "psnw";
        String b = "vozsh";
        new T1143().longestCommonSubsequence(a,b);
    }
}
