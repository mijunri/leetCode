package leetcode;

public class T344 {
    public void reverseString(char[] s) {
        if(s.length<=1){
            return;
        }
        for( int low = 0, high = s.length-1; low< high; low++, high--){
            char c = s[low];
            s[low] = s[high];
            s[high] = c;
        }
    }
}
