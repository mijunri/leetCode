package leetcode;

public class T172 {


    public int trailingZeroes(int n) {
        int count = 0;
        int key = 5;
        while(key <= n){
            count+=n/key;
            n = n/5;
        }
        return count;
    }
}
