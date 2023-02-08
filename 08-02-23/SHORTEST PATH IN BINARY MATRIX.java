// GRAPHS 

// SHORTEST PATH IN BINARY MATRIX 

// SOLUTION IN JAVA 


class Pair{
    int dis,row,col;
    Pair(int dis,int row,int col){
        this.dis=dis;
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        if(grid[0][0]!=0  || grid[cols-1][cols-1]!=0) return -1;
        if(grid[0][0]==0 && rows==1) return 1;
        int dist[][]=new int[rows][cols];
        for(int[] row:dist) Arrays.fill(row,Integer.MAX_VALUE);
        int[][] offsets=new int[][]{{0,1},{1,0},{0,-1},{-1,0},{1,-1},{1,1},{-1,-1},{-1,1}};
        dist[0][0]=0;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(1,0,0));
        while(!q.isEmpty()){
            int dis=q.peek().dis;
            int row=q.peek().row;
            int col=q.peek().col;
            q.poll();
            for(int[] d:offsets){
                int nextr=row+d[0],nextc=col+d[1];
                if(nextr>=0 && nextr<rows && nextc>=0 && nextc<cols && grid[nextr][nextc]==0 && dis+1<dist[nextr][nextc]){
                    if(nextr==rows-1 && nextc==rows-1) return dis+1;  
                    q.add(new Pair(dis+1,nextr,nextc));
                    dist[nextr][nextc]=dis+1;
                }
            }   
        }
        return -1;
    }
}
