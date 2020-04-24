package neteasy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int times = scanner.nextInt();
        int q0 = scanner.nextInt();
        Set<Integer> visitedSet = new HashSet<>();
        visitedSet.add(q0);

        for(int i = 0; i < times; i++){
            int num = scanner.nextInt();
            Set<Integer> set = new HashSet<>();
            boolean flag = false;
            for(int j = 0; j < num; j++){
                int key = scanner.nextInt();
                set.add(key);
                if(visitedSet.contains(key)){
                    flag = true;
                }
            }
            if(flag){
                visitedSet.addAll(set);
            }
        }

        System.out.println(visitedSet.size());

    }
}
