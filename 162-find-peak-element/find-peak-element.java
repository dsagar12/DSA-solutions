class Solution {
    public int findPeakElement(int[] nums) {
        int left=0,right=nums.length-1,n=nums.length;
        while(left<=right){
           int mid = left + (right - left) / 2;
            if(mid+1<n&&nums[mid]<nums[mid+1]){
                left=mid+1;
            }else if(mid-1>=0&&nums[mid]<nums[mid-1]){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}