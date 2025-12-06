class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int ans=Math.abs(nums[i]-nums[i+1]);
            res=Math.min(res,ans);
        }
        return res;
    }
}