package medium;

public class T33a {

    public static void main(String[] args){
        int[] nums = new int[] {4,5,6,7,0,1,2};
        System.out.println(new T33a().search(nums,0));
    }

    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        int low = 0, high = nums.length-1;
        if(nums[low] < nums[high]){
            return find(nums,low,high,target);
        }
        while (low < high-1){
            int mid = (low+high)/2;
            if(nums[high] > nums[mid]){
                high = mid;
            }else {
                low = mid;
            }
        }

        if(target >= nums[0]){
            return find(nums,0,low,target);
        }else {
            return find(nums,low+1,nums.length-1,target);
        }
    }

    private int find(int[] nums, int start, int end, int target){
        while (start <= end){
            int mid  = (start+end)/2;
            if(target > nums[mid]){
                start = mid+1;
            }
            else if (target < nums[mid]){
                end = mid-1;
            }
            else if (target == nums[mid]){
                return mid;
            }
        }
        return -1;
    }
}
