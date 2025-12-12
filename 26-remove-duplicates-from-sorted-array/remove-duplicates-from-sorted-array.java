class Solution {
    public int removeDuplicates(int[] nums) {
         int n=nums.length;
         if(n==0) return 0;
         
         int i=0,j=1;
         int count=1;
         while(j<n&&i<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                count++;
            }
         }
        return count;
    }   
}