class Solution {
    static void dfs(char[][] grid,int x,int y,boolean[][] vis,int n,int m){
        for(int i=Math.max(x-1,0);i<=Math.min(x+1,n-1);i++){
            for(int j=Math.max(y-1,0);j<=Math.min(y+1,m-1);j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                if(i==x || j==y){
                    vis[i][j]=true;
                    dfs(grid,i,j,vis,n,m);

                }
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
      int n=grid.length;
      int m=grid[0].length;
      boolean[][] vis=new boolean[n][m];
      int count=0;
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(!vis[i][j] && grid[i][j]=='1'){
                count++;
                dfs(grid,i,j,vis,n,m);
            }
        }
      }  
      return count;
    }
}