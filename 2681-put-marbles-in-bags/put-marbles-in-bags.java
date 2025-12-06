class Solution {
    public long putMarbles(int[] weights, int k) {
        long[] pairSum=new long[weights.length-1];
        int n=weights.length;
        for(int i=1;i<n;i++){
            pairSum[i-1]=weights[i]+weights[i-1];
        }
        Arrays.sort(pairSum);
        long minSum=0;
        long maxSum=0;
        int m=pairSum.length;
        for(int i=0;i<k-1;i++){
            minSum+=pairSum[i];
            maxSum+=pairSum[m-1-i];

        }
        return maxSum-minSum;
    }
}