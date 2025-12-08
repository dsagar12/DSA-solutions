class Solution {
    public int countTriples(int n) {
        HashSet<Integer> st=new HashSet<>();
        for(int i=1;i<=n;i++){
            st.add(i*i);
        }
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(st.contains((i*i)+(j*j))){
                    count=count+2;
                }
            }
        }
        return count;
    }
}