class Solution {
    public boolean canPlaceFlowers(int[] arr, int m) {
        int n=arr.length;
        if(m==0){
            return true;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int left=(i-1)<0?0:i-1;
                int right=(i+1)>=n?i:i+1;
                if(arr[left]==0&&arr[right]==0){
                    m--;
                    arr[i]=1;
                }
                if(m==0){
                    return true;
                }
            }
        }
        return false;
    }
}