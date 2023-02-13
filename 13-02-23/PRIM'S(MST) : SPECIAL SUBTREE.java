// GRAPHS 

// Prim's (MST) : Special Subtree



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Pair implements Comparable<Pair>{
    int distance,destination;
    Pair(int distance,int destination){
        this.distance=distance;
        this.destination=destination;
    }
    public int compareTo(Pair a){
        return distance-a.distance;
    }
}
class Result {
    public static int prims(int n, List<List<Integer>> edges, int start) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.size();i++){
            int vertex1=edges.get(i).get(0);
            int vertex2=edges.get(i).get(1);
            int distance=edges.get(i).get(2);
            adj.get(vertex1-1).add(new Pair(distance,vertex2-1));
            adj.get(vertex2-1).add(new Pair(distance,vertex1-1));
        }
        HashSet<Integer> visited = new HashSet<>();
        PriorityQueue<Pair> queue =new PriorityQueue<>();
        int result=0;
        int key[] = new int[n];
        for (int i=0;i<n;i++) key[i]=Integer.MAX_VALUE;
        key[start-1]=0;
        queue.offer(new Pair(0,start-1));
        while(!queue.isEmpty())
        {
            Pair current=queue.poll();
            int u=current.destination;
            int w=current.distance;
            if (visited.contains(u)) continue;
            visited.add(u);
            result+=w;
            if (visited.size()==n) return result;
            for(Pair neighbour:adj.get(u)){
                int v=neighbour.destination;
                int dis=neighbour.distance;
                if(!visited.contains(v) && dis<key[v]){
                    key[v]=dis;
                    queue.add(new Pair(dis,v));
                }
            }
        }
        return -1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> edges = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                edges.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int start = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.prims(n, edges, start);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
