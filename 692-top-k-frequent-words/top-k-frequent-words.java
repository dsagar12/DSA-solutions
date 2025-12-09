class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n=words.length;
        TreeMap<String,Integer> mp=new TreeMap<>();
        for(int i=0;i<n;i++){
            mp.put(words[i],mp.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if (mp.get(a).equals(mp.get(b))) {
                    return b.compareTo(a); 
                }
                return mp.get(a) - mp.get(b); 
            }
        );

        for(String key:mp.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        String[] res=new String[k];
        int idx=k-1;
        while(!pq.isEmpty()){
            res[idx]=pq.poll();
            idx--;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(res[i]);
        }
        return ans;
    }
}