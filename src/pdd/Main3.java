package pdd;

import java.util.*;

public class Main3 {
    private static int max = 0;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if(n <= 1){
            System.out.println(n-k);
            return;
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < n; i ++){
            linkedList.add(scanner.nextInt());
        }
        backTrace(linkedList,k);
        System.out.println(max);

    }

    public static void backTrace(LinkedList<Integer> list, int n){
        if(n == 0){
            int m = maxLen(list);
            max = max>m?max:m;
        }else if(pmax(list) < max){

        }else {
            for(int i = 0; i < list.size(); i++){
                int v = list.remove(i);
                backTrace(list,n-1);
                list.add(i,v);
            }
        }
    }

    public static int pmax(List<Integer> list){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            Integer vale = map.getOrDefault(list.get(i),0);
            map.put(list.get(i),vale+1);
        }
        int max = 0;
        for(int v:map.values()){
            if(v > max){
                max = v;
            }
        }
        return max;
    }

    public static int maxLen(LinkedList<Integer> list){
        int max = 0;
        int len = 1;
        int pre = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) == pre){
                len++;
            }else {
                max = max>len?max:len;
                len = 1;
                pre = list.get(i);
            }
        }
        max = max>len?max:len;
        return max;
    }
}
