class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add((long)x);
        }
        int ans=0;
        while(!pq.isEmpty()&&pq.peek()<k){
           
            
            long first=pq.poll();
            if(pq.isEmpty()){
                break;
            }
            long second=pq.poll();
            long dummy=(first*2)+second;
            pq.add(dummy);
             ans++;
        }
        return ans;
    }
}