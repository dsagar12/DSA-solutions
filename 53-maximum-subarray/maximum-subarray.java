class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int best=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            best=Math.max(best,curr);
        }
        return best;
    }
}