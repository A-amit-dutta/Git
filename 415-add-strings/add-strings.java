class Solution {
    public String addStrings(String num1, String num2) {
        if (num2.length() > num1.length())
            return addStrings(num2, num1);
        int idx1 = num1.length() - 1, idx2 = num2.length() - 1;
        String ans = new String();
        int carry = 0;
        while (idx2 >= 0) {
            int sum = (num1.charAt(idx1) - '0' + num2.charAt(idx2) - '0' + carry);
            char ch = (char) (48 + (sum % 10));
            carry = sum / 10;
            ans += ch;
            idx2--;
            idx1--;
        }
        while (idx1 >= 0) {
            int sum = (num1.charAt(idx1) - '0' + carry);
            char ch = (char) (48 + (sum % 10));
            carry = sum / 10;
            ans += ch;
            idx1--;
        }
        if (carry == 1)
            ans += 1;
        ans = new StringBuilder(ans).reverse().toString();
        return ans;
    }
}