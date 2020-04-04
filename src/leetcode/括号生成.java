package leetcode;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;


public class 括号生成 {

    public static void main(String[] args){
       List<String> l =  new 括号生成().generateParenthesis(3);
       for(String s:l){
           System.out.println(s);
       }
    }

    private List<String> list = new LinkedList<>();

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        generate(sb,0,n,n);
        return list;
    }

    public void  generate(StringBuilder sb,int leftnum, int left, int right){
        if(left == 0 && right == 0){
            list.add(sb.toString());
            return;
        }

        if(leftnum < sb.length()/2.0){
            return;
        }
        if(right>0){
            sb.append(')');
            generate(sb,leftnum,left,right-1);
            sb.deleteCharAt(sb.length()-1);
        }
        if(left > 0){
            sb.append('(');
            generate(sb,leftnum+1,left-1,right);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
