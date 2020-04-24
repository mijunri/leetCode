package leetcode;

public class 字符串匹配KMP {

    public static void main(String[] args){
        int[] n = getNext("aabbaac");
        System.out.println();
    }

    public boolean stringMatching(String pattern, String value) {
        return false;
    }

    public static int[] getNext(String ps) {

        char[] p = ps.toCharArray();

        int[] next = new int[p.length];

        next[0] = -1;

        int j = 0;

        int k = -1;

        while (j < p.length - 1) {

            if (k == -1 || p[j] == p[k]) {

                next[++j] = ++k;

            } else {

                k = next[k];

            }

        }

        return next;

    }
}
