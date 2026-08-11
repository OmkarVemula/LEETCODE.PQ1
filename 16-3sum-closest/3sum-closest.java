class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int closest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {

            int st = i + 1;
            int end = nums.length - 1;

            while (st < end) {

                int sum = nums[i] + nums[st] + nums[end];

                // Difference from target
                int diff = sum - target;

                // Update closest answer
                if (Math.abs(diff) < Math.abs(closest)) {
                    closest = diff;
                }

                // If exact answer found
                if (sum == target) {
                    return sum;
                }

                // Move pointers
                if (sum < target) {
                    st++;
                } else {
                    end--;
                }
            }
        }

        return target + closest;
    }
}