class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        for(char key:mp.keySet()){
            pq.offer(key);
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char a=pq.poll();
            int size=mp.get(a);
            for(int i=0;i<size;i++){
                sb.append(a);
            }
        }
        return sb.toString();
    }
}