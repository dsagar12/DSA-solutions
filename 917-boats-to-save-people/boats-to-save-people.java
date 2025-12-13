class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int ans=0,l=0,r=n-1;
        while(l<=r){
            int equ=people[l]+people[r];
            if(people[l]+people[r]<=limit){
                ans+=1;
                l++;
                r--;
               
            }
            else{
                ans+=1;
                r--;
            }
        }
        return ans;
    }
}