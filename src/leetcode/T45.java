package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * jump-game-ii
 */
public class T45 {
    public static void main(String[] args){
        int[] nums = new int[]{2,3,1,1,4};
        int a = new T45().jump(nums);
        System.out.println(a);
    }



    public int jump(int[] nums) {
        int arrive = 0;
        int low = 0;
        int high = 0;
        int cost = 0;
        while (arrive < nums.length-1){
            for(int i = low; i<= high; i++){
                int k = i + nums[i];
                if(k > arrive){
                    arrive = k;
                }
            }
            cost++;
            low = high+1;
            high = arrive;
        }
        return cost;
    }

}
