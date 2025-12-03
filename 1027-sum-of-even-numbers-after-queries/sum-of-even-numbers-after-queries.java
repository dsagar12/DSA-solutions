class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
        int n=nums.length;
        int p=0;
        int[] ans=new int[queries.length];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                sum+=nums[i];
            }
            
        }
        for(int[] q:queries){
            int val=q[0];
            int index=q[1];
            if(nums[index]%2==0){
                sum-=nums[index];
            }
            nums[index]+=val;
            if(nums[index]%2==0){
                sum+=nums[index];
            }
           ans[p]=sum;
           p++;
        }
        return ans;
    }
}