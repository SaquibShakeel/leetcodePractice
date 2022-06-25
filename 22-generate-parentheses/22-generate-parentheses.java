class Solution {
    public List<String> generateParenthesis(int n) {
        return helper(n, "(", 1, 0);
    }
    
    List<String> helper(int n, String s,int o, int c) {
        if(n <= 1){
            List<String> list = new ArrayList<>();
            String a = complete(s);
            list.add(a);
            return list;
        }
        char open = '(';
        char close = ')';
        
        List<String> ans = new ArrayList<>();
        
        ans.addAll(helper(n-1, s + open, o+1, c));
        if(o > c){
            ans.addAll(helper(n, s + close, o, c+1));
        }
        return ans;
    }
    
    String complete(String s) {
        char ch = ')';
        int open = 0;
        int close = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')open++;
            else close++;
        }
        for(int i = 0; i < open - close; i++) {
            s = s + ch;
        }
        return s;
    }
    
}