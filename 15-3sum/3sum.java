class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int left=0;
        int right=0;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
             if (i > 0 && nums[i] == nums[i - 1]) continue;
             left=i+1;
             right=n-1;
             int target=-nums[i];
            while(left<right){
                
                if(nums[left]+nums[right]==target){
                ArrayList<Integer> ans=new ArrayList<>();
                ans.add(nums[i]);
                ans.add(nums[left]);
                ans.add(nums[right]);
                res.add(new ArrayList<>(ans));
                left++;
                right--;
               while(left < right && nums[left] == nums[left-1]) left++;
               while(left < right && nums[right] == nums[right+1]) right--;

                
            }
            else if(target<nums[left]+nums[right]){
                right--;
            }
            else{
                left++;
            }
            }
           
        }
        return res;
    }
}