//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;
        int[] ans = new int[2];
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], i);
        }
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                ans[0] = i;
                ans[1] = map.get(target-nums[i]);
                if(ans[0]!=ans[1])
                {
                    break;
                }
            }
        }
        return ans;
    }
}
