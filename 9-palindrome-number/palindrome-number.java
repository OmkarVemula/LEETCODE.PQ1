class Solution {
    public boolean isPalindrome(int x) {
        boolean y=true;
        String s= String.valueOf(x);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= s.charAt(s.length()-(i+1))){
                y=false;
                return y;
            }

        }
        return y;
    }
}