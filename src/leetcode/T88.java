package leetcode;

public class T88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0){
            return;
        }
        int n1 = m-1; int n2 = n-1;
        for(int i = m+n-1; i>=0; i--){
            if(n2<0){
                nums1[i] = nums1[n1--];
            }else if(n1 < 0){
                nums1[i] = nums2[n2--];
            }else if(nums1[n1] >= nums2[n2]){
                nums1[i] = nums1[n1--];
            }else {
                nums1[i] = nums2[n2--];
            }
        }
    }
}
