import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        while(in.hasNext()){
            int a=in.nextInt();
            if(!map.containsKey(a))
                map.put(a,1);
            else
                map.put(a,map.get(a)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            list.add(entry.getValue());
        Collections.sort(list);
        int c=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<=n){
                n-=list.get(i);
            }
            else
                c++;
        }
        System.out.println(c);
    }   
}
