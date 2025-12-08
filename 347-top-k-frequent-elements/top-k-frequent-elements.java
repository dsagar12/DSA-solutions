class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int[] res=new int[k];
        int idx=0;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
        for(int key:mp.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            res[idx++] = pq.poll();
        }
        return res;
    }
}