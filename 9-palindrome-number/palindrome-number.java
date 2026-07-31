class Solution {
    public boolean isPalindrome(int x) {
        String s= String.valueOf(x);
        boolean bol=false;
        for (int i=0;i<s.length()/2+1;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                bol=true;
            }
            else{return false;
            }

        }
        return bol;
        
    }
}