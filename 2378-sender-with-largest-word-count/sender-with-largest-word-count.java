// class Solution {
//     public String largestWordCount(String[] messages, String[] senders) {
//         int n=senders.length;
//         HashMap<String,Integer> mp=new HashMap<>();
//         for(int i=0;i<n;i++){
//             String s=messages[i];
//             String[] sp=s.split(" ");
//             int size=sp.length;
//             mp.put(senders[i],mp.getOrDefault(senders[i],0)+size);
//         }
//        PriorityQueue<String> pq = new PriorityQueue<>(
//     (a, b) -> {
//         if (mp.get(a).equals(mp.get(b))) {
//             return b.compareTo(a);   
//         }
//         return mp.get(b) - mp.get(a); 
//     }
// );


//         for(String key:mp.keySet()){
//             pq.offer(key);
//         }
//         return pq.poll();
//     }
// }


class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> mp = new HashMap<>();

        // 1️⃣ Count words per sender
        for (int i = 0; i < senders.length; i++) {
            int words = messages[i].split(" ").length;
            mp.put(senders[i], mp.getOrDefault(senders[i], 0) + words);
        }

        // 2️⃣ Find max sender
        String ans = "";
        int max = 0;

        for (String sender : mp.keySet()) {
            int count = mp.get(sender);

            if (count > max || (count == max && sender.compareTo(ans) > 0)) {
                max = count;
                ans = sender;
            }
        }

        return ans;
    }
}
