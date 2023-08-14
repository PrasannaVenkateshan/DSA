//Given an integer array nums and an integer k, return the k most frequent elements.

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, new SortbyValue());

        //Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
        //    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
        //    {
        //        return -(o1.getValue().compareTo(o2.getValue()));
        //    } 
        //});

        int size = list.size();
        for(int i=0;i<size;i++)
        {
            System.out.print(list.get(i).getKey()+ " ");
        }
        for(int i=0;i<size && i<k;i++)
        {
            ans[i] = list.get(i).getKey();
        }

        return ans;

    }

}

class SortbyValue implements Comparator<Map.Entry<Integer, Integer>> {
        public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b)
        {
            return b.getValue() - a.getValue();
        }
    }
