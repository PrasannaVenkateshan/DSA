//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.

class Solution {

    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        int i=0, j=s.length()-1;
        while(i<=j)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
            }
            else {
                if(!(s.charAt(i) == s.charAt(j)))
                {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }
}
