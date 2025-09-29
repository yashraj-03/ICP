public class number_of_island {
    class Solution {
        public int numIslands(char[][] grid) {
            if(grid==null || grid.length==0){
                return 0;
            }
            int cnt=0;
            int m=grid.length;
            int n=grid[0].length;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(grid[i][j]=='1'){
                        cnt++;
                        dfs(grid,i,j);
                    }
                }
            }
            return cnt;
        }
        public void dfs(char[][] grid, int i, int j){
            int m=grid.length;
            int n=grid[0].length;
            if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0'){
                return;
            }
            grid[i][j]='0';
            int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
            for(int[] dir: dirs){
                dfs(grid, i+dir[0], j+dir[1]);
            }
        }
    }
}