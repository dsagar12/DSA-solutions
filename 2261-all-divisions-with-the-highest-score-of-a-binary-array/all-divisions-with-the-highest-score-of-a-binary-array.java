class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n+1];
        int[] suffix=new int[n+1];
        int count=0;
        for(int i=0;i<n;i++){
            prefix[i]=count;
            if(nums[i]==0){
                count++;
            }
        }
        prefix[n]=count;
        count=0;
        suffix[n]=0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]==1){
                count++;
            }
            suffix[i]=count;
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.add(0);
        int maxScore = -1;

        for (int i = 0; i <= n; i++) {
            int score = prefix[i] + suffix[i];

            if (score > maxScore) {
                maxScore = score;
                res.clear();
                res.add(i);
            } else if (score == maxScore) {
                res.add(i);
            }
        }
        return res;
        
    }
}