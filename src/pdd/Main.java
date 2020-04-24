package pdd;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        System.out.println(n);
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
//            System.out.println(nums[i]);
        }
        Arrays.sort(nums);
        int account = 0;
        for(int i = n-1,j=1; i >=0; i--,j++){
            if(j%3 != 0){
                account+=nums[i];
            }
        }
        System.out.println(account);
    }
}
