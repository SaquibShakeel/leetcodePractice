class Solution {
    public int romanToInt(String s) {
        
        // Creating array of string length
        char[] ch = new char[s.length()];
  
        // Copy character by character into array
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
       
        
        int ans = val(ch[0]);
        for(int i=1; i<s.length(); i++){
            if(val(ch[i-1]) < val(ch[i])){
                ans = ans + val(ch[i]) - 2*val(ch[i-1]);
            }else{
                ans+= val(ch[i]);
            }
        }
        return ans;
    }
    int val(char c){
        int ans =0;
        switch(c){
            case 'I':
                ans = 1;
                break;
            case 'V':
                ans = 5;
                break;
            case 'X':
                ans = 10;
                break;
            case 'L':
                ans = 50;
                break;
            case 'C':
                ans = 100;
                break;
            case 'D':
                ans = 500;
                break;
            case 'M':
                ans = 1000;
                break;
        }
        return ans;
    }
}