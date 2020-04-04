package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class T20 {

    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Deque<Character> stack = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            }else {
                char c1 = stack.peek();
                if(isMatch(c1,c)){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isMatch(char c1, char c2){
        if(
                (c1=='(' && c2==')')
                || (c1=='[' && c2 == ']')
                || (c1=='{' && c2 == '}')
                ||(c1==')' && c2=='(')
                || (c1==']' && c2 == '[')
                || (c1=='}' && c2 == '{')
        ){
            return true;
        }
        return false;
    }
}
