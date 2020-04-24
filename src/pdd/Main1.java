package pdd;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        int account = 0;
        long[] value = new long[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                value[j]+=nums[j+i];
                if(value[j] % m == 0){
                    account++;
                }
            }
        }
        System.out.println(account);
    }

}
