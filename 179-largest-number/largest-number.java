class Solution {
    public String largestNumber(int[] nums) {
        String[] elements=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            elements[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(elements,(a,b)->(b+a).compareTo(a+b));
        if (elements[0].equals("0")) {
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append(elements[i]);
        }
        return sb.toString();
    }
}