class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> ans=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    ans.add(1);
                }else{
                    ans.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(ans);
        }
       return res.get(rowIndex);
    }
}