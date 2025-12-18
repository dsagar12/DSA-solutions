import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> {
                int da = Math.abs(a - x);
                int db = Math.abs(b - x);

                if (da == db) {
                    return b - a; 
                }
                return db - da; 
            }
        );

        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }

        Collections.sort(res);
        return res;
    }
}
