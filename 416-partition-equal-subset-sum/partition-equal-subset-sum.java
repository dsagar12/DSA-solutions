class Solution {
    public boolean recur(int[] nums,int n,int sums,int[][] t){
        if(sums==0){
            return true;
        }
        if(n==0){
            return false;
        }
        
        if(t[n][sums]!=-1){
            return t[n][sums]==1;
        }
        if(nums[n-1]<=sums){
            boolean ans= recur(nums,n-1,sums-nums[n-1],t)||recur(nums,n-1,sums,t);
             t[n][sums]=(ans==true)?1:0;
             return t[n][sums]==1;
        }
        else{
             t[n][sums]=(recur(nums,n-1,sums,t))==true?1:0;
             return t[n][sums]==1;
        }
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2==1){
            return false;
        }
        int[][] t=new int[n+1][(sum/2)+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<=sum/2;j++){
                t[i][j]=-1;
            }
        }
        return recur(nums,n,sum/2,t);
    }
}