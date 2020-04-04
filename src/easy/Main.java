package easy;

import java.util.*;

public class Main {
    private static int max = 0;
    private static List<List<String>> lists = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[n];
        if(n == 0){
            System.out.println(0);
            return;
        }
        for(int i = 0; i < n; i ++){
            strings[i] = scanner.nextLine();
        }
        if (n==1){
            System.out.println(strings[0].length());
        }
        Arrays.sort(strings);
        List<String> list = new ArrayList<>();
        backTrack(list,strings);
        System.out.println(max);

    }

    private static void backTrack(List<String> list, String[] strings){

        if(list.size()>=2){
            String  s1 = list.get(list.size()-1);
            String s2 = list.get(list.size()-2);
            if(s1.charAt(s1.length()-1) > s2.charAt(0)){
                list.remove(list.size()-1);
                lists.add(list);
            }
        }

        for(int i = 0; i < strings.length ;i++){
            String s = list.get(list.size()-1);
            if(s.charAt(s.length()-1) <= strings[i].charAt(0)){
                list.add(strings[i]);
                backTrack(list,strings);
                list.remove(list.size()-1);
            }else {
                int len = 0;
                for(String str:list){
                    len+=str.length();
                }
                max = max>len?max:len;
            }
        }
    }

}