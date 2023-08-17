//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

class Solution {
    public boolean isValid(String s) {

        Stack st =  new Stack();
        int i=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(s.charAt(i) == ')')
                {
                    if(st.empty() || !(st.pop().equals('(')))
                    {      
                        return false;
                    }
                }
                else if(s.charAt(i) == ']')
                {
                    if(st.empty() || !(st.pop().equals('[')))
                    {
                        return false;
                    }
                }
                else if(s.charAt(i) == '}')
                {
                    if(st.empty() || !(st.pop().equals('{')))
                    {
                        return false;
                    }
                }
                
            }
        }

        if(!st.empty())
        {
            return false;
        }

        return true;
        
    }
}
