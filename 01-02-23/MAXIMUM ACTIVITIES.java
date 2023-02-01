// MAXIMUM ACTIVITIES 

// SOLUTION IN JAVA 

import java.util.* ;
import java.io.*; 
class Pair{
    int start;
    int end;
    int pos;
    Pair(int start,int end,int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
class Sort implements Comparator<Pair>
{
    public int compare(Pair p1, Pair p2) 
    {
        if (p1.end < p2.end)
            return -1;
        else if (p1.end > p2.end)
            return 1;
        else if(p1.pos < p2.pos)
            return -1;
        return 1; 
    }
}
public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {      
        ArrayList<Pair> meetings = new ArrayList<>();
        for(int i=0;i<start.size();i++)
            meetings.add(new Pair(start.get(i), end.get(i), i+1));
        Sort meetingsaftersorted = new Sort(); 
        Collections.sort(meetings, meetingsaftersorted); 
        int count=1;
        int condition = meetings.get(0).end; 
        for(int i=1;i<start.size();i++) {
            if(meetings.get(i).start>=condition) {
                condition=meetings.get(i).end; 
                count++;
            }
        }
        return count;
    }
}
