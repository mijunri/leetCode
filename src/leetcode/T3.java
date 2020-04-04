package leetcode;

import java.util.*;

public class T3 {

    public static void main(String[] args){
        System.out.println(new T3().lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        int len = 0, maxlen = 0;
        List<Character> list = new LinkedList<>();
        for(int index = 0; index < s.length(); index++){
            char c = s.charAt(index);
            if(!list.contains(c)){
                list.add(c);
                len++;
                maxlen = maxlen>len?maxlen:len;
            }else {
                list.add(c);
                len++;
                while (true){
                    char c1 = list.remove(0);
                    len--;
                    if(c1 == c){
                        break;
                    }
                }
            }
        }
        return maxlen;
    }
}
