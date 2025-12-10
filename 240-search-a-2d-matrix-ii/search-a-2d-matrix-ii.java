class Solution {
    public boolean binarySearch(int[][] matrix, int target, int i, int left, int right){
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[i][mid]==target){
                return true;
            }
            if(matrix[i][mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int left=0;
        int right=matrix[0].length-1;
        for(int i=0;i<m;i++){
           if(binarySearch(matrix,target,i,left,right)){
                return true;
           }
        }
        return false;
    }
}