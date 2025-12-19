class Solution {
    public int minStoneSum(int[] piles, int k) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int pile : piles) {
            pq.add(pile);
        }

        for (int i = 0; i < k; i++) {
            int max = pq.poll();
            int remaining = max - (max / 2); 
            pq.add(remaining);
        }

        int ans = 0;
        while (!pq.isEmpty()) {
            ans += pq.poll();
        }

        return ans;
    }
}
