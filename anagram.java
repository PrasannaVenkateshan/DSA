//Given two strings s and t, return true if t is an anagram of s, and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        int n1 = s.length();
        int n2 = t.length();

        for(int i=0;i<n1;i++)
        {
            if(!map1.containsKey(s.charAt(i)))
            {
                map1.put(s.charAt(i),1);
            }
            else
            {
                int temp = map1.get(s.charAt(i));
                map1.put(s.charAt(i), temp+1);
            }
        }

        for(int i=0;i<n2;i++)
        {
            if(!map2.containsKey(t.charAt(i)))
            {
                map2.put(t.charAt(i),1);
            }
            else
            {
                int temp = map2.get(t.charAt(i));
                map2.put(t.charAt(i), temp+1);
            }
        }

        if(map1.equals(map2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
