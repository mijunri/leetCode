package neteasy;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int defent = scanner.nextInt();
        int[][] attack = new int[n][2];
        for(int i = 0; i < n; i++){
            attack[i][0] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            attack[i][1] = scanner.nextInt();
        }

        List<int[]> attackList = new LinkedList<>();
        List<int[]> damageList = new LinkedList<>();

        for(int i = 0; i < n; i ++){
            attackList.add(attack[i]);
            damageList.add(attack[i]);
        }

        attackList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] < o2[0]){
                    return -1;
                }
                return 1;
            }
        });

        damageList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] < o2[1]){
                    return -1;
                }
                return 1;
            }
        });



        int account = 0;

        while (!attackList.isEmpty()){
            if(defent > attackList.get(0)[0]){
                defent++;
                int[] key = attackList.remove(0);
                damageList.remove(key);
            }else {
                defent++;
                int[] key = damageList.remove(0);
                account+=key[1];
                attackList.remove(key);
            }
        }





        System.out.println(account);

    }
}
