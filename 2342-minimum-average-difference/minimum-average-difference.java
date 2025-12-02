class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum=0,currSum=0;
        long min=Long.MAX_VALUE;
        long n=nums.length;
        int index=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            long left=(currSum==0)?0:currSum/(i+1);
            long right;
            if(i == n - 1){
                right = 0;  
            } else {
                right = (sum - currSum) / (n - i - 1);
            }
            
            long ans=Math.abs(left-right);
            if(min>ans){
                min=ans;
                index=i;
            }
        }
        return index;
    }
}