class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                int j=mp.get(nums[i]);
                int ans=Math.abs(i-j);
                if(ans<=k){
                    return true;
                }
            }
            mp.put(nums[i],i);
        }
        return false;
    }
}