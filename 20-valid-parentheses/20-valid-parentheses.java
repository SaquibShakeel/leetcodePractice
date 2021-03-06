class Solution {
    public boolean isValid(String s) {
        
        
        List<Character> c = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                c.add(s.charAt(i));
            }
            else {
                if(c.size() == 0) return false;
                if(s.charAt(i) == ')') {
                    if(c.get(c.size()-1) == '(') c.remove(c.size()-1);
                    else return false;
                }
                else if(s.charAt(i) == '}') {
                    if(c.get(c.size()-1) == '{') c.remove(c.size()-1);
                    else return false;
                }
                else if(s.charAt(i) == ']') {
                    if(c.get(c.size()-1) == '[') c.remove(c.size()-1);
                    else return false;
                }
            }
        }
        if(c.size() != 0 ) return false;
        return true;
    }
    
}