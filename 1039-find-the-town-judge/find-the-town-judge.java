class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trusts=new int[n+1];
        int ans=-1;
        for(int t[]:trust){
            int u=t[0];
            int v=t[1];
            trusts[v]++;
        }
        for(int i=1;i<=n;i++){
            if(trusts[i]==(n-1)){
               ans=i;
            }
        }
      for(int[] t:trust){
        int u=t[0];
        if(u==ans){
            ans=-1;
        }
      }
      return ans;
    }
}