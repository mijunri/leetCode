package leetcode;

public class T136 {
    public int singleNumber(int[] nums) {
        int c = 0;
        for(int n: nums){
            c = c^n;
        }
        return c;
    }
}
