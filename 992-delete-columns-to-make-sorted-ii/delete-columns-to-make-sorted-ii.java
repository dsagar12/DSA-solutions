class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();

        boolean[] sorted = new boolean[n - 1];
        int count = 0;

        for (int col = 0; col < m; col++) {
            boolean delete = false;

            // check if this column breaks order
            for (int i = 0; i < n - 1; i++) {
                if (!sorted[i] && strs[i].charAt(col) > strs[i + 1].charAt(col)) {
                    delete = true;
                    break;
                }
            }

            // if broken, delete column
            if (delete) {
                count++;
                continue;
            }

            // update sorted array
            for (int i = 0; i < n - 1; i++) {
                if (!sorted[i] && strs[i].charAt(col) < strs[i + 1].charAt(col)) {
                    sorted[i] = true;
                }
            }
        }
        return count;
    }
}
