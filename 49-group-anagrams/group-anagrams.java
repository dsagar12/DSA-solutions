class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,ArrayList<String>> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            String str=strs[i];
            char[] s=str.toCharArray();
            Arrays.sort(s);
            String sorted = new String(s);

            mp.putIfAbsent(sorted, new ArrayList<>());
            mp.get(sorted).add(strs[i]);
        }
        List<List<String>> res=new ArrayList<>();
        for(String key:mp.keySet()){
            res.add(mp.get(key));
        }
        return res;
    }
}