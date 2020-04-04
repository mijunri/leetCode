package test;

import sun.security.krb5.internal.crypto.HmacSha1Aes128CksumType;

import java.util.*;

public class Main {
    private static int max = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[n];
        for(int i = 0; i < n; i ++){
            strings[i] = scanner.nextLine();
        }
        List<String> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        backTrack(list,set,strings);
        System.out.println(max);

    }

    private static void backTrack(List<String> list, Set<Integer> set,String[] strings){

        if(list.size() == strings.length){
            int len = 0;
            for(String str:list){
                len+=str.length();
            }
            max = max>len?max:len;
        }

        for(int i = 0; i < strings.length ;i++){
            if(set.contains(i)){
                continue;
            }


            if(list.isEmpty()){
                list.add(strings[i]);
                set.add(i);
                backTrack(list,set,strings);
                list.remove(list.size()-1);
                set.remove(i);
            }
            else{
                String s = list.get(list.size()-1);
                if(s.charAt(s.length()-1) <= strings[i].charAt(0)){
                    list.add(strings[i]);
                    set.add(i);
                    backTrack(list,set,strings);
                    list.remove(list.size()-1);
                    set.remove(i);
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
}
