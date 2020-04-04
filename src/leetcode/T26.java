package leetcode;

public class T26 {

    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,1,1,1};
        int len = new T26().removeDuplicates(nums);
        for(int i = 0; i < len; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public int removeDuplicates(int[] nums) {

        if(nums.length < 2){
            return nums.length;
        }

        int low = 0;
        int high = 1;
        int len = 0;
        int flag = -1;
        int max = 0;
        while(low < nums.length-1){
            if(nums[low] != nums[high]){
                low++;
                high++;
                continue;
            }
            else {
                while (high<nums.length && nums[low] == nums[high]){
                    high++;
                }
                if(len >0){
                    for(int i = flag; i <= low && i<nums.length; i++){
                        nums[i-len] = nums[i];
                    }
                }
                flag = high;
                len = high-low-1+len;
                low = high;
                high++;
            }
        }

        if(len >0){
            for(int i = flag; i <= low&&i<nums.length; i++){
                nums[i-len] = nums[i];
            }
        }
        return nums.length-len;
    }
}
