class Solution {
    public int longestPalindrome(String s) {
        int[] lower = new int[26];
        int upper[] = new int[26];
        int count = 0;
        boolean isOdd = false;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z'){
                lower[ch-'a']+=1;
            }
            if(ch>='A' && ch <='Z'){
                upper[ch-'A']+=1;
            }
        }
        for(int i=0;i<26;i++){
            if(lower[i]%2 == 0){
                count+=lower[i];
            }
            else{
                isOdd = true;
                count=count+lower[i]-1;
            }
              if(upper[i]%2 == 0){
                count+=upper[i];
            }
            else{
                isOdd = true;
                count=count+upper[i]-1;
            }
        }
        if(isOdd) count+=1;
        return count;
    }
}