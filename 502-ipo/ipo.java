class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<profits.length;i++){
            minHeap.add(new int[]{capital[i],profits[i]});
        }
        int currentW=w;
        for(int i=0;i<k;i++){
            while(!minHeap.isEmpty()&&minHeap.peek()[0]<=currentW){
                maxHeap.add(minHeap.poll()[1]);
            }
            if(maxHeap.isEmpty()){
                break;
            }
            currentW+=maxHeap.poll();
        }
        return currentW;
    }
}