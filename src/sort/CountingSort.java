package sort;

public class CountingSort implements Sort {
    @Override
    public void sort(int[] nums) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            max = max>nums[i]?max:nums[i];
        }
        int[] countArray = new int[max+1];
        for(int i = 0; i < nums.length; i++){
            countArray[nums[i]]++;
        }
        int j = 0;
        for(int i = 0; i < countArray.length; i++){
            for(int k = 0; k < countArray[i]; k++){
                nums[j++] = i;
            }
        }
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{4,1,5,3,7,8,9,3,4,2,1};
        new CountingSort().sort(nums1);
        System.out.println();
    }

}
