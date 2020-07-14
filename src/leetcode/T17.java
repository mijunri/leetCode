package leetcode;

import java.util.*;

//电话号码的排列组合
public class T17 {

    public static void main(String[] args){
        List<String> list = new T17().letterCombinations("");
        for(String s: list){
            System.out.println(s);
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0 ){
            return new ArrayList<>();
        }
        Map<Integer, List<String>> digitMap = new HashMap<>();
        digitMap.put(2, Arrays.asList("a","b","c"));
        digitMap.put(3, Arrays.asList("d","e","f"));
        digitMap.put(4, Arrays.asList("g","h","i"));
        digitMap.put(5, Arrays.asList("j","k","l"));
        digitMap.put(6, Arrays.asList("m","n","o"));
        digitMap.put(7, Arrays.asList("p","q","r","s"));
        digitMap.put(8, Arrays.asList("t","u","v"));
        digitMap.put(9, Arrays.asList("w","x","y","z"));

        List<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        doCombination(answer,digits,digitMap,i,sb);

        return answer;
    }

    private void doCombination(List<String> answer, String digits, Map<Integer, List<String>> digitMap, int i,StringBuilder sb) {
        if(i == digits.length()){
            answer.add(sb.toString());
        }else {
            int key = Integer.parseInt(String.valueOf(digits.charAt(i)));
            i++;
            List<String> digitList = digitMap.get(key);
            for(String s: digitList){
                sb.append(s);
                doCombination(answer,digits,digitMap,i,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }




}
