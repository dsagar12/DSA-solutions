// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         Arrays.sort(nums);
//         int freq=1;
//         int res=nums[0];
//         for(int i=1;i<n;i++){
//             if(nums[i]==nums[i-1]){
//                 freq++;
//             }
//             else{
//                 freq=1;
//                 res=nums[i];
//             }
//             if(freq>n/2)
//             return res;
//         }
//         return res;
//     }
// }







// class Solution {
//     public int majorityElement(int[] nums) {
//         int size=nums.length;
//         HashMap<Integer, Integer> mp=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//         if(mp.containsKey(nums[i])){
//             mp.put(nums[i],mp.get(nums[i])+1);
//         }
//         else{
//             mp.put(nums[i],1);
//         }

//        }
//        for(int Key:mp.keySet()){
//           if(mp.get(Key)>(size/2)){
//             return Key;
//           }
//        }
//        return -1;
//     }
// }

//Most optimized solution Using Voting algor

class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(candidate==nums[i]){
                count++;
            }else if(count==0){
                candidate=nums[i];
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
