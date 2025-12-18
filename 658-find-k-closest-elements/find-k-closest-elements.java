// import java.util.*;

// class Solution {
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {

//         PriorityQueue<Integer> pq = new PriorityQueue<>(
//             (a, b) -> {
//                 int da = Math.abs(a - x);
//                 int db = Math.abs(b - x);

//                 if (da == db) {
//                     return b - a; 
//                 }
//                 return db - da; 
//             }
//         );

//         for (int num : arr) {
//             pq.add(num);
//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }

//         List<Integer> res = new ArrayList<>();
//         while (!pq.isEmpty()) {
//             res.add(pq.poll());
//         }

//         Collections.sort(res);
//         return res;
//     }
// }



class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int integer : arr) {
            if (k > 0) {
                minHeap.offer(integer);
                k--;
            } else if (Math.abs(minHeap.peek() - x) > Math.abs(integer - x)) {
                minHeap.poll();
                minHeap.offer(integer);
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }
        return result;
    }
}