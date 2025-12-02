class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        HashMap<Integer,ArrayList<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int index=i-j;
                mp.putIfAbsent(index,new ArrayList<>());
                mp.get(index).add(matrix[i][j]);
            }
        }
        for(int key:mp.keySet()){
            ArrayList res=mp.get(key);
            int size=res.size();
            for(int i=0;i<size-1;i++){
                if(res.get(i)!=res.get(i+1)){
                    return false;
                }

            }
        }
        return true;
    }
}