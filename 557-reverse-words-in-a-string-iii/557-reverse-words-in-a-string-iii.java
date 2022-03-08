class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i=0; i<words.length; i++) {
            char[] ch = words[i].toCharArray();
            swap(ch, 0, ch.length-1);
            String t = new String(ch);
            words[i]=t;
        }
        String ans = String.join(" ", words);
        return ans;
    }
    void swap(char[] c, int first, int second){
        if(first>=second)return;
        char temp = c[first];
        c[first] = c[second];
        c[second] = temp;
        swap(c, first+1, second-1);
    }
}