class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        if(nums.length<1)return ans;
        int a = nums[0];
        int b = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]+1){
                b = nums[i-1];
                if(a==b){
                    ans.add(b+"");
                }
                else{
                    ans.add(a+"->"+b);
                }
                a = nums[i];
            }
        }
        b = nums[nums.length-1];
        if(a==b){
            ans.add(b+"");
        }
        else{
            ans.add(a+"->"+b);
        }
        return ans;
    }
}