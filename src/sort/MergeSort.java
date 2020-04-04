package sort;

public class MergeSort implements Sort{
    public static void main(String[] args){
        int[] nums1 = new int[]{4,1,5,3,7,8,9,3,4,2,1};
        new MergeSort().sort(nums1);
        System.out.println();
    }

    @Override
    public void sort(int[] nums) {
        mergeSort(0,nums.length-1,nums);
    }

    private  void mergeSort(int low, int high, int[] nums){
        if(low < high){
            int start1 = low;
            int end1 = (low+high)/2;
            int start2 = end1+1;
            int end2 = high;
            mergeSort(start1,end1,nums);
            mergeSort(start2,end2,nums);
            merge(start1,end1,end2,nums);
        }
    }

    private void merge(int start1, int end1, int end2, int[] nums){
        int from = start1;
        int len = end2 - start1 +1;
        if (start1 < end2){
            int start2 = end1+1;
            int[] temp = new int[end2-start1+1];
            int i = 0;
            while (start1 <= end1 && start2 <= end2){
                int a = nums[start1];
                int b = nums[start2];
                if(a < b){
                    temp[i++] = a;
                    start1++;
                }else {
                    temp[i++] = b;
                    start2++;
                }
            }
            while (start1<=end1){
                temp[i++] = nums[start1++];
            }
            while (start2<=end2){
                temp[i++] = nums[start2++];
            }
            System.arraycopy(temp,0,nums,from,len);
        }
    }

}
