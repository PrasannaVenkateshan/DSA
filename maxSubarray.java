//Given an integer array nums, find the subarray with the largest sum, and return its sum

class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int max = nums[0];
        for(int i=1;i<length;i++)
        {
            dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
            if(max < dp[i])
            {
                max = dp[i];
            }
        }
        return max;
    }
}
