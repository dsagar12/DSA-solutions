class Solution {
    public String largestOddNumber(String s) {
        int ans=-1;
        if(s.charAt(s.length()-1)%2==1){
            return s;
        }
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int num=ch-'0';
            if(num%2==1){
                ans=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=ans;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}