class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int m=0;
        int oper=0;
        for(int key:mp.keySet()){
            m+=mp.get(key)%2;
            oper+=mp.get(key)/2;
        }
        return new int[]{oper,m};
    }
}