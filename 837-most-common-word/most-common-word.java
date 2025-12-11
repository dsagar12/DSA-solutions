class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> mp=new HashMap<>();
String[] dummy = paragraph.split("[^A-Za-z]+");
        int n=dummy.length;
        for(int i=0;i<n;i++){
            mp.put(dummy[i].toLowerCase(),mp.getOrDefault(dummy[i].toLowerCase(),0)+1);
        }
        int m=banned.length;
        for(int i=0;i<m;i++){
            mp.remove(banned[i]);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        for(String key:mp.keySet()){
            pq.offer(key);
        }
        return pq.poll();
    }
}