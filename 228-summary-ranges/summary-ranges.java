class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0;
        int start=0;
        int n=nums.length;
        List<String> list=new ArrayList<>();
        while(i<n){
            while(i+1<n&&nums[i+1] == nums[i] + 1){
                i++;
            }
            String str="";
            if(nums[i]==nums[start]){
                str=Integer.toString(nums[i]);
                list.add(str);
            }else{
                str=Integer.toString(nums[start])+"->"+Integer.toString(nums[i]);
                list.add(str);
            }
            start=i+1;
            i++;
        }
        return list;
    }
}