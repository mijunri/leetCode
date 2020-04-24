package pdd;

import java.util.Scanner;

public class Main2 {
    public static int min = Integer.MAX_VALUE;
    public static int num = Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.nextInt()+"";
        char[] chars = s.toCharArray();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(chars[i]+"");
        }

        for(int i = 0; i < 9; i++){
            pk(nums,i,k,0);
        }

        System.out.println(min);
        System.out.println(num);
    }


    public static void pk(int[] nums, int key, int k, int cost){
        if(cost > min){

        }
        else if(findkey(nums,key) >=k){
            if(cost < min){
                min = cost;
                num = parse(nums);
            }else {
                int v = parse(nums);
                num = num<v?num:v;
            }

        }else {
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == key){
                    continue;
                }else {
                    int m = nums[i];
                    nums[i] = key;
                    pk(nums,key,k,cost+Math.abs(key-m));
                    nums[i] = m;
                }
            }
        }

    }

    public static int parse(int[] nums){
        int a = 0;
        for(int i = 0; i < nums.length; i++){
            a=a*10+nums[i];
        }
        return a;
    }

    public static int findkey(int[] nums, int key){
        int n = 0;
        for(int v: nums){
            if(v == key){
                n++;
            }
        }
        return n;
    }
}
