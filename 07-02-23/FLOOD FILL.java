// GRAPHS 

// FLOOD FILL 

// SOLUTION IN JAVA 

class Tuple{
    int val,row,col,color;
    Tuple(int row,int col,int val,int color){
        this.row=row;
        this.col=col;
        this.val=val;
        this.color=color;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows=image.length;
        int columns=image[0].length;
        //int[][] res=new int[rows][columns];
        Queue<Tuple> q=new LinkedList<>();
        int main=image[sr][sc];
        q.add(new Tuple(sr,sc,main,color));
        image[sr][sc]=color;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(image[i][j]==color){
                    q.add(new Tuple(i,j,color,color));
                }
            }
        }
        if(q.isEmpty()) return image;
        int[] offsetr={-1,0,1,0};
        int[] offsetc={0,1,0,-1};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=1;i<=size;i++){
                Tuple curr=q.poll();
                int r=curr.row;
                int c=curr.col;
                int temp=curr.val;
                for(int j=0;j<4;j++){
                    int nextr=r+offsetr[j];
                    int nextc=c+offsetc[j];
                    if(nextr<0 || nextc<0 || nextr>=rows || nextc>=columns) continue;
                    if(image[nextr][nextc]!=color && image[nextr][nextc]==temp){
                        q.add(new Tuple(nextr,nextc,image[nextr][nextc],color));
                        image[nextr][nextc]=color;
                    }
                }
            }
        }
        return image;
    }
}
