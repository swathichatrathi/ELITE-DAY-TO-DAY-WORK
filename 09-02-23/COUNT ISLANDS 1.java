// GRAPHS 

// COUNT ISLANDS 1 

// HACKERRANK SOLUTION IN JAVA 

import java.io.*;
import java.util.*;

class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] grid = new int[rows][cols];
        for (int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.print(numIslands(grid));
    }
    public static int numIslands(int[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        int visited[][]=new int[rows][columns];
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(visited[i][j]==0 && grid[i][j]==1){
                    count++;
                    BFS(i,j,grid,visited);
                }
            }
        }
        return count;
    }
    public static void BFS(int row,int col,int[][] grid,int visited[][]){
        visited[row][col]=1;
        Queue<Pair>q=new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;
        int[][] offsets={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        while(!q.isEmpty()){
            int nrow=q.peek().row;
            int ncol=q.peek().col;
            q.poll();
            for(int[] d:offsets){
                int nextr=nrow+d[0],nextc=ncol+d[1];
                if(nextr>=0 && nextr<n && nextc>=0 && nextc<m && visited[nextr][nextc]==0 && grid[nextr][nextc]==1){
                    visited[nextr][nextc]=1;
                    q.add(new Pair(nextr,nextc));
                }
            }
        }
    }
}
