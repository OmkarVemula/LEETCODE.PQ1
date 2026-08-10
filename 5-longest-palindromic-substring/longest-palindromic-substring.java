class Solution {
    public String longestPalindrome(String s) {
         int st = 0;
        int end = s.length() - 1;
        String a = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {

            end = s.length() - 1;

            while (i <= end) {

                st = i;
                int ends = end;

                while (st < ends && s.charAt(st) == s.charAt(ends)) {
                    st++;
                    ends--;
                }

                if (st >= ends) {
                    if (a.length() < end - i + 1) {
                        a = s.substring(i, end + 1);
                    }
                }

                end--;
            }
        }

        return a;
    }
}