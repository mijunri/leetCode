package leetcode;

public class T33 {

    public static void main(String[] args){
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        new T33().findMedianSortedArrays(nums1,nums2);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        if(len %2 == 0){
            return (getMinK(nums1,0,nums2,0,len/2) +
                    getMinK(nums1,0,nums2,0,len/2+1))*1.0/2;
        }
        else {
            return getMinK(nums1,0,nums2,0,len/2+1);
        }
    }

    private int getMinK(int[] nums1, int start1, int[] nums2, int start2, int k){
        if(start1>=nums1.length){
            return nums2[start2+k-1];
        }
        if(start2>=nums2.length){
            return nums1[start1+k-1];
        }
        if(k == 1){
            return Math.min(nums1[start1],nums2[start2]);
        }

        int len = Math.min(k/2,Math.min(nums1.length-start1,nums2.length-start2));
        int low1 = start1+len-1;
        int low2 = start2+len-1;
        if(nums1[low1] <= nums2[low2]){
            return getMinK(nums1,low1+1,nums2,start2,k-len);
        }else {
            return getMinK(nums1,start1,nums2,low2+1,k-len);
        }
    }

}
