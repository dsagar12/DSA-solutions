class Solution {
    public boolean isMonotonic(int[] arr) {
        boolean up=true;
        boolean down=true;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                up=false;
            }
            if(arr[i]>arr[i-1]){
                down=false;
            }
        }
        if(up==true||down==true){
            return true;
        }else{
            return false;
        }
    }
}