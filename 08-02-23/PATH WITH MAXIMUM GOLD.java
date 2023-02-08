// GRAPHS 

// PATH WITH MAXIMUM GOLD

// SOLUTION IN JAVA 

class Solution {
    int res=0;
    int[][] offsets=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    res=Math.max(res,helper(grid,i,j));
                }
            }
        }
        return res;
    }
    public int helper(int[][] grid,int row,int col){
        if(row<0 || row==grid.length || col<0 || col==grid[0].length || grid[row][col]==0) return 0;
        int start=grid[row][col];
        grid[row][col]=0;
        int res=0;
        for(int[] d:offsets){
            res=Math.max(res,helper(grid,d[0]+row,d[1]+col));
        }
        grid[row][col]=start;
        return res+start;
    }
}
