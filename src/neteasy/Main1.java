package neteasy;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n <= 1){
            System.out.println(-1);
            return;
        }
        int a = scanner.nextInt();
        System.out.println("a = "+a);
        int b = scanner.nextInt();
        int pre = b-1;
        if(pre <= 0){
            System.out.println(-1);
            return;
        }
        for(int i = 2 ; i < n; i++){
            int c = scanner.nextInt();
            int cu = c - b;
            if(cu <= 0){
                System.out.println(-1);
                return;
            }
            pre = gcd(pre,cu);
        }

        System.out.println(pre);

    }

    public static int gcd(int a, int b) {
        int e = a;

        for (int i = 1; i <= e; i++) {

            int c = a > b ? a : b;//两个数字的大值
            int d = a < b ? a : b;//两个数字的小值

            a = c % d;
            b = d;

            if (a == 0) {
                return d;
            }
        }
        return -1;
    }

    public static int max(int[] nums){
        int m = nums[0];
        if(nums.length == 1){
            return m;
        }
        for(int i = 1; i < nums.length; i++){
            int b = gcd(m,nums[i]);
            if(b == 1){
                return b;
            }else{
                m = b;
            }
        }
        return m;
    }
}
