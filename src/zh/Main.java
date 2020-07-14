package zh;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt()*2;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }

        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(nums);
        int cost = 0;

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size>0){
                int[] array = queue.poll();
                if (check(array)){
                    System.out.println(cost);
                    return;
                }
                Set<Integer> set = new HashSet<>();
                for(int i = 0; i < n-1; i++){
                    if(array[i]%2 == 0){
                        if(array[i]+1 == array[i+1]){
                            continue;
                        }
                    }
                    set.add(array[i]);
                    if(array[i]%2 == 0 ){
                        if(set.contains(array[i]+1)){

                        }else {
                            swap(array,i,i+1);
                            queue.offer(array.clone());
                            swap(array,i,i+1);

                        }

                    }
                    else if(array[i]%2 == 1){
                        if(set.contains(array[i]-1)){

                        }else {
                            swap(array,i,i+1);
                            queue.offer(array.clone());
                            swap(array,i,i+1);
                        }
                    }
                }
                size--;
            }
            cost++;
        }

    }

    public static void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static boolean check(int[] nums){
        for(int i = 0; i < nums.length-2;i+=2){
            if(Math.abs(nums[i] - nums[i+1])>1){
                return false;
            }
        }
        return true;
    }


}
