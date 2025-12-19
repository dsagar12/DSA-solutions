class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int key:nums){
            pq.add((double)key);
        }
        long sum=0;
        for(int i=0;i<k;i++){
            double el=pq.poll();
            sum+=el;
            pq.add(Math.ceil(el/3));
        }
        return sum;
    }
}