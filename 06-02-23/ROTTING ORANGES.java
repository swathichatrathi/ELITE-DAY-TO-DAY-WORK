// GRAPHS 

// ROTTING ORANGES 

class Tuple{
    int val,row,col;
    Tuple(int row,int col){
        this.row=row;
        this.col=col;
        val=2;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        int fresh=0;
        Queue<Tuple> q=new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j]==2){
                    q.add(new Tuple(i,j));
                }
                if(grid[i][j]==1){
                    fresh++;
                } 
            }
        }
        if(fresh==0) return 0;
        int[] offsetr={-1,0,1,0};
        int[] offsetc={0,1,0,-1};
        int time=-1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=1;i<=size;i++){
                Tuple curr=q.poll();
                int r=curr.row;
                int c=curr.col;
                for(int j=0;j<4;j++){
                    int nextr=r+offsetr[j];
                    int nextc=c+offsetc[j];
                    if(nextr<0 || nextc<0 || nextr>=rows || nextc>=columns) continue;
                    if(grid[nextr][nextc]==1){
                        q.add(new Tuple(nextr,nextc));
                        grid[nextr][nextc]=2;
                    }
                }
            }
            time=time+1;
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return time;
    }
}
