//Find two lines that together with the x-axis form a container, such that the biggest container is formed.

class Solution {
    public int maxArea(int[] height) {

        int max = 0;
        int i=0, j=height.length-1;
        while(i<j)
        {
            if(Math.min(height[i],height[j])*(j-i) > max)
            {
                max = Math.min(height[i],height[j])*(j-i);
            }

            if(height[i]>height[j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }

        return max;
    }
}
