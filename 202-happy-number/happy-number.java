class Solution {
    public int sum(int n){
        int ans=0;
        while(n>0){
            int el=n%10;
            ans+=(el*el);
            n=n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(true){
            slow=sum(slow);
            fast=sum(sum(fast));
            if(slow==fast){
                return slow==1;
            }
        }
        
    }
}