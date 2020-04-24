package swordOffer;

public class T33 {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder.length <= 1){
            return true;
        }
        return verify(postorder,0,postorder.length-1);
    }

    public boolean verify(int[] nums, int low, int high){
        if(low >= high){
            return true;
        }
        int key = nums[high];

        int i;
        for(i = low; i < high; i++){
            if(nums[i]>key){
                break;
            }
        }
        for(int j = i; j < high; j++){
            if(nums[j] > key){
                return false;
            }
        }
        return verify(nums,low,i-1)&&verify(nums,i,high-1);
    }
}
