// GRAPHS 

// SWIM IN RAISING WATER 

class Pair implements Comparable<Pair>{
    int row,col,time;
    Pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
    public int compareTo(Pair a){
        return time-a.time;
    }
}
class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        boolean [][]visited=new boolean [n][n];
        PriorityQueue<Pair> q=new PriorityQueue<>();
        int time=Math.max(grid[0][0],grid[n-1][n-1]);
        q.offer(new Pair(0,0,time));
        int[][] offsets={{-1,0},{0,1},{1,0},{0,-1}};
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int r=curr.row;
            int c=curr.col;
            time=Math.max(time,curr.time);
            for(int[] d:offsets){
                int nextr=r+d[0];
                int nextc=c+d[1];
                if(nextr>=0 && nextr<n && nextc>=0 && nextc<n && !visited[nextr][nextc]){
                    if(nextr==n-1 && nextc==n-1) return time;
                    q.offer(new Pair(nextr,nextc,grid[nextr][nextc]));
                    visited[nextr][nextc]=true;
                }
            }
        }
        return 0;
    }
}
