package sort;

public class RadixSort implements Sort{

    public static void main(String[] args){
        int[] nums1 = new int[]{4,1,5,3,7,8,9,3,4,2,1};
        new RadixSort().sort(nums1);
        System.out.println();
    }

    @Override
    public void sort(int[] nums) {
        sort(nums,2);

    }

    private void sort(int[] nums, int d){

        for(int i = 0; i < d; i++){
            int[] counts = new int[10];
            int[] temp = new int[nums.length];
            int rid = (int)Math.pow(10,i);
            for(int j = 0; j < nums.length; j++){
                int c = nums[j]/rid%10;
                counts[c]++;
            }
            for(int j = 1; j < counts.length; j++){
                counts[j] += counts[j-1];
            }
            for(int j = nums.length-1; j>=0; j--){
                int c = nums[j]/rid%10;
                temp[--counts[c]]= nums[j];
            }
            System.arraycopy(temp,0,nums,0,nums.length);
        }
    }

}

