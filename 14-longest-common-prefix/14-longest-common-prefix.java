class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        for(int i=0; i<minsize(strs);i++){
            char check = strs[0].charAt(i);
            int count = 0;
            for(String s: strs){
                if(s.charAt(i)!=check)return ans;
                count++;
            }
            if(count==strs.length)ans+=check;
        }
        return ans;
    }
    int minsize(String[] s){
        int ans=s[0].length();
        for(int i=1; i<s.length; i++){
            if(s[i].length()<ans)ans=s[i].length();
        }
        return ans;
    }
}