class Solution {
    int n;
    int m;
    int[][] dp;

    public int dfs(int[][] matrix, int i, int j, int prev) {
        
        if (i < 0 || i >= n || j < 0 || j >= m || matrix[i][j] <= prev) {
            return 0;
        }

        
        if (dp[i][j] != 0) return dp[i][j];

        int currVal = matrix[i][j];
        int up = dfs(matrix, i - 1, j, currVal);
        int down = dfs(matrix, i + 1, j, currVal);
        int left = dfs(matrix, i, j - 1, currVal);
        int right = dfs(matrix, i, j + 1, currVal);

        
        dp[i][j] = 1 + Math.max(Math.max(up, down), Math.max(left, right));
        return dp[i][j];
    }

    public int longestIncreasingPath(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        dp = new int[n][m]; 
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, dfs(matrix, i, j, -1));
            }
        }

        return max;
    }
}
