class Solution {
    public int maxAdjacentDistance(int[] nums) {
       int n = nums.length;
       int maxdiff = Math.abs(nums[0]-nums[n-1]);
       for(int i = 1; i < n; i++) {
        maxdiff = Math.max(maxdiff, Math.abs(nums[i] - nums[i-1]));
       } 
       return maxdiff;
    }
}
