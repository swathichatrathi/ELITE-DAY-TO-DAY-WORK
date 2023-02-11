// GRAPHS

// DETECT CYCLE IN AN UNDIRECTED GRAPH


//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

class Pair{
    int s,p;
    Pair(int s,int p){
        this.s=s;
        this.p=p;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited=new boolean[n];
        Arrays.fill(visited,false);
        int[] parent=new int[n];
        Arrays.fill(parent,-1);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(check(i,adj,visited,parent)){
                    return true;
                }
            }
        }
        return false;
    }
    public  boolean check(int s,ArrayList<ArrayList<Integer>> adj,boolean[] visited,int[] parent ){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(s,-1));
        visited[s] =true;
        while(!q.isEmpty())
        {
           int curr=q.peek().s;
           int par=q.peek().p;
           q.poll(); 
           for(int nei:adj.get(curr))
           {
               if(!visited[nei])  
               {
                   q.add(new Pair(nei,curr));
                   visited[nei]=true; 
               }
               else if(par!=nei) return true;
           }
       }
       return false;
    }  
}
