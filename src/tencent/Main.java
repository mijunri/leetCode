package tencent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            long p = scanner.nextLong();
            int q = scanner.nextInt();
            long m = p(p,q);
            sb.append(m).append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    public static long p(long m, int d){
        int k = (int) log(2,m+1)+1;
        if(k<=d){
            return -1;
        }
        for(int i = 0; i < k-d; i++){
            m = m/2;
        }
        return m;
    }

    public static double log(int basement, long n){
        return Math.log(n) / Math.log(basement);
    }
}
