class Solution {
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
       PriorityQueue<Integer> pq = new PriorityQueue<>(
    (a, b) -> {
        if (mp.get(a)==mp.get(b)) {
            return b - a;       
        }
        return mp.get(a)-mp.get(b); // value compare (descending)
    }
);

        for(int key:mp.keySet()){
            pq.offer(key);
        }
        int idx=0;
        while(!pq.isEmpty()){
            int el=pq.poll();
            int size=mp.get(el);
            for(int i=0;i<size;i++){
                nums[idx]=el;
                idx++;
            }
        }
        return nums;
    }
}