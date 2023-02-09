// GRAPHS 

// MINIMUM TIME FOR SPOILING 

// HACKERRANK SOLUTION IN JAVA 

import java.io.*;
import java.util.*;

class Tuple{
    int val,row,col;
    Tuple(int row,int col){
        this.row=row;
        this.col=col;
        val=2;
    }
}
public class Solution {
    public static int orangesRotting(int[][] grid) {
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
        int[][] offsets={{-1,0},{0,1},{1,0},{0,-1}};
        int time=-1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=1;i<=size;i++){
                Tuple curr=q.poll();
                int r=curr.row;
                int c=curr.col;
                for(int[] d:offsets){
                    int nextr=r+d[0];
                    int nextc=c+d[1];
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
        System.out.print(orangesRotting(grid));
    }
}
