class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s= String.valueOf(x);
        
        int k=s.length();
        for (int i=0;i<k/2+1;i++){
            if(s.charAt(i)!=s.charAt(k-1-i)){
                return false;
            }
            
        }
        return true;
        
    }
}