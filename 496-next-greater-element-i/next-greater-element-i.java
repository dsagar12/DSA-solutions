class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int n=nums2.length-1;
        mp.put(nums2[n],-1);
        st.push(nums2[n]);
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&nums2[i]>=st.peek()){
                st.pop();
            }
            mp.put(nums2[i],st.isEmpty()?-1:st.peek());
            st.push(nums2[i]);
        }
        int m=nums1.length;
        int[] res=new int[m];
        for(int i=0;i<m;i++){
            res[i]=mp.get(nums1[i]);
        }
        return res;
    }
}