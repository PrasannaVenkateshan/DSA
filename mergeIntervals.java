class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new java.util.Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }});
        int rows=intervals.length;
        int cols=intervals[0].length;
        int[][] result = new int[rows][cols];
        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];
        int last = 0;
        for(int i=1;i<rows;i++)
        {
            if((intervals[i][1]>=result[last][0])&&(intervals[i][0]<=result[last][1]))
            {
                result[last][1] = Math.max(intervals[i][1], result[last][1]);
            }
            else
            {
                last++;
                result[last][0] = intervals[i][0];
                result[last][1] = intervals[i][1];
            }
        }
        int s=rows;
        for(int i=0;i<rows;i++)
        {
            if(result[i][0]==0 && i!=0)
            {
                s=i;
                break;
            }
        }
        int[][] res= new int[s][2];
        for(int i=0;i<s;i++)
        {
            res[i][0] = result[i][0];
            res[i][1] = result[i][1];
        }
        return res;
    }
}
