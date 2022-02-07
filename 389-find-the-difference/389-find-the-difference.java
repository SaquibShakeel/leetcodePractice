class Solution {
    public char findTheDifference(String s, String t) {
        char[] a = sortChar(s);
        char[] b = sortChar(t);
        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i])return b[i];
        }
        return b[b.length -1];
    }
    
    char[] sortChar(String a){
        char[] ch = new char[a.length()];
        for(int i=0; i<a.length(); i++){
            ch[i] = a.charAt(i);
        }
        Arrays.sort(ch);
        return ch;
    }
    
}