class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0,n=nums.length,currSum=0,prefix=0,suffix=0;
        for(int x:nums){
            sum+=x;
        }
        for(int i=0;i<n;i++){
             prefix=currSum;
             suffix=sum-prefix-nums[i];
             if(prefix==suffix){
                return i;
             }
             currSum+=nums[i];
        }
        return  -1;
    }
}