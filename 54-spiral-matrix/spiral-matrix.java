class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int startCol = 0;
        int startRow = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // 1. Top row
            for (int i = startCol; i <= endCol; i++) {
                res.add(matrix[startRow][i]);
            }

            // 2. Right col
            for (int i = startRow + 1; i <= endRow; i++) {
                res.add(matrix[i][endCol]);
            }

            // 3. Bottom row (only if >1 row)
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    res.add(matrix[endRow][i]);
                }
            }

            // 4. Left col (only if >1 col)
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    res.add(matrix[i][startCol]);
                }
            }

            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }

        return res;
    }
}
