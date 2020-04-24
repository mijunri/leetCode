package leetcode;

public class T1044 {
    public String longestDupSubstring(String s) {
        String[] suffixs = new String[s.length()];
        int[] sa = new int[s.length()];
        int[] rank = new int[s.length()];
        char[] chars = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            suffixs[i] = new String(chars,i,s.length()-i);
        }

        return null;
    }



}
