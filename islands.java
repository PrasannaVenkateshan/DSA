//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];

        return DFSUtil(grid, visited, n, m);
    }

    public int DFSUtil(char[][] grid, int[][] visited, int n, int m)
    {
        int ans = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1' && visited[i][j]==0)
                {
                    DFS(i,j,m,n,visited,grid);
                    ans = ans+1;
                }
            }
        }

        return ans;
    }

    public void DFS(int i, int j, int m, int n, int[][] visited, char[][] grid)
    {
        if(i>=m || i<0 || j>=n || j<0)
        {
            return;
        }
        if(visited[i][j]!=1)
        {
            visited[i][j] = 1;
            if(i+1>=0 && i+1 <m && grid[i+1][j]=='1')
            {
                DFS(i+1,j,m,n,visited,grid);
            }
            if(j+1>=0 && j+1<n && grid[i][j+1]=='1')
            {
                DFS(i,j+1,m,n,visited,grid);
            }
            if(i-1>=0 && i-1 <n && grid[i-1][j]=='1')
            {
                DFS(i-1,j,m,n,visited,grid);
            }
            if(j-1>=0 && j-1<n && grid[i][j-1]=='1')
            {
                DFS(i,j-1,m,n,visited,grid);
            }
        }
    }
}
