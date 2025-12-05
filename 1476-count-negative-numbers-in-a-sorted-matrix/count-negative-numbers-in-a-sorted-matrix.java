class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int r=grid.length-1;
        int count=0;
        int n=grid[0].length;
        while(c<n&&r>=0){
            if(grid[r][c]<0){
                count+=n-c;
                r--;
            }else{
                c++;
            }
        }
        return count;
    }
}