// GRAPHS 

// 01 MATRIX 

// SOLUTION IN JAVA 

class Pair{
    int row,col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution {
    int rows,cols;
    boolean[][] visited;
    int[][] offsets=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    Queue<Pair> q=new LinkedList<>();
    public int[][] updateMatrix(int[][] mat){
        rows=mat.length;
        cols=mat[0].length;
        int[][] res=new int[rows][cols];
        for (int[] row:res) Arrays.fill(row,Integer.MAX_VALUE);
        visited=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==0){
                    res[i][j] = 0;
                    q.add(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int r=curr.row;
            int c=curr.col;
            for(int[] d:offsets) {
                int nextr=curr.row+d[0],nextc=curr.col+d[1];
                if(nextr<0 || nextc<0 || nextr>=rows || nextc>=cols) continue;
                if(res[nextr][nextc]>res[curr.row][curr.col]+1){
                        res[nextr][nextc]=res[curr.row][curr.col]+1;
                        q.add(new Pair(nextr,nextc));
                }
            }
        }
        return res;
    }
}
