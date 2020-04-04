package sort;

public class HeapSort implements Sort {

    public static void main(String[] args){
        int[] nums1 = new int[]{4,1,5,3,7,8,9,3,4,2,1};
        new HeapSort().sort(nums1);
        System.out.println();
    }

    @Override
    public void sort(int[] nums) {
        buildHeap(nums);
        for(int i = nums.length-1; i>0; i--){
            adjust(nums,i);
        }
    }

    private void buildHeap(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int index = i;
            while (index > 0){
                int parent = (index - 1)/2;
                if(nums[parent] < nums[index]){
                    swap(nums,index,parent);
                    index = parent;
                    continue;
                }
                break;
            }
        }
    }

    private void adjust(int[] nums, int n){
        swap(nums,0,n);
        int index = 0;
        while (index < n){
            int leftChild = index*2+1;
            int rightChild = index*2+2;

            if(leftChild >= n){
                return;
            }
            if(rightChild >= n || nums[leftChild] >= nums[rightChild]){
                if(nums[leftChild] > nums[index]){
                    swap(nums,leftChild,index);
                    index = leftChild;
                    continue;
                }
                return;
            }
            if(nums[leftChild] < nums[rightChild]){
                if(nums[rightChild] > nums[index]){
                    swap(nums,index,rightChild);
                    index = rightChild;
                    continue;
                }
                return;
            }
            return;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
