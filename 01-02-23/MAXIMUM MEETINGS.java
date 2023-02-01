// MAXIMUM MEETINGS 

//SOLUTION IN JAVA 

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
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        ArrayList<Pair> meetings = new ArrayList<>();
        for(int i=0;i<start.length;i++)
            meetings.add(new Pair(start[i], end[i], i+1));
        Sort meetingsaftersorted = new Sort(); 
        Collections.sort(meetings, meetingsaftersorted); 
        ArrayList<Integer> result = new ArrayList<>();
        result.add(meetings.get(0).pos);
        int condition = meetings.get(0).end; 
        for(int i=1;i<start.length;i++) {
            if(meetings.get(i).start>condition) {
                condition=meetings.get(i).end; 
                result.add(meetings.get(i).pos);
            }
        }
        return result;
    }
}
