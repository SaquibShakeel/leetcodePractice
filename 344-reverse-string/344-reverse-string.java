class Solution {
    public void reverseString(char[] s) {
        swap(s, 0, s.length-1);
    }
    
    void swap(char[] c, int first, int second){
        if(first>=second)return;
        char temp = c[first];
        c[first] = c[second];
        c[second] = temp;
        swap(c, first+1, second-1);
    }
    
}