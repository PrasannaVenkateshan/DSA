//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int n = nums.length;

        Arrays.sort(nums);
        int i,j,k,sum;
        for(i=0;i<n;i++)
        {
            j=i+1;k=n-1;
            sum = -1*nums[i];
            while(j<k && j<n && k>=0)
            {
                if(nums[j]+nums[k]<sum)
                {
                    j++;
                }
                else if(nums[j]+nums[k]>sum)
                {
                    k--;
                }
                else if(nums[j]+nums[k]==sum)
                {
                    String str = nums[i] + ":" + nums[j] + ":" + nums[k];
                    if(!map.containsKey(str))
                    {
                        map.put(str,1);
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);temp.add(nums[j]);temp.add(nums[k]);
                        ans.add(temp);
                    }
                    j++;k--;
                }
            }
        }
        return ans; 
    }
}
