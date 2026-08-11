class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> Mlist = new ArrayList<>();
        Arrays.sort(nums);
        if (nums[0] > 0 || nums[nums.length-1] < 0) return Mlist;
        for (int i=0; i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int st=i+1;
            int end =nums.length-1;
            
            while (st<end){
                ArrayList<Integer> list = new ArrayList<>();
             if (nums[i]+nums[st]+nums[end]<0){
                st++;
             }
             else if(nums[i]+nums[st]+nums[end]>0){
                end--;
             }
             else{
                list.add(nums[i]);
                list.add(nums[st]);
                list.add(nums[end]);
                Mlist.add(list);
                st++;
                end--;
                while (st < end && nums[st] == nums[st - 1]) {
                    st++;
                    }
                    while (st < end && nums[end] == nums[end + 1]) {
                        end--;
                        }
                
                

             }
            }
        }
        return Mlist;
    }
}