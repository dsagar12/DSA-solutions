class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n=nums.length;
        int size=queries.length;
        int sum=0;
        int count=0;
        int[] res=new int[size];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                sum+=nums[i];
            }
            
        }
        for(int q[]:queries){
            int val=q[0];
            int index=q[1];
            if(nums[index]%2==0){
                sum-=nums[index];
                nums[index]+=val;
                if(nums[index]%2==0){
                    sum+=nums[index];
                }
            }
            else{
                nums[index]+=val;
                if(nums[index]%2==0){
                    sum+=nums[index];
                }
            }
            res[count]=sum;
            count++;
        }
        return res;
    }
}