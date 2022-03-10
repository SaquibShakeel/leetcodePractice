class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Integer[] reqFreq = new Integer['z'+1];
        int uniq = 0;
        for(int i=0; i < s1.length(); i++){            
            char ch = s1.charAt(i);
            if(reqFreq[ch] == null){
                reqFreq[ch] = 0;
                uniq++;
            }
            reqFreq[ch]++;
        }
        
        for(int i = 0, j = 0; j < s2.length(); j++){
            char ch = s2.charAt(j);
            if(reqFreq[ch] != null){
                --reqFreq[ch];
                if(reqFreq[ch] == 0)
                    --uniq;
            }
            
            while(uniq == 0 && i <= j){
                if(j-i+1 == s1.length())
                    return true;
                if(reqFreq[s2.charAt(i)] != null){
                    ++reqFreq[s2.charAt(i)];
                    if(reqFreq[s2.charAt(i)] == 1)
                        ++uniq;
                }
                ++i;
            }
        }
        
        return false;
    }
}