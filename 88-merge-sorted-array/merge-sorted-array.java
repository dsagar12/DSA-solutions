class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int[] res=new int[n+m];
        int i=0,j=0,idx=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                res[idx]=nums1[i];
                i++;
                idx++;
            }else{
                res[idx]=nums2[j];
                j++;
                idx++;
            }
        }
        while(i<n){
            res[idx]=nums1[i];
            i++;
            idx++;
        }
        while(j<m&&idx<n+m){
            res[idx]=nums2[j];
            j++;
            idx++;
        }
       for(int k=0;k<n+m;k++){
         nums1[k]=res[k];
       }
    }
}