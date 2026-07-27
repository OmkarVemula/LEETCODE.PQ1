class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int rev=0;
        int cons=x;
        while(cons!=0){
            int y = cons%10;
            rev=rev*10 + y;
            cons=cons/10;
        }
        
        return x==rev;
        
    }
}