class Solution {
    public boolean isPalindrome(int x) {
        if(x>0){
            ArrayList<Integer> nums = new ArrayList<Integer>();
            while(x!=0){
                nums.add(x%10);
                x=x/10;
            }
            int n = nums.size();
            for(int i=0; i<=n/2; i++){
                if(nums.get(i)!=nums.get(n-1-i))return false;
            }
            return true;
        }
        else if(x==0)return true;
        else return false;
    }
}