class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int y =height.length-1;
        int ans=0;
        while(st<y){
            if(height[st]>height[y]){
                ans = Math.max(ans,height[y]*(y-st));
                y--;
            }
            else{
                ans = Math.max(ans,height[st]*(y-st));
                st++;
            }


        }
        return ans;
    }
}
