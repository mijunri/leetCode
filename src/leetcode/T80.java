package leetcode;

public class T80 {

    public static void main(String[] args){
        int[] nums = new int[]{1,1,2,2,2,3,3,3,4,5,6,7,7,7,7,8,8,8,8};
        int len = new T80().removeDuplicates(nums);
        for(int i = 0; i < len; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public int removeDuplicates(int[] nums) {
        int len = 0;
        int low = 0, high = 1;
        int flag = 0;
        if(nums.length <3){
            return nums.length;
        }
        int times = 1;
        while (low < nums.length){
            if(high < nums.length && nums[low]!=nums[high]){
                low = high;
                high++;
                times = 1;
            }else {
                if(times == 1){
                    low++;
                    high++;
                    times = 2;
                }
                else if (times == 2){
                    while (high < nums.length &&nums[low] == nums[high]){
                        high++;
                    }
                    for(int i = flag;len>0 && i <= low && i< nums.length; i++){
                        nums[i-len] = nums[i];
                    }
                    len = high - low - 1 +len;
                    low = high;
                    high++;
                    flag = low;
                    times=1;
                }
            }
        }
        for(int i = flag; len>0 &&i <= low && i< nums.length; i++){
            nums[i-len] = nums[i];
        }
        return nums.length-len;
    }
}
