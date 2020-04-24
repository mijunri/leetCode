package swordOffer;

import java.util.ArrayList;
import java.util.List;

public class T38 {

    public List<String> strList = new ArrayList<>();

    public String[] permutation(String s) {
        permu(s.toCharArray(),new StringBuilder());
        String[] strings = new String[strList.size()];
        for(int i = 0; i < strList.size(); i++){
            strList.add(strings[i]);
        }
        return strings;
    }

    public void swap(char[] chars, int i, int j){
        char c = chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

    public void permu(char[] chars,StringBuilder sb){
        if(sb.length() == chars.length){
            strList.add(sb.toString());
        }

        else {
            int index = sb.length();
            for(int i = index; i < chars.length; i++){
                swap(chars,i,index);
                sb.append(chars[index]);
                permu(chars,sb);
                sb.deleteCharAt(sb.length()-1);
                swap(chars,i,index);
            }
        }

    }
}
