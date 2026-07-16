class Solution {
    public boolean checkIfPangram(String s) {
        int[] seen = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            seen[ch-'a'] = 1;
        }
        for(int i=0;i<26;i++){
            if(seen[i] == 0) return false;
        }
        return true;
    }
}