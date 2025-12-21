class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        int count=0;
        for(int i=nums.length-1;i>0;i--){
            left=0;
            if(i<nums.length-1&&nums[i]==nums[i+1]){
                continue;
            }
            while(left<i){
                int ans=(nums[i]-nums[left]);
                if(ans==k){
                    count++;
                    break;
                }
                else if(ans>k){
                    left++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}