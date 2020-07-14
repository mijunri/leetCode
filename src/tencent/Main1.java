package tencent;

import java.util.Scanner;

public class Main1 {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] q1 = new int[n];
        int[] q2 = new int[n];
        for(int i = 0; i < n; i++){
            q1[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            q2[i] = scanner.nextInt();
        }
        Main1 m = new Main1();
        m.backTrace(q1,q2,0);
        int min = m.min;
        System.out.println(min==Integer.MAX_VALUE?-1:min);
    }

    int min = 100;
    public void backTrace(int[] q1, int[] q2, int cost){
        if(cost >= min){
            return;
        }
        if(check(q1)){
           min =  min < cost?min:cost;
           return;
        }
        for(int i = 0; i < q1.length-1; i++){
            int tem = q1[i];
            swap(q1,q2,i,i+1);
            backTrace(q1,q2,cost+1);
            swap(q1,q2,i,i+1);
        }
    }

    public void swap(int[] q1, int[] q2, int m, int n){
        int t = q1[m];
        q1[m] = q2[n];
        q2[n] = t;
        t = q2[m];
        q2[m] = q1[n];
        q1[n] = t;
    }


    public boolean check(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
