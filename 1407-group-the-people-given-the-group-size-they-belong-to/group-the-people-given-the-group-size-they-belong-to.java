class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        List<List<Integer>> res=new ArrayList<>();
        int n=groupSizes.length;
        for(int i=0;i<n;i++){
            mp.putIfAbsent(groupSizes[i],new ArrayList<>());
            mp.get(groupSizes[i]).add(i);
            if(groupSizes[i]==mp.get(groupSizes[i]).size()){
                 res.add(new ArrayList<>(mp.get(groupSizes[i])));

                mp.get(groupSizes[i]).clear();
            }
        }
       
        return res;
    }
}