class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        int st = 0;
        int end = sb.length() - 1;

        while (st < end) {
            if (sb.charAt(st) != sb.charAt(end)) {
                return false;
            }

            st++;
            end--;
        }

        return true;
    }
}