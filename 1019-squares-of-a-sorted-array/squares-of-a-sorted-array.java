class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int i=0,j=n-1;
        int idx=n-1;
        while(i<=j){
            if(nums[i]*nums[i]<nums[j]*nums[j]){
                res[idx]=nums[j]*nums[j];
                idx--;
                j--;
            }else{
                res[idx]=nums[i]*nums[i];
                i++;
                idx--;
            }
        }
        return res;
    }
}