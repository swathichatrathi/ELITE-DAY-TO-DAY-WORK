// GRAPHS 

// NUMBER OF ISLANDS 

// SOLUTION IN JAVA 

class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        int visited[][]=new int[rows][columns];
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(visited[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    BFS(i,j,grid,visited);
                }
            }
        }
        return count;
    }
    public void BFS(int row,int col,char[][] grid,int visited[][]){
        visited[row][col]=1;
        Queue<Pair>q=new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;
        int offsetr[]={-1,1,0,0};
        int offsetc[]={0,0,1,-1};
        while(!q.isEmpty()){
            int nrow=q.peek().first;
            int ncol=q.peek().second;
            q.poll();
            for(int i=0;i<4;i++){
                int nextr=nrow+offsetr[i];
                int nextc=ncol+offsetc[i];
                if(nextr>=0 && nextr<n && nextc>=0 && nextc<m && visited[nextr][nextc]==0 && grid[nextr][nextc]=='1'){
                    visited[nextr][nextc]=1;
                    q.add(new Pair(nextr,nextc));
                }
            }
        }
    }
}
