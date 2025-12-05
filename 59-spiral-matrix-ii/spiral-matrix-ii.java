class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int count=1;
        int sr=0,sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;
        while(sr<=er&&sc<=ec){
            for(int i=sc;i<=ec;i++){
                matrix[sr][i]=count;
                count++;
            }
            for(int i=sr+1;i<er;i++){
                matrix[i][ec]=count;
                count++;
            }
            for(int i=ec;i>=sc;i--){
                if(sc<ec){
                    matrix[er][i]=count;
                    count++;
                }
                
            }
            for(int i=er-1;i>sr;i--){
                if(sr<er){
                    matrix[i][sc]=count;
                    count++;
                }
               
            }
            sr++;
            er--;
            sc++;
            ec--;

        }
        return matrix;
    }
}