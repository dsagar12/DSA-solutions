class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int key=i-j;
                mp.putIfAbsent(key,new PriorityQueue<>());
                mp.get(key).add(mat[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int key=i-j;
                mat[i][j]=mp.get(key).poll();
            }
        }
        return mat;
    }
}