class Solution {
    public int add(int n){
        int ans=0;
        while(n>0){
            int el=n%10;
            ans+=el;
            n=n/10;
        }
        return ans;
    }
    public int addDigits(int num) {
        
        while(num/10!=0){
           num=add(num);
        }
        return num;
    }
}