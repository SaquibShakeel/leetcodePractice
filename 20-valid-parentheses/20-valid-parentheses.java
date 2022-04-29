class Solution {
    public boolean isValid(String s) {
        
        // if(s.length()%2 != 0) return false;
        double count = 0;
        
        List<Character> c = new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                c.add(s.charAt(i));
                count++;
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
        if(c.size() != 0 && count != s.length()/2.0) return false;
        return true;
    }
    
}