class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())return new ArrayList<>();
        return numPad("", digits);
    }
    
    ArrayList<String> numPad (String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        
        ArrayList<String> list = new ArrayList<>();
        int s = (digit - 2)*3;
        int e = (digit - 1)*3;
        if(digit == 7){
            s = 15;
            e = 19;
        }
        else if(digit == 8){
            s = 19;
            e = 22;
        }
        else if(digit == 9){
            s = 22;
            e = 26;
        }
        for(int i = s; i < e; i++) {
            char ch = (char)('a' + i);
            list.addAll(numPad(p + ch, up.substring(1)));
        }
        return list;
    }
}