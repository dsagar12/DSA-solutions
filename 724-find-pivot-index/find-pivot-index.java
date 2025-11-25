class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int currSum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            int left=currSum-nums[i];
            int right=sum-currSum;
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}