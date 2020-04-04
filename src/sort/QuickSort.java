package sort;

public class QuickSort implements Sort {

    public static void main(String[] args){
        int[] nums1 = new int[]{4,1,5,3,7,8,9,3,4,2,1};
        new QuickSort().sort(nums1);
        System.out.println();
    }

    @Override
    public void sort(int[] nums) {
        sort(0,nums.length-1,nums);
    }

    private void sort(int low, int high, int[] nums){
       if(low < high){
            int index = pivotIndex(low, high, nums);
            sort(low, index-1, nums);
            sort(index+1,high,nums);
        }
    }

    private int pivotIndex(int low, int high , int[] nums){
        int pivot = nums[low];
        while (low < high){
            while (nums[high] > pivot && low < high){
                high--;
            }
            if(low < high){
                nums[low++] = nums[high];
            }
            while (nums[low] <= pivot && low < high){
                low++;
            }
            if(low < high){
                nums[high--] = nums[low];
            }
        }
        nums[low] = pivot;
        return low;
    }
}
