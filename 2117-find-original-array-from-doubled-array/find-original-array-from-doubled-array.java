class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n=changed.length;
        if (n % 2 == 1) return new int[]{};
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        Arrays.sort(changed);
        for(int i=0;i<n;i++){
            mp.put(changed[i], mp.getOrDefault(changed[i], 0) + 1);
        }
        for(int i=0;i<n;i++){
            int el=changed[i];
            if(mp.get(el)!=0){
                int target=el*2;
                if(!mp.containsKey(target)||mp.get(target)==0){
                    return new int[]{};
                }else{
                    arr.add(el);
                    mp.put(el,mp.get(el)-1);
                    if(mp.get(target)>0){
                        mp.put(target,mp.get(target)-1);
                    }
                    
                    
                }
            }
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}