class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int key:nums){
            pq.add(key);
        }
        long sum=0;
        for(int i=0;i<k;i++){
            double el=pq.poll();
            sum+=el;
            pq.add((int)Math.ceil(el/3));
        }
        return sum;
    }
}