class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int lastSpace=s.lastIndexOf(" ");
        int lastWord=s.length()-lastSpace-1;
        
    return lastWord;
        
    }
}