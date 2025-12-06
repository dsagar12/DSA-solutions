class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        long[] sum = new long[n];
        sum[0] = nums[0];

    
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        for (int i = k; i + k < n; i++) {
            long temp;
            if (i - k - 1 >= 0)
                temp = sum[i + k] - sum[i - k - 1];
            else
                temp = sum[i + k];

            res[i] =(int) (temp / (2 * k + 1));
        }

        return res;
    }
}
