// GRAPHS 

// DETECT CYCLES IN 2D GRID 

// SOLUTION IN JAVA 

class Solution {
    int rows,cols;
    boolean[][] visited;
    int[][] offsets=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public boolean containsCycle(char[][] grid){
        rows=grid.length;
        cols=grid[0].length;
        visited=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(!visited[i][j] && bfs(grid,i,j,-1,-1)) return true;
            }
        }
        return false;
    }
    private boolean bfs(char[][] grid,int i,int j,int x,int y){
        char c=grid[i][j];
        Queue<int[]> q=new LinkedList<>();
        visited[i][j] = true;
        q.offer(new int[]{i, j, x, y});
        while(!q.isEmpty()){
            for(int k=0;k<q.size();k++){
                int curr[]=q.poll();
                for(int[] d:offsets) {
                    int row=curr[0]+d[0],col=curr[1]+d[1];
                    if(row<0 || row>=rows || col<0 || col>=cols || grid[row][col] !=c) continue;
                    if(row==curr[2] && col==curr[3]) continue;
                    if(visited[row][col]) return true;
                    q.offer(new int[]{row,col,curr[0],curr[1]});
                    visited[row][col] = true;
                }
            }
        }
        return false;
    }
}
