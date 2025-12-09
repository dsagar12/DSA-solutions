class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        int n=senders.length;
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            String s=messages[i];
            String[] sp=s.split(" ");
            int size=sp.length;
            mp.put(senders[i],mp.getOrDefault(senders[i],0)+size);
        }
       PriorityQueue<String> pq = new PriorityQueue<>(
    (a, b) -> {
        if (mp.get(a).equals(mp.get(b))) {
            return b.compareTo(a);   
        }
        return mp.get(b) - mp.get(a); 
    }
);


        for(String key:mp.keySet()){
            pq.offer(key);
        }
        return pq.poll();
    }
}