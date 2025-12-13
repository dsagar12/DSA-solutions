class Solution {
    // public int[] twoSum(int[] numbers, int target) {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<numbers.length;i++){
    //         int complement=target-numbers[i];
    //         if(map.containsKey(complement)){
    //             return new int[]{map.get(complement),i+1};
    //         }
    //         map.put(numbers[i],i+1);
    //     }
    //     return new int[]{-1,-1};
    // }
     public int[] twoSum(int[] numbers, int target) {
       int st=0;
       int end=numbers.length-1;
       int sum=0;
       while(st<end){
            sum=numbers[st]+numbers[end];
            if(sum==target){
                return new int[]{st+1,end+1};
            }else if(sum<target){
                st++;
            }else{
                end--;
            }
       }
       return new int[]{-1,-1};
    }

}